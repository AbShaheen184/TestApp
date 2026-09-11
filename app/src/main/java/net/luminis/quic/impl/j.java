package net.luminis.quic.impl;

import com.app.mlounge.emulator.LibretroCore;
import java.util.function.Consumer;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jsoup.parser.f0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Consumer {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                ((f0) obj).e(128);
                break;
            case 4:
                ((f0) obj).e(LibretroCore.SCREEN_WIDTH);
                break;
            case 5:
                ((f0) obj).e(512);
                break;
            case 6:
                ((f0) obj).e(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                break;
            case 7:
                ((f0) obj).e(4);
                break;
            case 8:
                ((f0) obj).e(4);
                break;
            case 9:
                ((f0) obj).e(0);
                break;
            case 10:
                ((f0) obj).e(4);
                break;
            case 11:
                ((f0) obj).e(0);
                break;
            case 12:
                ((f0) obj).e(LibretroCore.SCREEN_WIDTH);
                break;
            case 13:
                ((f0) obj).e(0);
                break;
            case 14:
                ((f0) obj).e(8);
                break;
            case 15:
                ((f0) obj).e(2);
                break;
            default:
                ((f0) obj).e(64);
                break;
        }
    }
}
