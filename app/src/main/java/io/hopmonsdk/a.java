package io.hopmonsdk;

import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {
    public final /* synthetic */ int e;
    public final /* synthetic */ Hopmn y;
    public final /* synthetic */ Object z;

    public /* synthetic */ a(Hopmn hopmn, Object obj, int i) {
        this.e = i;
        this.y = hopmn;
        this.z = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.e) {
            case 0:
                this.y.lambda$showConsentWithAdsOption$2((Hopmn.ConsentChoiceCallback) this.z, dialogInterface, i);
                break;
            case 1:
                this.y.lambda$showConsentWithAdsOption$3((Hopmn.ConsentChoiceCallback) this.z, dialogInterface, i);
                break;
            case 2:
                this.y.lambda$showConsentWithAdsOption$4((Hopmn.ConsentChoiceCallback) this.z, dialogInterface, i);
                break;
            default:
                this.y.lambda$showConsentIfNeeded$0((Hopmn.ConsentCallback) this.z, dialogInterface, i);
                break;
        }
    }
}
