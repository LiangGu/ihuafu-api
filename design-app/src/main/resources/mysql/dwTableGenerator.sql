-- 主表：dw_design_record
CREATE TABLE dw_design_record (
                                  id INT PRIMARY KEY AUTO_INCREMENT,
                                  insert_user INT not null COMMENT '插入用户的ID',
                                  insert_time DATE not null COMMENT '插入时间'
) COMMENT '文生图记录表，包括param，页面录入的信息，document，result及记录本身的一些信息';

-- 主表：dw_param
CREATE TABLE dw_param (
                          id INT PRIMARY KEY AUTO_INCREMENT,
                          dw_design_record_id INT,
                          prompt VARCHAR(255) COMMENT '主提示词',
                          negative_prompt VARCHAR(255) COMMENT '反向提示词',
                          steps INT COMMENT '生成步数',
                          sampler_index VARCHAR(255) COMMENT '采样方法的索引',
                          cfg_scale INT COMMENT '关键词相关性',
                          seed INT COMMENT '随机数种子',
                          batch_size INT COMMENT '每次生成的图像数量',
                          n_iter INT COMMENT '生成批次',
                          width INT COMMENT '生成图像的宽度',
                          height INT COMMENT '生成图像的高度',
                          restore_faces BOOLEAN COMMENT '是否进行脸部修复',
                          tiling BOOLEAN COMMENT '是否可平埔',
                          enable_hr BOOLEAN COMMENT '是否启用高分辨率',
                          hr_upscaler VARCHAR(255) COMMENT '高分辨率的放大器',
                          sampler_name VARCHAR(255) COMMENT '采样方法的名称',
                          subseed INT COMMENT '子种子',
                          subseed_strength FLOAT COMMENT '子种子强度',
                          seed_resize_from_h INT COMMENT '种子从高度调整',
                          seed_resize_from_w INT COMMENT '种子从宽度调整',
                          do_not_save_samples BOOLEAN COMMENT '是否不保存样本',
                          do_not_save_grid BOOLEAN COMMENT '是否不保存网格',
                          eta INT COMMENT 'ETA值',
                          s_min_uncond FLOAT COMMENT '最小无条件s值',
                          s_churn FLOAT COMMENT 's churn值',
                          s_tmax FLOAT COMMENT 's最大时间',
                          s_tmin FLOAT COMMENT 's最小时间',
                          s_noise FLOAT COMMENT 's噪声',
                          override_settings_restore_afterwards BOOLEAN COMMENT '是否在之后恢复覆盖设置',
                          script_name VARCHAR(255) COMMENT '脚本名称',
                          send_images BOOLEAN COMMENT '是否发送图像',
                          save_images BOOLEAN COMMENT '是否保存图像',
                          denoising_strength FLOAT COMMENT '去噪强度',
                          firstphase_width INT COMMENT '第一阶段宽度',
                          firstphase_height INT COMMENT '第一阶段高度',
                          hr_scale INT COMMENT '高分辨率的缩放比例',
                          hr_second_pass_steps INT COMMENT '高分辨率的第二遍步骤',
                          hr_resize_x INT COMMENT '高分辨率的x方向调整大小',
                          hr_resize_y INT COMMENT '高分辨率的y方向调整大小',
                          hr_sampler_name VARCHAR(255) COMMENT '高分辨率的采样方法名称',
                          hr_prompt VARCHAR(255) COMMENT '高分辨率的提示词',
                          hr_negative_prompt VARCHAR(255) COMMENT '高分辨率的反向提示词',
                          insert_user INT not null COMMENT '插入用户的ID',
                          insert_time DATE not null COMMENT '插入时间',
                          FOREIGN KEY (dw_design_record_id) REFERENCES dw_design_record(id)
);

-- 中间表：dw_override_settings
CREATE TABLE dw_override_settings (
                                      id INT PRIMARY KEY AUTO_INCREMENT,
                                      dw_param_id INT,
                                      sd_model_checkpoint VARCHAR(255) COMMENT 'stable diffusion 模型',
                                      insert_user INT not null COMMENT '插入用户的ID',
                                      insert_time DATE not null COMMENT '插入时间',
                                      FOREIGN KEY (dw_param_id) REFERENCES dw_param(id)
);

