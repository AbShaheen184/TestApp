package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x9 extends n5 {
    public final /* synthetic */ int d = 2;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(z9 z9Var, androidx.emoji2.text.f fVar) {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
        this.e = fVar;
    }

    @Override // com.google.android.gms.internal.measurement.n5
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        switch (this.d) {
            case 0:
                if (i != 2) {
                    return false;
                }
                Status status = (Status) o5.a(parcel, Status.CREATOR);
                byte[] bArrCreateByteArray = parcel.createByteArray();
                o5.d(parcel);
                com.google.android.gms.tasks.j jVar = (com.google.android.gms.tasks.j) this.e;
                if (status.e <= 0) {
                    try {
                        a1 a1Var = a1.a;
                        int i2 = o0.a;
                        _COROUTINE.b.G(status, tb.w(bArrCreateByteArray, a1.b), jVar);
                    } catch (t1 e) {
                        jVar.a(e);
                    }
                } else {
                    _COROUTINE.b.G(status, null, jVar);
                }
                return true;
            case 1:
                com.google.android.gms.tasks.j jVar2 = (com.google.android.gms.tasks.j) this.e;
                switch (i) {
                    case 1:
                        Status status2 = (Status) o5.a(parcel, Status.CREATOR);
                        o5.d(parcel);
                        _COROUTINE.b.G(status2, null, jVar2);
                        break;
                    case 2:
                        Status status3 = (Status) o5.a(parcel, Status.CREATOR);
                        o5.d(parcel);
                        _COROUTINE.b.G(status3, null, jVar2);
                        break;
                    case 3:
                        Status status4 = (Status) o5.a(parcel, Status.CREATOR);
                        o5.d(parcel);
                        _COROUTINE.b.G(status4, null, jVar2);
                        break;
                    case 4:
                        Status status5 = (Status) o5.a(parcel, Status.CREATOR);
                        q9 q9Var = (q9) o5.a(parcel, q9.CREATOR);
                        o5.d(parcel);
                        _COROUTINE.b.G(status5, q9Var, jVar2);
                        break;
                    case 5:
                        Status status6 = (Status) o5.a(parcel, Status.CREATOR);
                        o5.d(parcel);
                        _COROUTINE.b.G(status6, null, jVar2);
                        break;
                    case 6:
                        Status status7 = (Status) o5.a(parcel, Status.CREATOR);
                        s9 s9Var = (s9) o5.a(parcel, s9.CREATOR);
                        o5.d(parcel);
                        _COROUTINE.b.G(status7, s9Var, jVar2);
                        break;
                    case 7:
                        Status status8 = (Status) o5.a(parcel, Status.CREATOR);
                        r9 r9Var = (r9) o5.a(parcel, r9.CREATOR);
                        o5.d(parcel);
                        _COROUTINE.b.G(status8, r9Var, jVar2);
                        break;
                    case 8:
                        Status status9 = (Status) o5.a(parcel, Status.CREATOR);
                        o5.d(parcel);
                        _COROUTINE.b.G(status9, null, jVar2);
                        break;
                    case 9:
                        Status status10 = (Status) o5.a(parcel, Status.CREATOR);
                        t9 t9Var = (t9) o5.a(parcel, t9.CREATOR);
                        o5.d(parcel);
                        _COROUTINE.b.G(status10, t9Var, jVar2);
                        break;
                    case 10:
                        Status status11 = (Status) o5.a(parcel, Status.CREATOR);
                        q9 q9Var2 = (q9) o5.a(parcel, q9.CREATOR);
                        o5.d(parcel);
                        _COROUTINE.b.G(status11, q9Var2, jVar2);
                        break;
                    case 11:
                        Status status12 = (Status) o5.a(parcel, Status.CREATOR);
                        parcel.readLong();
                        o5.d(parcel);
                        _COROUTINE.b.G(status12, null, jVar2);
                        break;
                    case 12:
                        Status status13 = (Status) o5.a(parcel, Status.CREATOR);
                        o5.d(parcel);
                        _COROUTINE.b.G(status13, null, jVar2);
                        break;
                    case 13:
                        Status status14 = (Status) o5.a(parcel, Status.CREATOR);
                        v9 v9Var = (v9) o5.a(parcel, v9.CREATOR);
                        o5.d(parcel);
                        _COROUTINE.b.G(status14, v9Var, jVar2);
                        break;
                    case 14:
                        Status status15 = (Status) o5.a(parcel, Status.CREATOR);
                        o5.d(parcel);
                        _COROUTINE.b.G(status15, null, jVar2);
                        break;
                    case 15:
                        Status status16 = (Status) o5.a(parcel, Status.CREATOR);
                        o5.d(parcel);
                        _COROUTINE.b.G(status16, null, jVar2);
                        break;
                    case 16:
                        Status status17 = (Status) o5.a(parcel, Status.CREATOR);
                        long j = parcel.readLong();
                        o5.d(parcel);
                        _COROUTINE.b.G(status17, Long.valueOf(j), jVar2);
                        break;
                    default:
                        return false;
                }
                return true;
            default:
                if (i != 2) {
                    return false;
                }
                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                o5.d(parcel);
                s5 s5Var = new s5(this, bArrCreateByteArray2);
                androidx.emoji2.text.f fVar = (androidx.emoji2.text.f) this.e;
                ((com.google.android.datatransport.runtime.p) fVar.a).execute(new com.google.common.util.concurrent.l0(7, fVar, s5Var));
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(z9 z9Var, com.google.android.gms.tasks.j jVar) {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
        this.e = jVar;
    }

    public x9(com.google.android.gms.tasks.j jVar) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.e = jVar;
    }
}
