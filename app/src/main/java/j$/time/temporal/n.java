package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n implements m {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ n(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // j$.time.temporal.m
    public final l e(l lVar) {
        switch (this.a) {
            case 0:
                int iG = lVar.g(a.DAY_OF_WEEK);
                int i = this.b;
                if (iG == i) {
                    return lVar;
                }
                int i2 = iG - i;
                return lVar.d(i2 >= 0 ? 7 - i2 : -i2, ChronoUnit.DAYS);
            default:
                int iG2 = lVar.g(a.DAY_OF_WEEK);
                int i3 = this.b;
                if (iG2 == i3) {
                    return lVar;
                }
                int i4 = i3 - iG2;
                return lVar.a(i4 >= 0 ? 7 - i4 : -i4, ChronoUnit.DAYS);
        }
    }
}
