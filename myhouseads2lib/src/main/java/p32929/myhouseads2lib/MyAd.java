package p32929.myhouseads2lib;

public class MyAd {
    private String appIcon;
    private String url;

    public MyAd(String appIcon, String url) {
        this.appIcon = appIcon;
        this.url = url;
    }

    public String getAppIcon() {
        return appIcon;
    }

    public void setAppIcon(String appIcon) {
        this.appIcon = appIcon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}