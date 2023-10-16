package x.trident.modular.dwb.consts;

/**
 * 缓存前缀
 *
 * @author Bryan.liang
 * @since 2023-10-08
 */
public enum CacheConst {
    /**
     * 缓存前缀
     */
    CSS_REDIS_KEY(1, "dwb_"),
    CSS_CTP_REDIS_KEY(2, "dwb");

    private final int code;
    private final String msg;

    /**
     * @param code 信息ID
     * @param msg  信息内容
     */
    CacheConst(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }
}