-- 中间表：dw_styles
CREATE TABLE dw_styles (
                           id INT PRIMARY KEY AUTO_INCREMENT,
                           dw_param_id INT,
                           style VARCHAR(255) COMMENT '样式',
                           insert_user INT not null COMMENT '插入用户的ID',
                           insert_time DATE not null COMMENT '插入时间',
                           FOREIGN KEY (dw_param_id) REFERENCES dw_param(id)
);

-- 子表：dw_controlnet_param
CREATE TABLE dw_controlnet_param (
                                     id INT PRIMARY KEY AUTO_INCREMENT,
                                     dw_param_id INT,
                                     control_mode INT COMMENT '控制模式',
                                     enabled BOOLEAN COMMENT '是否启用',
                                     guidance_end FLOAT COMMENT '指导结束值',
                                     guidance_start FLOAT COMMENT '指导起始值',
                                     input_image TEXT COMMENT '输入图像的base64编码',
                                     lowvram BOOLEAN COMMENT '是否低显存模式',
                                     model VARCHAR(255) COMMENT '使用的模型名称',
                                     module VARCHAR(255) COMMENT '使用的模块名称',
                                     pixel_perfect BOOLEAN COMMENT '是否像素完美',
                                     processor_res INT COMMENT '处理器分辨率',
                                     resize_mode INT COMMENT '调整大小的模式',
                                     threshold_a FLOAT COMMENT '阈值A',
                                     threshold_b FLOAT COMMENT '阈值B',
                                     weight FLOAT COMMENT '权重',
                                     insert_user INT not null COMMENT '插入用户的ID',
                                     insert_time DATE not null COMMENT '插入时间',
                                     FOREIGN KEY (dw_param_id) REFERENCES dw_param(id)
);

-- 主表：dw_result
CREATE TABLE dw_result (
                           id INT PRIMARY KEY AUTO_INCREMENT,
                           dw_design_record_id INT,
                           parameters TEXT COMMENT '输入的请求体',
                           info TEXT COMMENT '返回的图片的信息',
                           insert_user INT not null COMMENT '插入用户的ID',
                           insert_time DATE not null COMMENT '插入时间',
                           FOREIGN KEY (dw_design_record_id) REFERENCES dw_design_record(id)
);

-- 子表：dw_images
CREATE TABLE dw_images (
                           id INT PRIMARY KEY AUTO_INCREMENT,
                           dw_result_id INT,
                           image_base64 TEXT COMMENT 'base64格式的图片数据',
                           insert_user INT not null COMMENT '插入用户的ID',
                           insert_time DATE not null COMMENT '插入时间',
                           FOREIGN KEY (dw_result_id) REFERENCES dw_result(id)
);

-- 主表：dw_document
CREATE TABLE dw_document (
                             id INT PRIMARY KEY AUTO_INCREMENT,
                             dw_design_record_id INT,
                             #                             owner_data_query_type_gid INT not null COMMENT '文件持有方类型ID',
                             #                             owner_object_gid INT not null COMMENT '文件持有方ID',
                             document_url VARCHAR(1000),
                             document_type VARCHAR(10) DEFAULT 'URL',
                             CHECK(document_type IN ('URL', 'SECURE URL', 'CLOB', 'BLOB', 'CMS', 'CMS URL')),
                             document_mime_type VARCHAR(500) not null COMMENT 'Multipurpose Internet Mail Extensions,例：image/jpeg: 用于JPEG图片。',
                             document_filename VARCHAR(1000) not null COMMENT '文件名称',
                             insert_user INT not null COMMENT '插入用户的ID',
                             insert_time DATE not null COMMENT '插入时间',
                             FOREIGN KEY (dw_design_record_id) REFERENCES dw_design_record(id)
) COMMENT '用户设计时上传的附件表';




