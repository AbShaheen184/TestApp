package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {
    /* JADX WARN: Illegal instructions before constructor call */
    public b(Context context, int i) {
        switch (i) {
            case 1:
                context.getClass();
                Object systemService = context.getSystemService((Class<Object>) MeasurementManager.class);
                systemService.getClass();
                super((MeasurementManager) systemService);
                break;
            default:
                context.getClass();
                MeasurementManager measurementManager = MeasurementManager.get(context);
                measurementManager.getClass();
                super(measurementManager);
                break;
        }
    }
}
