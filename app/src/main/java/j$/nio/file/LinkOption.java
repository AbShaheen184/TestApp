package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class LinkOption implements OpenOption, CopyOption {
    public static final LinkOption NOFOLLOW_LINKS;
    public static final /* synthetic */ LinkOption[] a;

    public static LinkOption valueOf(String str) {
        return (LinkOption) Enum.valueOf(LinkOption.class, str);
    }

    public static LinkOption[] values() {
        return (LinkOption[]) a.clone();
    }

    static {
        LinkOption linkOption = new LinkOption("NOFOLLOW_LINKS", 0);
        NOFOLLOW_LINKS = linkOption;
        a = new LinkOption[]{linkOption};
    }
}
