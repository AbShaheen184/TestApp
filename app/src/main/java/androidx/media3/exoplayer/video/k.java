package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.common.e1;
import androidx.media3.common.f1;
import androidx.media3.common.i0;
import androidx.media3.common.t0;
import androidx.media3.common.util.j0;
import androidx.media3.common.util.n0;
import androidx.media3.common.v0;
import androidx.media3.exoplayer.h1;
import androidx.media3.exoplayer.j1;
import androidx.media3.exoplayer.source.w0;
import com.app.mlounge.emulator.LibretroCore;
import com.caverock.androidsvg.y1;
import com.google.common.collect.a1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends androidx.media3.exoplayer.mediacodec.r {
    public static final int[] Y1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, LibretroCore.PSP_SCREEN_WIDTH};
    public static boolean Z1;
    public static boolean a2;
    public boolean A1;
    public int B1;
    public int C1;
    public long D1;
    public int E1;
    public int F1;
    public int G1;
    public j1 H1;
    public long I1;
    public boolean J1;
    public long K1;
    public int L1;
    public long M1;
    public f1 N1;
    public f1 O1;
    public int P1;
    public boolean Q1;
    public int R1;
    public j S1;
    public u T1;
    public long U1;
    public long V1;
    public boolean W1;
    public int X1;
    public final Context f1;
    public final boolean g1;
    public final androidx.media3.exoplayer.audio.t h1;
    public final int i1;
    public final boolean j1;
    public final w k1;
    public final v l1;
    public final androidx.media3.common.util.b m1;
    public final long n1;
    public final x o1;
    public final PriorityQueue p1;
    public androidx.media3.container.j q1;
    public boolean r1;
    public boolean s1;
    public h0 t1;
    public boolean u1;
    public int v1;
    public List w1;
    public Surface x1;
    public m y1;
    public androidx.media3.common.util.x z1;

    /* JADX WARN: Illegal instructions before constructor call */
    public k(i iVar) {
        Context context = iVar.a;
        super(context.getApplicationContext(), 2, iVar.c, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f1 = applicationContext;
        this.i1 = iVar.g;
        this.t1 = null;
        this.h1 = new androidx.media3.exoplayer.audio.t(iVar.e, iVar.f, 1);
        this.g1 = this.t1 == null;
        this.k1 = new w(applicationContext, this, iVar.d);
        this.l1 = new v();
        this.j1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.z1 = androidx.media3.common.util.x.c;
        this.B1 = 1;
        this.C1 = 0;
        this.N1 = f1.d;
        this.R1 = 0;
        this.O1 = null;
        this.P1 = -1000;
        this.U1 = -9223372036854775807L;
        this.V1 = -9223372036854775807L;
        this.m1 = new androidx.media3.common.util.b(13);
        this.p1 = new PriorityQueue();
        this.n1 = -15000L;
        this.o1 = new x();
        this.H1 = null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0124  */
    /* JADX WARN: Code duplicated, block: B:102:0x0127  */
    /* JADX WARN: Code duplicated, block: B:105:0x0130  */
    /* JADX WARN: Code duplicated, block: B:106:0x0134  */
    /* JADX WARN: Code duplicated, block: B:109:0x013d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:113:0x014a  */
    /* JADX WARN: Code duplicated, block: B:114:0x014e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0157  */
    /* JADX WARN: Code duplicated, block: B:118:0x015b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0164  */
    /* JADX WARN: Code duplicated, block: B:122:0x0168  */
    /* JADX WARN: Code duplicated, block: B:125:0x0171  */
    /* JADX WARN: Code duplicated, block: B:126:0x0175  */
    /* JADX WARN: Code duplicated, block: B:129:0x017e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0182  */
    /* JADX WARN: Code duplicated, block: B:133:0x018b  */
    /* JADX WARN: Code duplicated, block: B:134:0x018f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0198  */
    /* JADX WARN: Code duplicated, block: B:138:0x019c  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:157:0x01de  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:165:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:166:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:169:0x0208  */
    /* JADX WARN: Code duplicated, block: B:170:0x020c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0216  */
    /* JADX WARN: Code duplicated, block: B:174:0x021a  */
    /* JADX WARN: Code duplicated, block: B:177:0x0224  */
    /* JADX WARN: Code duplicated, block: B:178:0x0228  */
    /* JADX WARN: Code duplicated, block: B:181:0x0232  */
    /* JADX WARN: Code duplicated, block: B:182:0x0236  */
    /* JADX WARN: Code duplicated, block: B:185:0x0240  */
    /* JADX WARN: Code duplicated, block: B:186:0x0244  */
    /* JADX WARN: Code duplicated, block: B:189:0x024e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0252  */
    /* JADX WARN: Code duplicated, block: B:193:0x025c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0260  */
    /* JADX WARN: Code duplicated, block: B:197:0x026a  */
    /* JADX WARN: Code duplicated, block: B:198:0x026e  */
    /* JADX WARN: Code duplicated, block: B:201:0x0278  */
    /* JADX WARN: Code duplicated, block: B:202:0x027c  */
    /* JADX WARN: Code duplicated, block: B:205:0x0286  */
    /* JADX WARN: Code duplicated, block: B:206:0x028a  */
    /* JADX WARN: Code duplicated, block: B:209:0x0294  */
    /* JADX WARN: Code duplicated, block: B:210:0x0298  */
    /* JADX WARN: Code duplicated, block: B:213:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:217:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:218:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:221:0x02be  */
    /* JADX WARN: Code duplicated, block: B:222:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:225:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:226:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:229:0x02da  */
    /* JADX WARN: Code duplicated, block: B:230:0x02de  */
    /* JADX WARN: Code duplicated, block: B:233:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:234:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:237:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:238:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:241:0x0304  */
    /* JADX WARN: Code duplicated, block: B:242:0x0308  */
    /* JADX WARN: Code duplicated, block: B:245:0x0312  */
    /* JADX WARN: Code duplicated, block: B:246:0x0316  */
    /* JADX WARN: Code duplicated, block: B:249:0x0320  */
    /* JADX WARN: Code duplicated, block: B:250:0x0324  */
    /* JADX WARN: Code duplicated, block: B:253:0x032e  */
    /* JADX WARN: Code duplicated, block: B:254:0x0332  */
    /* JADX WARN: Code duplicated, block: B:257:0x033c  */
    /* JADX WARN: Code duplicated, block: B:258:0x0340  */
    /* JADX WARN: Code duplicated, block: B:261:0x034a  */
    /* JADX WARN: Code duplicated, block: B:262:0x034e  */
    /* JADX WARN: Code duplicated, block: B:265:0x0358  */
    /* JADX WARN: Code duplicated, block: B:266:0x035c  */
    /* JADX WARN: Code duplicated, block: B:269:0x0366  */
    /* JADX WARN: Code duplicated, block: B:270:0x036a  */
    /* JADX WARN: Code duplicated, block: B:273:0x0374  */
    /* JADX WARN: Code duplicated, block: B:274:0x0378  */
    /* JADX WARN: Code duplicated, block: B:277:0x0382  */
    /* JADX WARN: Code duplicated, block: B:278:0x0386  */
    /* JADX WARN: Code duplicated, block: B:281:0x0390  */
    /* JADX WARN: Code duplicated, block: B:282:0x0394  */
    /* JADX WARN: Code duplicated, block: B:285:0x039e  */
    /* JADX WARN: Code duplicated, block: B:286:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:289:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:290:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:293:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:294:0x03be  */
    /* JADX WARN: Code duplicated, block: B:297:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:298:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:301:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:302:0x03da  */
    /* JADX WARN: Code duplicated, block: B:305:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:306:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:309:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:310:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:313:0x0400  */
    /* JADX WARN: Code duplicated, block: B:314:0x0404  */
    /* JADX WARN: Code duplicated, block: B:317:0x040e  */
    /* JADX WARN: Code duplicated, block: B:318:0x0412  */
    /* JADX WARN: Code duplicated, block: B:321:0x041c  */
    /* JADX WARN: Code duplicated, block: B:322:0x0420  */
    /* JADX WARN: Code duplicated, block: B:325:0x042a  */
    /* JADX WARN: Code duplicated, block: B:326:0x042e  */
    /* JADX WARN: Code duplicated, block: B:329:0x0438  */
    /* JADX WARN: Code duplicated, block: B:330:0x043c  */
    /* JADX WARN: Code duplicated, block: B:333:0x0446  */
    /* JADX WARN: Code duplicated, block: B:334:0x044a  */
    /* JADX WARN: Code duplicated, block: B:337:0x0454  */
    /* JADX WARN: Code duplicated, block: B:338:0x0458  */
    /* JADX WARN: Code duplicated, block: B:341:0x0462  */
    /* JADX WARN: Code duplicated, block: B:342:0x0466  */
    /* JADX WARN: Code duplicated, block: B:345:0x0470  */
    /* JADX WARN: Code duplicated, block: B:346:0x0474  */
    /* JADX WARN: Code duplicated, block: B:349:0x047e  */
    /* JADX WARN: Code duplicated, block: B:350:0x0482  */
    /* JADX WARN: Code duplicated, block: B:353:0x048c  */
    /* JADX WARN: Code duplicated, block: B:354:0x0490  */
    /* JADX WARN: Code duplicated, block: B:357:0x049a  */
    /* JADX WARN: Code duplicated, block: B:358:0x049e  */
    /* JADX WARN: Code duplicated, block: B:361:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:362:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:365:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:366:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:369:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:370:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:373:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:374:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:377:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:378:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:381:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:382:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:385:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:386:0x0500  */
    /* JADX WARN: Code duplicated, block: B:389:0x050a  */
    /* JADX WARN: Code duplicated, block: B:390:0x050e  */
    /* JADX WARN: Code duplicated, block: B:393:0x0518  */
    /* JADX WARN: Code duplicated, block: B:394:0x051c  */
    /* JADX WARN: Code duplicated, block: B:397:0x0526  */
    /* JADX WARN: Code duplicated, block: B:398:0x052a  */
    /* JADX WARN: Code duplicated, block: B:401:0x0534  */
    /* JADX WARN: Code duplicated, block: B:402:0x0538  */
    /* JADX WARN: Code duplicated, block: B:405:0x0542  */
    /* JADX WARN: Code duplicated, block: B:406:0x0546  */
    /* JADX WARN: Code duplicated, block: B:409:0x0550  */
    /* JADX WARN: Code duplicated, block: B:410:0x0554  */
    /* JADX WARN: Code duplicated, block: B:413:0x055e  */
    /* JADX WARN: Code duplicated, block: B:414:0x0562  */
    /* JADX WARN: Code duplicated, block: B:417:0x056c  */
    /* JADX WARN: Code duplicated, block: B:418:0x0570  */
    /* JADX WARN: Code duplicated, block: B:421:0x057a  */
    /* JADX WARN: Code duplicated, block: B:422:0x057e  */
    /* JADX WARN: Code duplicated, block: B:425:0x0588  */
    /* JADX WARN: Code duplicated, block: B:426:0x058c  */
    /* JADX WARN: Code duplicated, block: B:429:0x0596  */
    /* JADX WARN: Code duplicated, block: B:430:0x059a  */
    /* JADX WARN: Code duplicated, block: B:433:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:434:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:437:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:438:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:441:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:442:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:445:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:446:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:449:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:450:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:453:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:454:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:457:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:458:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:461:0x0606  */
    /* JADX WARN: Code duplicated, block: B:462:0x060a  */
    /* JADX WARN: Code duplicated, block: B:465:0x0614  */
    /* JADX WARN: Code duplicated, block: B:466:0x0618  */
    /* JADX WARN: Code duplicated, block: B:469:0x0622  */
    /* JADX WARN: Code duplicated, block: B:470:0x0626  */
    /* JADX WARN: Code duplicated, block: B:473:0x0630  */
    /* JADX WARN: Code duplicated, block: B:474:0x0634  */
    /* JADX WARN: Code duplicated, block: B:477:0x063e  */
    /* JADX WARN: Code duplicated, block: B:478:0x0642  */
    /* JADX WARN: Code duplicated, block: B:481:0x064c  */
    /* JADX WARN: Code duplicated, block: B:482:0x0650  */
    /* JADX WARN: Code duplicated, block: B:485:0x065a  */
    /* JADX WARN: Code duplicated, block: B:486:0x065e  */
    /* JADX WARN: Code duplicated, block: B:489:0x0668  */
    /* JADX WARN: Code duplicated, block: B:490:0x066c  */
    /* JADX WARN: Code duplicated, block: B:493:0x0676  */
    /* JADX WARN: Code duplicated, block: B:494:0x067a  */
    /* JADX WARN: Code duplicated, block: B:497:0x0684  */
    /* JADX WARN: Code duplicated, block: B:498:0x0688  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:501:0x0692  */
    /* JADX WARN: Code duplicated, block: B:502:0x0696  */
    /* JADX WARN: Code duplicated, block: B:505:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:506:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:509:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:510:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:513:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:514:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:517:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:518:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:521:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:522:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:525:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:526:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:529:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:530:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:533:0x0702  */
    /* JADX WARN: Code duplicated, block: B:534:0x0706  */
    /* JADX WARN: Code duplicated, block: B:537:0x0710  */
    /* JADX WARN: Code duplicated, block: B:538:0x0714  */
    /* JADX WARN: Code duplicated, block: B:541:0x071e  */
    /* JADX WARN: Code duplicated, block: B:542:0x0722  */
    /* JADX WARN: Code duplicated, block: B:545:0x072c  */
    /* JADX WARN: Code duplicated, block: B:546:0x0730  */
    /* JADX WARN: Code duplicated, block: B:549:0x073a  */
    /* JADX WARN: Code duplicated, block: B:552:0x0744  */
    /* JADX WARN: Code duplicated, block: B:553:0x0747  */
    /* JADX WARN: Code duplicated, block: B:556:0x0751  */
    /* JADX WARN: Code duplicated, block: B:557:0x0754  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d A[Catch: all -> 0x08be, TRY_LEAVE, TryCatch #0 {all -> 0x08be, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:664:0x08b9, B:52:0x0092, B:55:0x009d, B:98:0x0118, B:667:0x08c0), top: B:672:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:560:0x075e  */
    /* JADX WARN: Code duplicated, block: B:561:0x0762  */
    /* JADX WARN: Code duplicated, block: B:564:0x076c  */
    /* JADX WARN: Code duplicated, block: B:565:0x0770  */
    /* JADX WARN: Code duplicated, block: B:568:0x077a  */
    /* JADX WARN: Code duplicated, block: B:569:0x077e  */
    /* JADX WARN: Code duplicated, block: B:572:0x0788  */
    /* JADX WARN: Code duplicated, block: B:573:0x078c  */
    /* JADX WARN: Code duplicated, block: B:576:0x0796  */
    /* JADX WARN: Code duplicated, block: B:577:0x079a  */
    /* JADX WARN: Code duplicated, block: B:580:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:581:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:584:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:585:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:588:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:589:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:592:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:593:0x07d2  */
    /* JADX WARN: Code duplicated, block: B:596:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:597:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:600:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:601:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:604:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:605:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:608:0x0806  */
    /* JADX WARN: Code duplicated, block: B:609:0x080a  */
    /* JADX WARN: Code duplicated, block: B:612:0x0814  */
    /* JADX WARN: Code duplicated, block: B:613:0x0818  */
    /* JADX WARN: Code duplicated, block: B:616:0x0822  */
    /* JADX WARN: Code duplicated, block: B:617:0x0826  */
    /* JADX WARN: Code duplicated, block: B:620:0x0830  */
    /* JADX WARN: Code duplicated, block: B:621:0x0834  */
    /* JADX WARN: Code duplicated, block: B:624:0x083e  */
    /* JADX WARN: Code duplicated, block: B:625:0x0842  */
    /* JADX WARN: Code duplicated, block: B:628:0x084c  */
    /* JADX WARN: Code duplicated, block: B:629:0x084f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:632:0x0859  */
    /* JADX WARN: Code duplicated, block: B:633:0x085b  */
    /* JADX WARN: Code duplicated, block: B:636:0x0865  */
    /* JADX WARN: Code duplicated, block: B:637:0x0867  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:640:0x0871  */
    /* JADX WARN: Code duplicated, block: B:641:0x0873  */
    /* JADX WARN: Code duplicated, block: B:644:0x087d  */
    /* JADX WARN: Code duplicated, block: B:645:0x087f  */
    /* JADX WARN: Code duplicated, block: B:648:0x0889  */
    /* JADX WARN: Code duplicated, block: B:649:0x088b  */
    /* JADX WARN: Code duplicated, block: B:652:0x0895  */
    /* JADX WARN: Code duplicated, block: B:653:0x0897  */
    /* JADX WARN: Code duplicated, block: B:656:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:657:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:660:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:662:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:682:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:699:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:700:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:702:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:708:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:710:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:715:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:717:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:719:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:720:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:721:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:723:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:724:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:726:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:736:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:737:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:740:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:742:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:743:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:747:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:749:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:750:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:751:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:752:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:756:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:757:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:758:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:759:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:760:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:762:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:763:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:764:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:765:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:766:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:768:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:769:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:770:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:772:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:773:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:774:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:775:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:776:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:777:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:778:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:779:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:780:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:781:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:782:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:783:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:784:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:785:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:786:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:787:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:788:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:789:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:790:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:791:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:792:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:793:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:794:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:795:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:796:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:797:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:798:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:799:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:800:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:801:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:802:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:803:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:804:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:805:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:806:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:807:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:808:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:809:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:810:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:811:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:812:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:813:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:814:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:815:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:816:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:817:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:818:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:819:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:820:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:821:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:822:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:823:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:824:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:825:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:826:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:827:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:828:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:829:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:830:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    /* JADX WARN: Code duplicated, block: B:91:0x0107  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:98:0x0118 A[Catch: all -> 0x08be, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x08be, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:664:0x08b9, B:52:0x0092, B:55:0x009d, B:98:0x0118, B:667:0x08c0), top: B:672:0x000f }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean E0(String str) {
        String str2;
        byte b;
        String str3;
        byte b2;
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (k.class) {
            try {
                if (!Z1) {
                    int i = Build.VERSION.SDK_INT;
                    byte b3 = 28;
                    if (i <= 28) {
                        String str4 = Build.DEVICE;
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case -1339091551:
                                b2 = !str4.equals("dangal") ? (byte) -1 : (byte) 0;
                                break;
                            case -1220081023:
                                b2 = !str4.equals("dangalFHD") ? (byte) -1 : (byte) 1;
                                break;
                            case -1220066608:
                                b2 = !str4.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                                break;
                            case -1012436106:
                                b2 = !str4.equals("oneday") ? (byte) -1 : (byte) 3;
                                break;
                            case -760312546:
                                b2 = !str4.equals("aquaman") ? (byte) -1 : (byte) 4;
                                break;
                            case -64886864:
                                b2 = !str4.equals("magnolia") ? (byte) -1 : (byte) 5;
                                break;
                            case 3415681:
                                b2 = !str4.equals("once") ? (byte) -1 : (byte) 6;
                                break;
                            case 825323514:
                                b2 = !str4.equals("machuca") ? (byte) -1 : (byte) 7;
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        switch (b2) {
                            default:
                                if (i <= 27 || !"HWEML".equals(Build.DEVICE)) {
                                    str2 = Build.MODEL;
                                    str2.getClass();
                                    switch (str2.hashCode()) {
                                        case -349662828:
                                            if (!str2.equals("AFTJMST12")) {
                                                b = 0;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -321033677:
                                            if (!str2.equals("AFTKMST12")) {
                                                b = 1;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2006354:
                                            if (!str2.equals("AFTA")) {
                                                b = 2;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2006367:
                                            if (!str2.equals("AFTN")) {
                                                b = 3;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2006371:
                                            if (!str2.equals("AFTR")) {
                                                b = 4;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1785421873:
                                            if (!str2.equals("AFTEU011")) {
                                                b = 5;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1785421876:
                                            if (!str2.equals("AFTEU014")) {
                                                b = 6;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1798172390:
                                            if (!str2.equals("AFTSO001")) {
                                                b = 7;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 2119412532:
                                            if (!str2.equals("AFTEUFF014")) {
                                                b = 8;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    switch (b) {
                                        default:
                                            if (i <= 26) {
                                                str3 = Build.DEVICE;
                                                str3.getClass();
                                                switch (str3.hashCode()) {
                                                    case -2144781245:
                                                        if (!str3.equals("GIONEE_SWW1609")) {
                                                            b3 = 0;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -2144781185:
                                                        if (!str3.equals("GIONEE_SWW1627")) {
                                                            b3 = 1;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -2144781160:
                                                        if (!str3.equals("GIONEE_SWW1631")) {
                                                            b3 = 2;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -2097309513:
                                                        if (!str3.equals("K50a40")) {
                                                            b3 = 3;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -2022874474:
                                                        if (!str3.equals("CP8676_I02")) {
                                                            b3 = 4;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1978993182:
                                                        if (!str3.equals("NX541J")) {
                                                            b3 = 5;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1978990237:
                                                        if (!str3.equals("NX573J")) {
                                                            b3 = 6;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1936688988:
                                                        if (!str3.equals("PGN528")) {
                                                            b3 = 7;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1936688066:
                                                        if (!str3.equals("PGN610")) {
                                                            b3 = 8;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1936688065:
                                                        if (!str3.equals("PGN611")) {
                                                            b3 = 9;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1931988508:
                                                        if (!str3.equals("AquaPowerM")) {
                                                            b3 = 10;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1885099851:
                                                        if (!str3.equals("RAIJIN")) {
                                                            b3 = 11;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1696512866:
                                                        if (!str3.equals("XT1663")) {
                                                            b3 = 12;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1680025915:
                                                        if (!str3.equals("ComioS1")) {
                                                            b3 = 13;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1615810839:
                                                        if (!str3.equals("Phantom6")) {
                                                            b3 = 14;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1600724499:
                                                        if (!str3.equals("pacificrim")) {
                                                            b3 = 15;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1554255044:
                                                        if (!str3.equals("vernee_M5")) {
                                                            b3 = 16;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1481772737:
                                                        if (!str3.equals("panell_dl")) {
                                                            b3 = 17;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1481772730:
                                                        if (!str3.equals("panell_ds")) {
                                                            b3 = 18;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1481772729:
                                                        if (!str3.equals("panell_dt")) {
                                                            b3 = 19;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1320080169:
                                                        if (!str3.equals("GiONEE_GBL7319")) {
                                                            b3 = 20;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1217592143:
                                                        if (!str3.equals("BRAVIA_ATV2")) {
                                                            b3 = 21;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1180384755:
                                                        if (!str3.equals("iris60")) {
                                                            b3 = 22;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1139198265:
                                                        if (!str3.equals("Slate_Pro")) {
                                                            b3 = 23;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -1052835013:
                                                        if (!str3.equals("namath")) {
                                                            b3 = 24;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -993250464:
                                                        if (!str3.equals("A10-70F")) {
                                                            b3 = 25;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -993250458:
                                                        if (!str3.equals("A10-70L")) {
                                                            b3 = 26;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -965403638:
                                                        if (!str3.equals("s905x018")) {
                                                            b3 = 27;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -958336948:
                                                        if (!str3.equals("ELUGA_Ray_X")) {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -879245230:
                                                        if (!str3.equals("tcl_eu")) {
                                                            b3 = 29;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -842500323:
                                                        if (!str3.equals("nicklaus_f")) {
                                                            b3 = 30;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -821392978:
                                                        if (!str3.equals("A7000-a")) {
                                                            b3 = 31;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -797483286:
                                                        if (!str3.equals("SVP-DTV15")) {
                                                            b3 = 32;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -794946968:
                                                        if (!str3.equals("watson")) {
                                                            b3 = 33;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -788334647:
                                                        if (!str3.equals("whyred")) {
                                                            b3 = 34;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -782144577:
                                                        if (!str3.equals("OnePlus5T")) {
                                                            b3 = 35;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -575125681:
                                                        if (!str3.equals("GiONEE_CBL7513")) {
                                                            b3 = 36;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -521118391:
                                                        if (!str3.equals("GIONEE_GBL7360")) {
                                                            b3 = 37;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -430914369:
                                                        if (!str3.equals("Pixi4-7_3G")) {
                                                            b3 = 38;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -290434366:
                                                        if (!str3.equals("taido_row")) {
                                                            b3 = 39;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -282781963:
                                                        if (!str3.equals("BLACK-1X")) {
                                                            b3 = 40;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -277133239:
                                                        if (!str3.equals("Z12_PRO")) {
                                                            b3 = 41;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -173639913:
                                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                                            b3 = 42;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case -56598463:
                                                        if (!str3.equals("woods_fn")) {
                                                            b3 = 43;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2126:
                                                        if (!str3.equals("C1")) {
                                                            b3 = 44;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2564:
                                                        if (!str3.equals("Q5")) {
                                                            b3 = 45;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2715:
                                                        if (!str3.equals("V1")) {
                                                            b3 = 46;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2719:
                                                        if (!str3.equals("V5")) {
                                                            b3 = 47;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3091:
                                                        if (!str3.equals("b5")) {
                                                            b3 = 48;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3483:
                                                        if (!str3.equals("mh")) {
                                                            b3 = 49;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 73405:
                                                        if (!str3.equals("JGZ")) {
                                                            b3 = 50;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 75537:
                                                        if (!str3.equals("M04")) {
                                                            b3 = 51;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 75739:
                                                        if (!str3.equals("M5c")) {
                                                            b3 = 52;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 76779:
                                                        if (!str3.equals("MX6")) {
                                                            b3 = 53;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 78669:
                                                        if (!str3.equals("P85")) {
                                                            b3 = 54;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 79305:
                                                        if (!str3.equals("PLE")) {
                                                            b3 = 55;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 80618:
                                                        if (!str3.equals("QX1")) {
                                                            b3 = 56;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 88274:
                                                        if (!str3.equals("Z80")) {
                                                            b3 = 57;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 98846:
                                                        if (!str3.equals("cv1")) {
                                                            b3 = 58;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 98848:
                                                        if (!str3.equals("cv3")) {
                                                            b3 = 59;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 99329:
                                                        if (!str3.equals("deb")) {
                                                            b3 = 60;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 101481:
                                                        if (!str3.equals("flo")) {
                                                            b3 = 61;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1513190:
                                                        if (!str3.equals("1601")) {
                                                            b3 = 62;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1514184:
                                                        if (!str3.equals("1713")) {
                                                            b3 = 63;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1514185:
                                                        if (!str3.equals("1714")) {
                                                            b3 = 64;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133089:
                                                        if (!str3.equals("F01H")) {
                                                            b3 = 65;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133091:
                                                        if (!str3.equals("F01J")) {
                                                            b3 = 66;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133120:
                                                        if (!str3.equals("F02H")) {
                                                            b3 = 67;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133151:
                                                        if (!str3.equals("F03H")) {
                                                            b3 = 68;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133182:
                                                        if (!str3.equals("F04H")) {
                                                            b3 = 69;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2133184:
                                                        if (!str3.equals("F04J")) {
                                                            b3 = 70;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2436959:
                                                        if (!str3.equals("P681")) {
                                                            b3 = 71;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2463773:
                                                        if (!str3.equals("Q350")) {
                                                            b3 = 72;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2464648:
                                                        if (!str3.equals("Q427")) {
                                                            b3 = 73;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2689555:
                                                        if (!str3.equals("XE2X")) {
                                                            b3 = 74;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3154429:
                                                        if (!str3.equals("fugu")) {
                                                            b3 = 75;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3284551:
                                                        if (!str3.equals("kate")) {
                                                            b3 = 76;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3351335:
                                                        if (!str3.equals("mido")) {
                                                            b3 = 77;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3386211:
                                                        if (!str3.equals("p212")) {
                                                            b3 = 78;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 41325051:
                                                        if (!str3.equals("MEIZU_M5")) {
                                                            b3 = 79;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 51349633:
                                                        if (!str3.equals("601LV")) {
                                                            b3 = 80;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 51350594:
                                                        if (!str3.equals("602LV")) {
                                                            b3 = 81;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 55178625:
                                                        if (!str3.equals("Aura_Note_2")) {
                                                            b3 = 82;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 61542055:
                                                        if (!str3.equals("A1601")) {
                                                            b3 = 83;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 65355429:
                                                        if (!str3.equals("E5643")) {
                                                            b3 = 84;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66214468:
                                                        if (!str3.equals("F3111")) {
                                                            b3 = 85;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66214470:
                                                        if (!str3.equals("F3113")) {
                                                            b3 = 86;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66214473:
                                                        if (!str3.equals("F3116")) {
                                                            b3 = 87;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66215429:
                                                        if (!str3.equals("F3211")) {
                                                            b3 = 88;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66215431:
                                                        if (!str3.equals("F3213")) {
                                                            b3 = 89;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66215433:
                                                        if (!str3.equals("F3215")) {
                                                            b3 = 90;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 66216390:
                                                        if (!str3.equals("F3311")) {
                                                            b3 = 91;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 76402249:
                                                        if (!str3.equals("PRO7S")) {
                                                            b3 = 92;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 76404105:
                                                        if (!str3.equals("Q4260")) {
                                                            b3 = 93;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 76404911:
                                                        if (!str3.equals("Q4310")) {
                                                            b3 = 94;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 80963634:
                                                        if (!str3.equals("V23GB")) {
                                                            b3 = 95;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 82882791:
                                                        if (!str3.equals("X3_HK")) {
                                                            b3 = 96;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 98715550:
                                                        if (!str3.equals("i9031")) {
                                                            b3 = 97;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 101370885:
                                                        if (!str3.equals("l5460")) {
                                                            b3 = 98;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 102844228:
                                                        if (!str3.equals("le_x6")) {
                                                            b3 = 99;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 165221241:
                                                        if (!str3.equals("A2016a40")) {
                                                            b3 = 100;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 182191441:
                                                        if (!str3.equals("CPY83_I00")) {
                                                            b3 = 101;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 245388979:
                                                        if (!str3.equals("marino_f")) {
                                                            b3 = 102;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 287431619:
                                                        if (!str3.equals("griffin")) {
                                                            b3 = 103;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 307593612:
                                                        if (!str3.equals("A7010a48")) {
                                                            b3 = 104;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 308517133:
                                                        if (!str3.equals("A7020a48")) {
                                                            b3 = 105;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 316215098:
                                                        if (!str3.equals("TB3-730F")) {
                                                            b3 = 106;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 316215116:
                                                        if (!str3.equals("TB3-730X")) {
                                                            b3 = 107;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 316246811:
                                                        if (!str3.equals("TB3-850F")) {
                                                            b3 = 108;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 316246818:
                                                        if (!str3.equals("TB3-850M")) {
                                                            b3 = 109;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 407160593:
                                                        if (!str3.equals("Pixi5-10_4G")) {
                                                            b3 = 110;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 507412548:
                                                        if (!str3.equals("QM16XE_U")) {
                                                            b3 = 111;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 793982701:
                                                        if (!str3.equals("GIONEE_WBL5708")) {
                                                            b3 = 112;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 794038622:
                                                        if (!str3.equals("GIONEE_WBL7365")) {
                                                            b3 = 113;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 794040393:
                                                        if (!str3.equals("GIONEE_WBL7519")) {
                                                            b3 = 114;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 835649806:
                                                        if (!str3.equals("manning")) {
                                                            b3 = 115;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 917340916:
                                                        if (!str3.equals("A7000plus")) {
                                                            b3 = 116;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 958008161:
                                                        if (!str3.equals("j2xlteins")) {
                                                            b3 = 117;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1060579533:
                                                        if (!str3.equals("panell_d")) {
                                                            b3 = 118;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1150207623:
                                                        if (!str3.equals("LS-5017")) {
                                                            b3 = 119;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1176899427:
                                                        if (!str3.equals("itel_S41")) {
                                                            b3 = 120;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1280332038:
                                                        if (!str3.equals("hwALE-H")) {
                                                            b3 = 121;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1306947716:
                                                        if (!str3.equals("EverStar_S")) {
                                                            b3 = 122;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1349174697:
                                                        if (!str3.equals("htc_e56ml_dtul")) {
                                                            b3 = 123;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1522194893:
                                                        if (!str3.equals("woods_f")) {
                                                            b3 = 124;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1691543273:
                                                        if (!str3.equals("CPH1609")) {
                                                            b3 = 125;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1691544261:
                                                        if (!str3.equals("CPH1715")) {
                                                            b3 = 126;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1709443163:
                                                        if (!str3.equals("iball8735_9806")) {
                                                            b3 = 127;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1865889110:
                                                        if (!str3.equals("santoni")) {
                                                            b3 = 128;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1906253259:
                                                        if (!str3.equals("PB2-670M")) {
                                                            b3 = 129;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 1977196784:
                                                        if (!str3.equals("Infinix-X572")) {
                                                            b3 = 130;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2006372676:
                                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                            b3 = 131;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2019281702:
                                                        if (!str3.equals("DM-01K")) {
                                                            b3 = 132;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2029784656:
                                                        if (!str3.equals("HWBLN-H")) {
                                                            b3 = 133;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2030379515:
                                                        if (!str3.equals("HWCAM-H")) {
                                                            b3 = 134;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2033393791:
                                                        if (!str3.equals("ASUS_X00AD_2")) {
                                                            b3 = 135;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2047190025:
                                                        if (!str3.equals("ELUGA_Note")) {
                                                            b3 = 136;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2047252157:
                                                        if (!str3.equals("ELUGA_Prim")) {
                                                            b3 = 137;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2048319463:
                                                        if (!str3.equals("HWVNS-H")) {
                                                            b3 = 138;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 2048855701:
                                                        if (!str3.equals("HWWAS-H")) {
                                                            b3 = 139;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    default:
                                                        b3 = -1;
                                                        break;
                                                }
                                                switch (b3) {
                                                    default:
                                                        if (str2.equals("JSN-L21")) {
                                                        }
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                    case 10:
                                                    case 11:
                                                    case 12:
                                                    case 13:
                                                    case 14:
                                                    case 15:
                                                    case 16:
                                                    case 17:
                                                    case 18:
                                                    case 19:
                                                    case 20:
                                                    case 21:
                                                    case 22:
                                                    case 23:
                                                    case 24:
                                                    case 25:
                                                    case 26:
                                                    case 27:
                                                    case 28:
                                                    case 29:
                                                    case 30:
                                                    case 31:
                                                    case 32:
                                                    case Token.GETPROP /* 33 */:
                                                    case Token.GETPROPNOWARN /* 34 */:
                                                    case 35:
                                                    case Token.GETPROPNOWARN_SUPER /* 36 */:
                                                    case Token.SETPROP /* 37 */:
                                                    case Token.SETPROP_SUPER /* 38 */:
                                                    case Token.GETELEM /* 39 */:
                                                    case Token.GETELEM_SUPER /* 40 */:
                                                    case Token.SETELEM /* 41 */:
                                                    case Token.SETELEM_SUPER /* 42 */:
                                                    case Token.CALL /* 43 */:
                                                    case Token.NAME /* 44 */:
                                                    case Token.NUMBER /* 45 */:
                                                    case Token.STRING /* 46 */:
                                                    case Token.NULL /* 47 */:
                                                    case Token.THIS /* 48 */:
                                                    case Token.FALSE /* 49 */:
                                                    case Token.TRUE /* 50 */:
                                                    case Token.SHEQ /* 51 */:
                                                    case Token.SHNE /* 52 */:
                                                    case Token.REGEXP /* 53 */:
                                                    case Token.BINDNAME /* 54 */:
                                                    case Token.THROW /* 55 */:
                                                    case Token.RETHROW /* 56 */:
                                                    case Token.IN /* 57 */:
                                                    case Token.INSTANCEOF /* 58 */:
                                                    case Token.LOCAL_LOAD /* 59 */:
                                                    case 60:
                                                    case 61:
                                                    case Token.CATCH_SCOPE /* 62 */:
                                                    case Token.ENUM_INIT_KEYS /* 63 */:
                                                    case Token.ENUM_INIT_VALUES /* 64 */:
                                                    case Token.ENUM_INIT_ARRAY /* 65 */:
                                                    case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                                                    case Token.ENUM_NEXT /* 67 */:
                                                    case Token.ENUM_ID /* 68 */:
                                                    case Token.THISFN /* 69 */:
                                                    case Token.RETURN_RESULT /* 70 */:
                                                    case Token.ARRAYLIT /* 71 */:
                                                    case Token.OBJECTLIT /* 72 */:
                                                    case Token.GET_REF /* 73 */:
                                                    case Token.SET_REF /* 74 */:
                                                    case Token.DEL_REF /* 75 */:
                                                    case Token.REF_CALL /* 76 */:
                                                    case Token.REF_SPECIAL /* 77 */:
                                                    case Token.YIELD /* 78 */:
                                                    case Token.SUPER /* 79 */:
                                                    case Token.STRICT_SETNAME /* 80 */:
                                                    case Token.EXP /* 81 */:
                                                    case Token.DEFAULTNAMESPACE /* 82 */:
                                                    case Token.ESCXMLATTR /* 83 */:
                                                    case Token.ESCXMLTEXT /* 84 */:
                                                    case Token.REF_MEMBER /* 85 */:
                                                    case Token.REF_NS_MEMBER /* 86 */:
                                                    case Token.REF_NAME /* 87 */:
                                                    case Token.REF_NS_NAME /* 88 */:
                                                    case 89:
                                                    case Token.TRY /* 90 */:
                                                    case Token.SEMI /* 91 */:
                                                    case Token.LB /* 92 */:
                                                    case Token.RB /* 93 */:
                                                    case Token.LC /* 94 */:
                                                    case Token.RC /* 95 */:
                                                    case Token.LP /* 96 */:
                                                    case Token.RP /* 97 */:
                                                    case Token.COMMA /* 98 */:
                                                    case 99:
                                                    case 100:
                                                    case Token.ASSIGN_LOGICAL_OR /* 101 */:
                                                    case Token.ASSIGN_BITXOR /* 102 */:
                                                    case Token.ASSIGN_BITAND /* 103 */:
                                                    case Token.ASSIGN_LOGICAL_AND /* 104 */:
                                                    case Token.ASSIGN_LSH /* 105 */:
                                                    case Token.ASSIGN_RSH /* 106 */:
                                                    case Token.ASSIGN_URSH /* 107 */:
                                                    case Token.ASSIGN_ADD /* 108 */:
                                                    case Token.ASSIGN_SUB /* 109 */:
                                                    case 110:
                                                    case Token.ASSIGN_DIV /* 111 */:
                                                    case Token.ASSIGN_MOD /* 112 */:
                                                    case Token.ASSIGN_EXP /* 113 */:
                                                    case 114:
                                                    case Token.HOOK /* 115 */:
                                                    case Token.COLON /* 116 */:
                                                    case Token.OR /* 117 */:
                                                    case Token.AND /* 118 */:
                                                    case Token.INC /* 119 */:
                                                    case 120:
                                                    case Token.DOT /* 121 */:
                                                    case Token.FUNCTION /* 122 */:
                                                    case Token.EXPORT /* 123 */:
                                                    case Token.IMPORT /* 124 */:
                                                    case Token.IF /* 125 */:
                                                    case Token.ELSE /* 126 */:
                                                    case 127:
                                                    case 128:
                                                    case Token.DEFAULT /* 129 */:
                                                    case 130:
                                                    case Token.DO /* 131 */:
                                                    case Token.FOR /* 132 */:
                                                    case Token.BREAK /* 133 */:
                                                    case Token.CONTINUE /* 134 */:
                                                    case Token.VAR /* 135 */:
                                                    case Token.WITH /* 136 */:
                                                    case Token.CATCH /* 137 */:
                                                    case Token.FINALLY /* 138 */:
                                                    case Token.VOID /* 139 */:
                                                        z = true;
                                                        break;
                                                }
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            z = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                z = true;
                                break;
                        }
                    } else if (i <= 27) {
                        str2 = Build.MODEL;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b = 1;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b = 3;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b = 4;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b = 5;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b = 6;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b = 7;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b = 8;
                                } else {
                                    b = -1;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            default:
                                if (i <= 26) {
                                    str3 = Build.DEVICE;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b3 = 0;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b3 = 1;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b3 = 2;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b3 = 3;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b3 = 4;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b3 = 5;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b3 = 6;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b3 = 7;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b3 = 8;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b3 = 9;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b3 = 10;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b3 = 11;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b3 = 12;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b3 = 13;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b3 = 14;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b3 = 15;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b3 = 16;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b3 = 17;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b3 = 18;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b3 = 19;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b3 = 20;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b3 = 21;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b3 = 22;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b3 = 23;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b3 = 24;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b3 = 25;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b3 = 26;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b3 = 27;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b3 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b3 = 29;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b3 = 30;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b3 = 31;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b3 = 32;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b3 = 33;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b3 = 34;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b3 = 35;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b3 = 36;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b3 = 37;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b3 = 38;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b3 = 39;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b3 = 40;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b3 = 41;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b3 = 42;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b3 = 43;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b3 = 44;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b3 = 45;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b3 = 46;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b3 = 47;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b3 = 48;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b3 = 49;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b3 = 50;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b3 = 51;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b3 = 52;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b3 = 53;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b3 = 54;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b3 = 55;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b3 = 56;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b3 = 57;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b3 = 58;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b3 = 59;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b3 = 60;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b3 = 61;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b3 = 62;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b3 = 63;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b3 = 64;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b3 = 65;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b3 = 66;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b3 = 67;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b3 = 68;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b3 = 69;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b3 = 70;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b3 = 71;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b3 = 72;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b3 = 73;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b3 = 74;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b3 = 75;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b3 = 76;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b3 = 77;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b3 = 78;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b3 = 79;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b3 = 80;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b3 = 81;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b3 = 82;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b3 = 83;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b3 = 84;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b3 = 85;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b3 = 86;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b3 = 87;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b3 = 88;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b3 = 89;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b3 = 90;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b3 = 91;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b3 = 92;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b3 = 93;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b3 = 94;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b3 = 95;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b3 = 96;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b3 = 97;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b3 = 98;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b3 = 99;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b3 = 100;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b3 = 101;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b3 = 102;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b3 = 103;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b3 = 104;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b3 = 105;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b3 = 106;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b3 = 107;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b3 = 108;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b3 = 109;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b3 = 110;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b3 = 111;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b3 = 112;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b3 = 113;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b3 = 114;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b3 = 115;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b3 = 116;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b3 = 117;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b3 = 118;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b3 = 119;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b3 = 120;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b3 = 121;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b3 = 122;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b3 = 123;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b3 = 124;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b3 = 125;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b3 = 126;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b3 = 127;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b3 = 128;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b3 = 129;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b3 = 130;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b3 = 131;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b3 = 132;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b3 = 133;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b3 = 134;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b3 = 135;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b3 = 136;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b3 = 137;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b3 = 138;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b3 = 139;
                                            } else {
                                                b3 = -1;
                                            }
                                            break;
                                        default:
                                            b3 = -1;
                                            break;
                                    }
                                    switch (b3) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case 25:
                                        case 26:
                                        case 27:
                                        case 28:
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32:
                                        case Token.GETPROP /* 33 */:
                                        case Token.GETPROPNOWARN /* 34 */:
                                        case 35:
                                        case Token.GETPROPNOWARN_SUPER /* 36 */:
                                        case Token.SETPROP /* 37 */:
                                        case Token.SETPROP_SUPER /* 38 */:
                                        case Token.GETELEM /* 39 */:
                                        case Token.GETELEM_SUPER /* 40 */:
                                        case Token.SETELEM /* 41 */:
                                        case Token.SETELEM_SUPER /* 42 */:
                                        case Token.CALL /* 43 */:
                                        case Token.NAME /* 44 */:
                                        case Token.NUMBER /* 45 */:
                                        case Token.STRING /* 46 */:
                                        case Token.NULL /* 47 */:
                                        case Token.THIS /* 48 */:
                                        case Token.FALSE /* 49 */:
                                        case Token.TRUE /* 50 */:
                                        case Token.SHEQ /* 51 */:
                                        case Token.SHNE /* 52 */:
                                        case Token.REGEXP /* 53 */:
                                        case Token.BINDNAME /* 54 */:
                                        case Token.THROW /* 55 */:
                                        case Token.RETHROW /* 56 */:
                                        case Token.IN /* 57 */:
                                        case Token.INSTANCEOF /* 58 */:
                                        case Token.LOCAL_LOAD /* 59 */:
                                        case 60:
                                        case 61:
                                        case Token.CATCH_SCOPE /* 62 */:
                                        case Token.ENUM_INIT_KEYS /* 63 */:
                                        case Token.ENUM_INIT_VALUES /* 64 */:
                                        case Token.ENUM_INIT_ARRAY /* 65 */:
                                        case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                                        case Token.ENUM_NEXT /* 67 */:
                                        case Token.ENUM_ID /* 68 */:
                                        case Token.THISFN /* 69 */:
                                        case Token.RETURN_RESULT /* 70 */:
                                        case Token.ARRAYLIT /* 71 */:
                                        case Token.OBJECTLIT /* 72 */:
                                        case Token.GET_REF /* 73 */:
                                        case Token.SET_REF /* 74 */:
                                        case Token.DEL_REF /* 75 */:
                                        case Token.REF_CALL /* 76 */:
                                        case Token.REF_SPECIAL /* 77 */:
                                        case Token.YIELD /* 78 */:
                                        case Token.SUPER /* 79 */:
                                        case Token.STRICT_SETNAME /* 80 */:
                                        case Token.EXP /* 81 */:
                                        case Token.DEFAULTNAMESPACE /* 82 */:
                                        case Token.ESCXMLATTR /* 83 */:
                                        case Token.ESCXMLTEXT /* 84 */:
                                        case Token.REF_MEMBER /* 85 */:
                                        case Token.REF_NS_MEMBER /* 86 */:
                                        case Token.REF_NAME /* 87 */:
                                        case Token.REF_NS_NAME /* 88 */:
                                        case 89:
                                        case Token.TRY /* 90 */:
                                        case Token.SEMI /* 91 */:
                                        case Token.LB /* 92 */:
                                        case Token.RB /* 93 */:
                                        case Token.LC /* 94 */:
                                        case Token.RC /* 95 */:
                                        case Token.LP /* 96 */:
                                        case Token.RP /* 97 */:
                                        case Token.COMMA /* 98 */:
                                        case 99:
                                        case 100:
                                        case Token.ASSIGN_LOGICAL_OR /* 101 */:
                                        case Token.ASSIGN_BITXOR /* 102 */:
                                        case Token.ASSIGN_BITAND /* 103 */:
                                        case Token.ASSIGN_LOGICAL_AND /* 104 */:
                                        case Token.ASSIGN_LSH /* 105 */:
                                        case Token.ASSIGN_RSH /* 106 */:
                                        case Token.ASSIGN_URSH /* 107 */:
                                        case Token.ASSIGN_ADD /* 108 */:
                                        case Token.ASSIGN_SUB /* 109 */:
                                        case 110:
                                        case Token.ASSIGN_DIV /* 111 */:
                                        case Token.ASSIGN_MOD /* 112 */:
                                        case Token.ASSIGN_EXP /* 113 */:
                                        case 114:
                                        case Token.HOOK /* 115 */:
                                        case Token.COLON /* 116 */:
                                        case Token.OR /* 117 */:
                                        case Token.AND /* 118 */:
                                        case Token.INC /* 119 */:
                                        case 120:
                                        case Token.DOT /* 121 */:
                                        case Token.FUNCTION /* 122 */:
                                        case Token.EXPORT /* 123 */:
                                        case Token.IMPORT /* 124 */:
                                        case Token.IF /* 125 */:
                                        case Token.ELSE /* 126 */:
                                        case 127:
                                        case 128:
                                        case Token.DEFAULT /* 129 */:
                                        case 130:
                                        case Token.DO /* 131 */:
                                        case Token.FOR /* 132 */:
                                        case Token.BREAK /* 133 */:
                                        case Token.CONTINUE /* 134 */:
                                        case Token.VAR /* 135 */:
                                        case Token.WITH /* 136 */:
                                        case Token.CATCH /* 137 */:
                                        case Token.FINALLY /* 138 */:
                                        case Token.VOID /* 139 */:
                                            z = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z = true;
                                break;
                        }
                    } else {
                        str2 = Build.MODEL;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b = -1;
                                } else {
                                    b = 0;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b = -1;
                                } else {
                                    b = 2;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b = -1;
                                } else {
                                    b = 3;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b = -1;
                                } else {
                                    b = 4;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b = -1;
                                } else {
                                    b = 5;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b = -1;
                                } else {
                                    b = 6;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b = -1;
                                } else {
                                    b = 7;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b = -1;
                                } else {
                                    b = 8;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            default:
                                if (i <= 26) {
                                    str3 = Build.DEVICE;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 0;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 2;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 3;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 4;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 5;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 6;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 7;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 8;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 9;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 10;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 11;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 12;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 13;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 14;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 15;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 16;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 17;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 18;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 19;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 20;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 21;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 22;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 23;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 24;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 25;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 26;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 27;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b3 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 29;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 30;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 31;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 32;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 33;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 34;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 35;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 36;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 37;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 38;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 39;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 40;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 41;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 42;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 43;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 44;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 45;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 46;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 47;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 48;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 49;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 50;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 51;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 52;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 53;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 54;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 55;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 56;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 57;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 58;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 59;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 60;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 61;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 62;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 63;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 64;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 65;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 66;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 67;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 68;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 69;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 70;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 71;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 72;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 73;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 74;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 75;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 76;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 77;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 78;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 79;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 80;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 81;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 82;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 83;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 84;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 85;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 86;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 87;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 88;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 89;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 90;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 91;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 92;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 93;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 94;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 95;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 96;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 97;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 98;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 99;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 100;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 101;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 102;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 103;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 104;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 105;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 106;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 107;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 108;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 109;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 110;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 111;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 112;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 113;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 114;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 115;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 116;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 117;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 118;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 119;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 120;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 121;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 122;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 123;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 124;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 125;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 126;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 127;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 128;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 129;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 130;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 131;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 132;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 133;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 134;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 135;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 136;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 137;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 138;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b3 = -1;
                                            } else {
                                                b3 = 139;
                                            }
                                            break;
                                        default:
                                            b3 = -1;
                                            break;
                                    }
                                    switch (b3) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case 25:
                                        case 26:
                                        case 27:
                                        case 28:
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32:
                                        case Token.GETPROP /* 33 */:
                                        case Token.GETPROPNOWARN /* 34 */:
                                        case 35:
                                        case Token.GETPROPNOWARN_SUPER /* 36 */:
                                        case Token.SETPROP /* 37 */:
                                        case Token.SETPROP_SUPER /* 38 */:
                                        case Token.GETELEM /* 39 */:
                                        case Token.GETELEM_SUPER /* 40 */:
                                        case Token.SETELEM /* 41 */:
                                        case Token.SETELEM_SUPER /* 42 */:
                                        case Token.CALL /* 43 */:
                                        case Token.NAME /* 44 */:
                                        case Token.NUMBER /* 45 */:
                                        case Token.STRING /* 46 */:
                                        case Token.NULL /* 47 */:
                                        case Token.THIS /* 48 */:
                                        case Token.FALSE /* 49 */:
                                        case Token.TRUE /* 50 */:
                                        case Token.SHEQ /* 51 */:
                                        case Token.SHNE /* 52 */:
                                        case Token.REGEXP /* 53 */:
                                        case Token.BINDNAME /* 54 */:
                                        case Token.THROW /* 55 */:
                                        case Token.RETHROW /* 56 */:
                                        case Token.IN /* 57 */:
                                        case Token.INSTANCEOF /* 58 */:
                                        case Token.LOCAL_LOAD /* 59 */:
                                        case 60:
                                        case 61:
                                        case Token.CATCH_SCOPE /* 62 */:
                                        case Token.ENUM_INIT_KEYS /* 63 */:
                                        case Token.ENUM_INIT_VALUES /* 64 */:
                                        case Token.ENUM_INIT_ARRAY /* 65 */:
                                        case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                                        case Token.ENUM_NEXT /* 67 */:
                                        case Token.ENUM_ID /* 68 */:
                                        case Token.THISFN /* 69 */:
                                        case Token.RETURN_RESULT /* 70 */:
                                        case Token.ARRAYLIT /* 71 */:
                                        case Token.OBJECTLIT /* 72 */:
                                        case Token.GET_REF /* 73 */:
                                        case Token.SET_REF /* 74 */:
                                        case Token.DEL_REF /* 75 */:
                                        case Token.REF_CALL /* 76 */:
                                        case Token.REF_SPECIAL /* 77 */:
                                        case Token.YIELD /* 78 */:
                                        case Token.SUPER /* 79 */:
                                        case Token.STRICT_SETNAME /* 80 */:
                                        case Token.EXP /* 81 */:
                                        case Token.DEFAULTNAMESPACE /* 82 */:
                                        case Token.ESCXMLATTR /* 83 */:
                                        case Token.ESCXMLTEXT /* 84 */:
                                        case Token.REF_MEMBER /* 85 */:
                                        case Token.REF_NS_MEMBER /* 86 */:
                                        case Token.REF_NAME /* 87 */:
                                        case Token.REF_NS_NAME /* 88 */:
                                        case 89:
                                        case Token.TRY /* 90 */:
                                        case Token.SEMI /* 91 */:
                                        case Token.LB /* 92 */:
                                        case Token.RB /* 93 */:
                                        case Token.LC /* 94 */:
                                        case Token.RC /* 95 */:
                                        case Token.LP /* 96 */:
                                        case Token.RP /* 97 */:
                                        case Token.COMMA /* 98 */:
                                        case 99:
                                        case 100:
                                        case Token.ASSIGN_LOGICAL_OR /* 101 */:
                                        case Token.ASSIGN_BITXOR /* 102 */:
                                        case Token.ASSIGN_BITAND /* 103 */:
                                        case Token.ASSIGN_LOGICAL_AND /* 104 */:
                                        case Token.ASSIGN_LSH /* 105 */:
                                        case Token.ASSIGN_RSH /* 106 */:
                                        case Token.ASSIGN_URSH /* 107 */:
                                        case Token.ASSIGN_ADD /* 108 */:
                                        case Token.ASSIGN_SUB /* 109 */:
                                        case 110:
                                        case Token.ASSIGN_DIV /* 111 */:
                                        case Token.ASSIGN_MOD /* 112 */:
                                        case Token.ASSIGN_EXP /* 113 */:
                                        case 114:
                                        case Token.HOOK /* 115 */:
                                        case Token.COLON /* 116 */:
                                        case Token.OR /* 117 */:
                                        case Token.AND /* 118 */:
                                        case Token.INC /* 119 */:
                                        case 120:
                                        case Token.DOT /* 121 */:
                                        case Token.FUNCTION /* 122 */:
                                        case Token.EXPORT /* 123 */:
                                        case Token.IMPORT /* 124 */:
                                        case Token.IF /* 125 */:
                                        case Token.ELSE /* 126 */:
                                        case 127:
                                        case 128:
                                        case Token.DEFAULT /* 129 */:
                                        case 130:
                                        case Token.DO /* 131 */:
                                        case Token.FOR /* 132 */:
                                        case Token.BREAK /* 133 */:
                                        case Token.CONTINUE /* 134 */:
                                        case Token.VAR /* 135 */:
                                        case Token.WITH /* 136 */:
                                        case Token.CATCH /* 137 */:
                                        case Token.FINALLY /* 138 */:
                                        case Token.VOID /* 139 */:
                                            z = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z = true;
                                break;
                        }
                    }
                    a2 = z;
                    Z1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    public static int F0(androidx.media3.exoplayer.mediacodec.o oVar, androidx.media3.common.r rVar) {
        int i = rVar.v;
        int i2 = rVar.w;
        if (i != -1 && i2 != -1) {
            String str = rVar.o;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                Pair pairB = androidx.media3.common.util.f.b(rVar);
                if (pairB == null) {
                    str = "video/hevc";
                } else {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                        str = "video/avc";
                    } else if (iIntValue == 1024) {
                        str = "video/av01";
                    } else {
                        str = "video/hevc";
                    }
                }
            }
            switch (str) {
                case "video/3gpp":
                case "video/av01":
                case "video/mp4v-es":
                case "video/x-vnd.on2.vp8":
                    return ((i * i2) * 3) / 4;
                case "video/hevc":
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                case "video/avc":
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !oVar.f)))) {
                        return ((j0.g(i2, 16) * j0.g(i, 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    return ((i * i2) * 3) / 8;
            }
        }
        return -1;
    }

    public static List G0(Context context, androidx.media3.exoplayer.mediacodec.i iVar, androidx.media3.common.r rVar, boolean z, boolean z2) {
        String str = rVar.o;
        if (str == null) {
            return a1.B;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !androidx.media3.common.audio.h.k(context)) {
            String strC = androidx.media3.exoplayer.mediacodec.v.c(rVar);
            List listB = strC == null ? a1.B : iVar.b(strC, z, z2);
            if (!listB.isEmpty()) {
                return listB;
            }
        }
        return androidx.media3.exoplayer.mediacodec.v.g(iVar, rVar, z, z2);
    }

    public static int H0(androidx.media3.exoplayer.mediacodec.o oVar, androidx.media3.common.r rVar) {
        int i = rVar.p;
        List list = rVar.r;
        if (i == -1) {
            return F0(oVar, rVar);
        }
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += ((byte[]) list.get(i2)).length;
        }
        return rVar.p + length;
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final int A0(androidx.media3.exoplayer.mediacodec.i iVar, androidx.media3.common.r rVar) {
        boolean z;
        int i = 0;
        if (!i0.o(rVar.o)) {
            return androidx.media3.exoplayer.a.f(0, 0, 0, 0);
        }
        int i2 = 1;
        boolean z2 = rVar.s != null;
        Context context = this.f1;
        List listG0 = G0(context, iVar, rVar, z2, false);
        if (z2 && listG0.isEmpty()) {
            listG0 = G0(context, iVar, rVar, false, false);
        }
        if (listG0.isEmpty()) {
            return androidx.media3.exoplayer.a.f(1, 0, 0, 0);
        }
        int i3 = rVar.P;
        int i4 = 2;
        if (i3 != 0 && i3 != 2) {
            return androidx.media3.exoplayer.a.f(2, 0, 0, 0);
        }
        androidx.media3.exoplayer.mediacodec.o oVar = (androidx.media3.exoplayer.mediacodec.o) listG0.get(0);
        boolean zE = oVar.e(context, rVar);
        if (!zE) {
            int i5 = 1;
            while (true) {
                if (i5 >= listG0.size()) {
                    z = true;
                    break;
                }
                androidx.media3.exoplayer.mediacodec.o oVar2 = (androidx.media3.exoplayer.mediacodec.o) listG0.get(i5);
                if (oVar2.e(context, rVar)) {
                    z = false;
                    zE = true;
                    oVar = oVar2;
                    break;
                }
                i5++;
            }
        } else {
            z = true;
            break;
        }
        int i6 = zE ? 4 : 3;
        int i7 = oVar.f(rVar) ? 16 : 8;
        int i8 = oVar.g ? 64 : 0;
        int i9 = z ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(rVar.o) && !androidx.media3.common.audio.h.k(context)) {
            i9 = LibretroCore.SCREEN_WIDTH;
        }
        if (zE) {
            List listG1 = G0(context, iVar, rVar, z2, true);
            if (!listG1.isEmpty()) {
                HashMap map = androidx.media3.exoplayer.mediacodec.v.a;
                ArrayList arrayList = new ArrayList(listG1);
                Collections.sort(arrayList, new androidx.compose.ui.semantics.y(new androidx.media3.exoplayer.analytics.c(i4, context, rVar), i2));
                androidx.media3.exoplayer.mediacodec.o oVar3 = (androidx.media3.exoplayer.mediacodec.o) arrayList.get(0);
                if (oVar3.e(context, rVar) && oVar3.f(rVar)) {
                    i = 32;
                }
            }
        }
        return i6 | i7 | i | i8 | i9;
    }

    @Override // androidx.media3.exoplayer.mediacodec.r, androidx.media3.exoplayer.a
    public final void C(float f, float f2) throws androidx.media3.exoplayer.j {
        super.C(f, f2);
        h0 h0Var = this.t1;
        if (h0Var != null) {
            h0Var.l(f);
        } else {
            this.k1.h(f);
        }
        x xVar = this.o1;
        if (xVar != null) {
            xVar.c(f);
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final boolean F(long j) {
        if (this.O0 == -9223372036854775807L || j < this.I1) {
            return false;
        }
        long j2 = this.W0;
        return j2 == -9223372036854775807L || j > j2;
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final androidx.media3.exoplayer.d I(androidx.media3.exoplayer.mediacodec.o oVar, androidx.media3.common.r rVar, androidx.media3.common.r rVar2, boolean z) {
        int i;
        androidx.media3.exoplayer.d dVarB = oVar.b(rVar, rVar2);
        float f = rVar.z;
        float f2 = rVar2.z;
        int i2 = dVarB.e;
        androidx.media3.container.j jVar = this.q1;
        jVar.getClass();
        if (rVar2.v > jVar.a || rVar2.w > jVar.b) {
            i2 |= LibretroCore.SCREEN_WIDTH;
        }
        if (H0(oVar, rVar2) > jVar.c) {
            i2 |= 64;
        }
        if (this.C1 != Integer.MIN_VALUE && (i = Build.VERSION.SDK_INT) < 31 && ((i != 30 || Build.MODEL.startsWith("MiTV")) && f != -1.0f && f2 != -1.0f && (!oVar.f || !z))) {
            float fMax = Math.max(f2, f) / Math.min(f2, f);
            if (Math.abs(fMax - Math.round(fMax)) > 0.01f) {
                i2 |= Parser.ARGC_LIMIT;
            }
        }
        int i3 = i2;
        return new androidx.media3.exoplayer.d(oVar.a, rVar, rVar2, i3 != 0 ? 0 : dVarB.d, i3);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Surface I0(androidx.media3.exoplayer.mediacodec.o oVar) {
        boolean z;
        l lVar;
        int i;
        RuntimeException runtimeException;
        Error error;
        h0 h0Var = this.t1;
        if (h0Var != null) {
            return h0Var.b();
        }
        Surface surface = this.x1;
        if (surface != null) {
            return surface;
        }
        if (Build.VERSION.SDK_INT >= 35 && oVar.h) {
            return null;
        }
        com.google.android.material.motion.a.q(Q0(oVar));
        m mVar = this.y1;
        if (mVar != null && mVar.e != oVar.f && mVar != null) {
            mVar.release();
            this.y1 = null;
        }
        if (this.y1 == null) {
            Context context = this.f1;
            boolean z2 = oVar.f;
            boolean z3 = false;
            if (z2) {
                if (!m.b(context)) {
                    z = false;
                }
                com.google.android.material.motion.a.q(z);
                lVar = new l("ExoPlayer:PlaceholderSurface");
                if (z2) {
                    i = m.A;
                } else {
                    i = 0;
                }
                lVar.start();
                Handler handler = new Handler(lVar.getLooper(), lVar);
                lVar.y = handler;
                lVar.e = new androidx.media3.common.util.j(handler);
                synchronized (lVar) {
                    lVar.y.obtainMessage(1, i, 0).sendToTarget();
                    while (lVar.B == null && lVar.A == null && lVar.z == null) {
                        try {
                            lVar.wait();
                        } catch (InterruptedException unused) {
                            z3 = true;
                        }
                    }
                }
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = lVar.A;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = lVar.z;
                if (error == null) {
                    throw error;
                }
                m mVar2 = lVar.B;
                mVar2.getClass();
                this.y1 = mVar2;
            } else {
                int i2 = m.A;
            }
            z = true;
            com.google.android.material.motion.a.q(z);
            lVar = new l("ExoPlayer:PlaceholderSurface");
            if (z2) {
                i = m.A;
            } else {
                i = 0;
            }
            lVar.start();
            Handler handler2 = new Handler(lVar.getLooper(), lVar);
            lVar.y = handler2;
            lVar.e = new androidx.media3.common.util.j(handler2);
            synchronized (lVar) {
                lVar.y.obtainMessage(1, i, 0).sendToTarget();
                while (lVar.B == null) {
                    lVar.wait();
                }
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                runtimeException = lVar.A;
                if (runtimeException == null) {
                    throw runtimeException;
                }
                error = lVar.z;
                if (error == null) {
                    throw error;
                }
                m mVar3 = lVar.B;
                mVar3.getClass();
                this.y1 = mVar3;
            }
        }
        return this.y1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final androidx.media3.exoplayer.mediacodec.n J(IllegalStateException illegalStateException, androidx.media3.exoplayer.mediacodec.o oVar) {
        Surface surface = this.x1;
        f fVar = new f(illegalStateException, oVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return fVar;
    }

    public final boolean J0(androidx.media3.exoplayer.mediacodec.o oVar) {
        if (this.t1 != null) {
            return true;
        }
        Surface surface = this.x1;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && oVar.h) || Q0(oVar);
        }
        return true;
    }

    public final boolean K0(androidx.media3.decoder.e eVar) {
        if (l() || eVar.g(536870912)) {
            return true;
        }
        long j = this.V1;
        return j == -9223372036854775807L || j - (eVar.D - this.V0.c) <= 100000;
    }

    public final void L0() {
        if (this.E1 > 0) {
            this.D.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.D1;
            int i = this.E1;
            androidx.media3.exoplayer.audio.t tVar = this.h1;
            Handler handler = tVar.a;
            if (handler != null) {
                handler.post(new d0(tVar, i, j));
            }
            this.E1 = 0;
            this.D1 = jElapsedRealtime;
        }
    }

    public final void M0() {
        androidx.media3.exoplayer.mediacodec.l lVar;
        if (this.Q1 && (lVar = this.k0) != null) {
            this.S1 = new j(this, lVar);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                lVar.d(bundle);
            }
        }
    }

    public final void N0(androidx.media3.exoplayer.mediacodec.l lVar, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        lVar.k(i, j);
        Trace.endSection();
        this.U0.e++;
        this.F1 = 0;
        if (this.t1 == null) {
            f1 f1Var = this.N1;
            boolean zEquals = f1Var.equals(f1.d);
            androidx.media3.exoplayer.audio.t tVar = this.h1;
            if (!zEquals && !f1Var.equals(this.O1)) {
                this.O1 = f1Var;
                tVar.b(f1Var);
            }
            w wVar = this.k1;
            boolean z = wVar.e != 3;
            wVar.e = 3;
            wVar.l.getClass();
            wVar.g = j0.Q(SystemClock.elapsedRealtime());
            if (!z || (surface = this.x1) == null) {
                return;
            }
            Handler handler = tVar.a;
            if (handler != null) {
                handler.post(new com.google.firebase.crashlytics.internal.common.o(tVar, surface, SystemClock.elapsedRealtime()));
            }
            this.A1 = true;
        }
    }

    public final void O0(Object obj) throws androidx.media3.exoplayer.j {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.x1;
        androidx.media3.exoplayer.audio.t tVar = this.h1;
        if (surface2 == surface) {
            if (surface != null) {
                f1 f1Var = this.O1;
                if (f1Var != null) {
                    tVar.b(f1Var);
                }
                Surface surface3 = this.x1;
                if (surface3 == null || !this.A1 || (handler = tVar.a) == null) {
                    return;
                }
                handler.post(new com.google.firebase.crashlytics.internal.common.o(tVar, surface3, SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        this.x1 = surface;
        h0 h0Var = this.t1;
        w wVar = this.k1;
        if (h0Var == null) {
            wVar.g(surface);
        }
        this.A1 = false;
        int i = this.E;
        androidx.media3.exoplayer.mediacodec.l lVar = this.k0;
        if (lVar != null && this.t1 == null) {
            androidx.media3.exoplayer.mediacodec.o oVar = this.r0;
            oVar.getClass();
            if (!J0(oVar) || this.r1) {
                o0();
                Y();
            } else {
                Surface surfaceI0 = I0(oVar);
                if (surfaceI0 != null) {
                    lVar.q(surfaceI0);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        org.mozilla.javascript.c.a();
                        return;
                    }
                    lVar.j();
                }
            }
        }
        if (surface != null) {
            f1 f1Var2 = this.O1;
            if (f1Var2 != null) {
                tVar.b(f1Var2);
            }
        } else {
            this.O1 = null;
            h0 h0Var2 = this.t1;
            if (h0Var2 != null) {
                h0Var2.m();
            }
        }
        if (i == 2) {
            h0 h0Var3 = this.t1;
            if (h0Var3 != null) {
                h0Var3.r(true);
            } else {
                wVar.c(true);
            }
        }
        M0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final int P(androidx.media3.decoder.e eVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.H1 == null && !this.Q1) || eVar.D >= this.I || K0(eVar)) ? 0 : 32;
        }
        return 0;
    }

    public final boolean P0(long j, long j2, boolean z, boolean z2) throws androidx.media3.exoplayer.j {
        if (this.t1 != null && this.g1) {
            j2 -= -this.U1;
        }
        if (j < -500000 && !z) {
            w0 w0Var = this.F;
            w0Var.getClass();
            int iG = w0Var.g(j2 - this.H);
            if (iG != 0) {
                this.I1 = j2;
                androidx.media3.exoplayer.c cVar = this.U0;
                PriorityQueue priorityQueue = this.p1;
                if (z2) {
                    int i = cVar.d + iG;
                    cVar.d = i;
                    cVar.f += this.G1;
                    cVar.d = priorityQueue.size() + i;
                } else {
                    cVar.j++;
                    S0(priorityQueue.size() + iG, this.G1);
                }
                if (this.k0 != null) {
                    if (y0()) {
                        o0();
                        Y();
                    } else if (w0()) {
                        N();
                    } else {
                        this.Z0 = true;
                    }
                }
                h0 h0Var = this.t1;
                if (h0Var != null) {
                    h0Var.o(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final float Q(float f, androidx.media3.common.r rVar, androidx.media3.common.r[] rVarArr) {
        androidx.media3.exoplayer.mediacodec.o oVar;
        float fMax = -1.0f;
        for (androidx.media3.common.r rVar2 : rVarArr) {
            float f2 = rVar2.z;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        float f3 = fMax == -1.0f ? -1.0f : fMax * f;
        if (this.H1 == null || (oVar = this.r0) == null) {
            return f3;
        }
        int i = rVar.v;
        int i2 = rVar.w;
        float f4 = -3.4028235E38f;
        if (oVar.i) {
            float f5 = oVar.l;
            if (f5 != -3.4028235E38f && oVar.j == i && oVar.k == i2) {
                f4 = f5;
            } else {
                float f6 = 1024.0f;
                if (!oVar.g(i, i2, 1024.0f)) {
                    f4 = 0.0f;
                    while (true) {
                        float f7 = f6 - f4;
                        if (Math.abs(f7) <= 5.0f) {
                            break;
                        }
                        float f8 = (f7 / 2.0f) + f4;
                        if (oVar.g(i, i2, f8)) {
                            f4 = f8;
                        } else {
                            f6 = f8;
                        }
                    }
                } else {
                    f4 = 1024.0f;
                }
                oVar.l = f4;
                oVar.j = i;
                oVar.k = i2;
            }
        }
        return f3 != -1.0f ? Math.max(f3, f4) : f4;
    }

    public final boolean Q0(androidx.media3.exoplayer.mediacodec.o oVar) {
        if (this.Q1 || E0(oVar.a)) {
            return false;
        }
        return !oVar.f || m.b(this.f1);
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final ArrayList R(androidx.media3.exoplayer.mediacodec.i iVar, androidx.media3.common.r rVar, boolean z) {
        boolean z2 = this.Q1;
        Context context = this.f1;
        List listG0 = G0(context, iVar, rVar, z, z2);
        HashMap map = androidx.media3.exoplayer.mediacodec.v.a;
        ArrayList arrayList = new ArrayList(listG0);
        Collections.sort(arrayList, new androidx.compose.ui.semantics.y(new androidx.media3.exoplayer.analytics.c(2, context, rVar), 1));
        return arrayList;
    }

    public final void R0(androidx.media3.exoplayer.mediacodec.l lVar, int i) {
        Trace.beginSection("skipVideoBuffer");
        lVar.g(i);
        Trace.endSection();
        this.U0.f++;
    }

    public final void S0(int i, int i2) {
        androidx.media3.exoplayer.c cVar = this.U0;
        cVar.h += i;
        int i3 = i + i2;
        cVar.g += i3;
        this.E1 += i3;
        int i4 = this.F1 + i3;
        this.F1 = i4;
        cVar.i = Math.max(i4, cVar.i);
        int i5 = this.i1;
        if (i5 <= 0 || this.E1 < i5) {
            return;
        }
        L0();
    }

    public final void T0(androidx.media3.exoplayer.source.v vVar) {
        v0 v0Var = this.M;
        if (v0Var.p()) {
            this.V1 = -9223372036854775807L;
            return;
        }
        int iB = v0Var.b(vVar.a);
        if (iB == -1) {
            this.V1 = -9223372036854775807L;
        } else {
            this.V1 = v0Var.f(iB, new t0(), false).d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x013c  */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x013c, please report this as an issue */
    @Override // androidx.media3.exoplayer.mediacodec.r
    public final y1 U(androidx.media3.exoplayer.mediacodec.o oVar, androidx.media3.common.r rVar, MediaCrypto mediaCrypto, float f) {
        androidx.media3.common.h hVar;
        int i;
        androidx.media3.container.j jVar;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        byte b;
        boolean z;
        Pair pairB;
        int iF0;
        String str = oVar.c;
        androidx.media3.common.r[] rVarArr = this.G;
        rVarArr.getClass();
        int i2 = rVar.v;
        float f2 = rVar.z;
        androidx.media3.common.h hVar2 = rVar.E;
        int i3 = rVar.w;
        int iH0 = H0(oVar, rVar);
        if (rVarArr.length == 1) {
            if (iH0 != -1 && (iF0 = F0(oVar, rVar)) != -1) {
                iH0 = Math.min((int) (iH0 * 1.5f), iF0);
            }
            jVar = new androidx.media3.container.j(i2, i3, iH0);
            hVar = hVar2;
            i = i3;
        } else {
            int length = rVarArr.length;
            int iMax = i2;
            int iMax2 = i3;
            int i4 = 0;
            boolean z2 = false;
            while (i4 < length) {
                androidx.media3.common.r rVar2 = rVarArr[i4];
                androidx.media3.common.r[] rVarArr2 = rVarArr;
                if (hVar2 != null && rVar2.E == null) {
                    androidx.media3.common.q qVarA = rVar2.a();
                    qVarA.D = hVar2;
                    rVar2 = new androidx.media3.common.r(qVarA);
                }
                androidx.media3.exoplayer.d dVarB = oVar.b(rVar, rVar2);
                int i5 = length;
                int i6 = rVar2.w;
                if (dVarB.d != 0) {
                    int i7 = rVar2.v;
                    b = -1;
                    z2 |= i7 == -1 || i6 == -1;
                    iMax = Math.max(iMax, i7);
                    iMax2 = Math.max(iMax2, i6);
                    iH0 = Math.max(iH0, H0(oVar, rVar2));
                } else {
                    b = -1;
                }
                length = i5;
                i4++;
                rVarArr = rVarArr2;
            }
            if (z2) {
                androidx.media3.common.util.c.t("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z3 = i3 > i2;
                int i8 = z3 ? i3 : i2;
                boolean z4 = z3;
                int i9 = z3 ? i2 : i3;
                float f3 = i9 / i8;
                int i10 = 0;
                while (true) {
                    hVar = hVar2;
                    if (i10 < 9) {
                        int i11 = Y1[i10];
                        int i12 = i10;
                        int i13 = (int) (i11 * f3);
                        if (i11 > i8 && i13 > i9) {
                            if (!z4) {
                                i13 = i11;
                            }
                            if (!z4) {
                                i11 = i13;
                            }
                            int i14 = i9;
                            MediaCodecInfo.CodecCapabilities codecCapabilities = oVar.d;
                            if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                point = null;
                            } else {
                                int widthAlignment = videoCapabilities.getWidthAlignment();
                                int heightAlignment = videoCapabilities.getHeightAlignment();
                                point = new Point(j0.g(i13, widthAlignment) * widthAlignment, j0.g(i11, heightAlignment) * heightAlignment);
                            }
                            if (point != null) {
                                i = i3;
                                if (oVar.g(point.x, point.y, f2)) {
                                }
                            } else {
                                i = i3;
                            }
                            i10 = i12 + 1;
                            i3 = i;
                            hVar2 = hVar;
                            i9 = i14;
                            i8 = i8;
                        }
                        if (point != null) {
                            iMax = Math.max(iMax, point.x);
                            iMax2 = Math.max(iMax2, point.y);
                            androidx.media3.common.q qVarA2 = rVar.a();
                            qVarA2.u = iMax;
                            qVarA2.v = iMax2;
                            iH0 = Math.max(iH0, F0(oVar, new androidx.media3.common.r(qVarA2)));
                            androidx.media3.common.util.c.t("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                        }
                    }
                    i = i3;
                    point = null;
                    if (point != null) {
                        iMax = Math.max(iMax, point.x);
                        iMax2 = Math.max(iMax2, point.y);
                        androidx.media3.common.q qVarA3 = rVar.a();
                        qVarA3.u = iMax;
                        qVarA3.v = iMax2;
                        iH0 = Math.max(iH0, F0(oVar, new androidx.media3.common.r(qVarA3)));
                        androidx.media3.common.util.c.t("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                    }
                }
            } else {
                hVar = hVar2;
                i = i3;
            }
            jVar = new androidx.media3.container.j(iMax, iMax2, iH0);
        }
        this.q1 = jVar;
        int i15 = this.Q1 ? this.R1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i2);
        mediaFormat.setInteger("height", i);
        androidx.media3.common.util.c.s(mediaFormat, rVar.r);
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        androidx.media3.common.util.c.o(mediaFormat, "rotation-degrees", rVar.A);
        if (hVar != null) {
            androidx.media3.common.h hVar3 = hVar;
            androidx.media3.common.util.c.o(mediaFormat, "color-transfer", hVar3.c);
            androidx.media3.common.util.c.o(mediaFormat, "color-standard", hVar3.a);
            androidx.media3.common.util.c.o(mediaFormat, "color-range", hVar3.b);
            byte[] bArr = hVar3.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(rVar.o) && (pairB = androidx.media3.common.util.f.b(rVar)) != null) {
            androidx.media3.common.util.c.o(mediaFormat, "profile", ((Integer) pairB.first).intValue());
        }
        mediaFormat.setInteger("max-width", jVar.a);
        mediaFormat.setInteger("max-height", jVar.b);
        androidx.media3.common.util.c.o(mediaFormat, "max-input-size", jVar.c);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (this.j1) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i15 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i15);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.P1));
        }
        G(mediaFormat);
        Surface surfaceI0 = I0(oVar);
        if (this.t1 != null && !j0.N(this.f1)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new y1(oVar, mediaFormat, rVar, surfaceI0, mediaCrypto, null);
    }

    public final void U0(long j) {
        androidx.media3.exoplayer.c cVar = this.U0;
        cVar.k += j;
        cVar.l++;
        this.K1 += j;
        this.L1++;
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final void V(androidx.media3.decoder.e eVar) {
        if (this.s1) {
            ByteBuffer byteBuffer = eVar.E;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        androidx.media3.exoplayer.mediacodec.l lVar = this.k0;
                        lVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        lVar.d(bundle);
                    }
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final boolean a0(androidx.media3.common.r rVar) throws androidx.media3.exoplayer.j {
        h0 h0Var = this.t1;
        if (h0Var == null || h0Var.isInitialized()) {
            return true;
        }
        try {
            return this.t1.u(rVar);
        } catch (g0 e) {
            throw g(e, rVar, false, 7000);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final void b0(Exception exc) {
        androidx.media3.common.util.c.g("MediaCodecVideoRenderer", "Video codec error", exc);
        androidx.media3.exoplayer.audio.t tVar = this.h1;
        Handler handler = tVar.a;
        if (handler != null) {
            handler.post(new d0(tVar, exc, 6));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final void c0(long j, long j2, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        androidx.media3.exoplayer.audio.t tVar = this.h1;
        Handler handler = tVar.a;
        if (handler != null) {
            str2 = str;
            handler.post(new d0(tVar, str2, j, j2));
        } else {
            str2 = str;
        }
        this.r1 = E0(str2);
        androidx.media3.exoplayer.mediacodec.o oVar = this.r0;
        oVar.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(oVar.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = oVar.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z = true;
                    break;
                }
            }
        }
        this.s1 = z;
        M0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.r, androidx.media3.exoplayer.a, androidx.media3.exoplayer.d1
    public final void d(int i, Object obj) throws androidx.media3.exoplayer.j {
        if (i == 1) {
            O0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            u uVar = (u) obj;
            this.T1 = uVar;
            h0 h0Var = this.t1;
            if (h0Var != null) {
                h0Var.i(uVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.R1 != iIntValue) {
                this.R1 = iIntValue;
                if (this.Q1) {
                    o0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.B1 = iIntValue2;
            androidx.media3.exoplayer.mediacodec.l lVar = this.k0;
            if (lVar != null) {
                lVar.n(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.C1 = iIntValue3;
            h0 h0Var2 = this.t1;
            if (h0Var2 != null) {
                h0Var2.k(iIntValue3);
                return;
            }
            b0 b0Var = this.k1.b;
            if (b0Var.j == iIntValue3) {
                return;
            }
            b0Var.j = iIntValue3;
            b0Var.d(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(e1.a)) {
                h0 h0Var3 = this.t1;
                if (h0Var3 == null || !h0Var3.isInitialized()) {
                    return;
                }
                this.t1.t();
                return;
            }
            this.w1 = list;
            h0 h0Var4 = this.t1;
            if (h0Var4 != null) {
                h0Var4.p(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            androidx.media3.common.util.x xVar = (androidx.media3.common.util.x) obj;
            if (xVar.a == 0 || xVar.b == 0) {
                return;
            }
            this.z1 = xVar;
            h0 h0Var5 = this.t1;
            if (h0Var5 != null) {
                Surface surface = this.x1;
                surface.getClass();
                h0Var5.d(surface, xVar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.P1 = ((Integer) obj).intValue();
                androidx.media3.exoplayer.mediacodec.l lVar2 = this.k0;
                if (lVar2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.P1));
                    lVar2.d(bundle);
                }
                break;
            case 17:
                Surface surface2 = this.x1;
                O0(null);
                obj.getClass();
                ((k) obj).d(1, surface2);
                break;
            case 18:
                boolean z = this.H1 != null;
                j1 j1Var = (j1) obj;
                this.H1 = j1Var;
                if (z != (j1Var != null)) {
                    B0(this.l0);
                }
                break;
            default:
                super.d(i, obj);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final void d0(androidx.media3.exoplayer.b bVar) {
        androidx.media3.exoplayer.audio.t tVar = this.h1;
        Handler handler = tVar.a;
        if (handler != null) {
            handler.post(new androidx.activity.c(27, tVar, bVar));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final void e0(String str) {
        androidx.media3.exoplayer.audio.t tVar = this.h1;
        Handler handler = tVar.a;
        if (handler != null) {
            handler.post(new d0(tVar, str, 1));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final androidx.media3.exoplayer.d f0(androidx.media3.common.util.b bVar) throws androidx.media3.exoplayer.j {
        androidx.media3.exoplayer.d dVarF0 = super.f0(bVar);
        androidx.media3.common.r rVar = (androidx.media3.common.r) bVar.z;
        rVar.getClass();
        androidx.media3.exoplayer.audio.t tVar = this.h1;
        Handler handler = tVar.a;
        if (handler != null) {
            handler.post(new d0(tVar, rVar, dVarF0));
        }
        x xVar = this.o1;
        if (xVar != null) {
            xVar.b();
        }
        return dVarF0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final void g0(androidx.media3.common.r rVar, MediaFormat mediaFormat) {
        int integer;
        int i;
        androidx.media3.exoplayer.mediacodec.l lVar = this.k0;
        if (lVar != null) {
            lVar.n(this.B1);
        }
        if (this.Q1) {
            i = rVar.v;
            integer = rVar.w;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = rVar.B;
        int i2 = rVar.A;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.N1 = new f1(f, i, integer);
        h0 h0Var = this.t1;
        if (h0Var == null || !this.W1) {
            this.k1.f(rVar.z);
        } else {
            androidx.media3.common.q qVarA = rVar.a();
            qVarA.u = i;
            qVarA.v = integer;
            qVarA.A = f;
            androidx.media3.common.r rVar2 = new androidx.media3.common.r(qVarA);
            int i4 = this.v1;
            List list = this.w1;
            if (list == null) {
                com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
                list = a1.B;
            }
            h0Var.n(rVar2, this.V0.b, i4, list);
            this.v1 = 2;
        }
        this.W1 = false;
    }

    @Override // androidx.media3.exoplayer.a
    public final void h() {
        h0 h0Var = this.t1;
        if (h0Var == null) {
            w wVar = this.k1;
            if (wVar.e == 0) {
                wVar.e = 1;
                return;
            }
            return;
        }
        int i = this.v1;
        if (i == 0 || i == 1) {
            this.v1 = 0;
        } else {
            h0Var.v();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final void i0(long j) {
        super.i0(j);
        if (this.Q1) {
            return;
        }
        this.G1--;
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final void j0() {
        h0 h0Var = this.t1;
        if (h0Var != null) {
            h0Var.j();
            if (this.U1 == -9223372036854775807L) {
                this.U1 = this.V0.b;
            }
            this.t1.h(-this.U1);
        } else {
            this.k1.e(2);
        }
        this.W1 = true;
        M0();
    }

    @Override // androidx.media3.exoplayer.a
    public final String k() {
        return "MediaCodecVideoRenderer";
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final void k0(androidx.media3.decoder.e eVar) {
        ByteBuffer byteBuffer;
        androidx.media3.common.util.b bVar = this.m1;
        if (bVar != null) {
            androidx.media3.exoplayer.mediacodec.o oVar = this.r0;
            oVar.getClass();
            if (oVar.b.equals("video/av01") && eVar.g(1) && (byteBuffer = eVar.B) != null) {
                int iPosition = byteBuffer.position();
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, iPosition + 500));
                ByteBuffer byteBuffer2 = (ByteBuffer) bVar.y;
                byteBuffer2.clear();
                byteBuffer2.put(byteBuffer);
                byteBuffer2.flip();
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }
        this.X1 = 0;
        int iP = P(eVar);
        if ((Build.VERSION.SDK_INT < 34 || (iP & 32) == 0) && !this.Q1) {
            this.G1++;
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final boolean m() {
        if (!this.Q0) {
            return false;
        }
        h0 h0Var = this.t1;
        return h0Var == null || h0Var.a();
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final boolean m0(long j, long j2, androidx.media3.exoplayer.mediacodec.l lVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, androidx.media3.common.r rVar) {
        int i4;
        lVar.getClass();
        long j4 = j3 - this.V0.c;
        int i5 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.p1;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            i5++;
            priorityQueue.poll();
        }
        S0(i5, 0);
        h0 h0Var = this.t1;
        if (h0Var != null) {
            if (!z || z2) {
                return h0Var.c(j3, new h(this, lVar, i, j4));
            }
            R0(lVar, i);
            return true;
        }
        int iA = this.k1.a(j3, j, j2, this.V0.b, z, z2, this.l1);
        v vVar = this.l1;
        x xVar = this.o1;
        if (xVar != null && iA != 5 && iA != 4) {
            xVar.a(j3, vVar.a);
        }
        if (iA == 0) {
            this.D.getClass();
            long jNanoTime = System.nanoTime();
            u uVar = this.T1;
            if (uVar != null) {
                uVar.c(j4, jNanoTime, rVar, this.m0);
            }
            N0(lVar, i, jNanoTime);
            U0(vVar.a);
            return true;
        }
        if (iA == 1) {
            long j5 = vVar.b;
            long j6 = vVar.a;
            if (j5 == this.M1) {
                R0(lVar, i);
            } else {
                u uVar2 = this.T1;
                if (uVar2 != null) {
                    i4 = i;
                    uVar2.c(j4, j5, rVar, this.m0);
                } else {
                    i4 = i;
                }
                N0(lVar, i4, j5);
            }
            U0(j6);
            this.M1 = j5;
            return true;
        }
        if (iA == 2) {
            Trace.beginSection("dropVideoBuffer");
            lVar.g(i);
            Trace.endSection();
            S0(0, 1);
            U0(vVar.a);
            return true;
        }
        if (iA == 3) {
            R0(lVar, i);
            U0(vVar.a);
            return true;
        }
        if (iA == 4 || iA == 5) {
            return false;
        }
        net.luminis.tls.engine.impl.c.r(String.valueOf(iA));
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    @Override // androidx.media3.exoplayer.a
    public final boolean o() {
        boolean zA;
        boolean z = false;
        if (this.b0 != null) {
            if (l()) {
                zA = this.K;
            } else {
                w0 w0Var = this.F;
                w0Var.getClass();
                zA = w0Var.a();
            }
            if (zA) {
                z = true;
            } else {
                if (this.B0 >= 0) {
                    z = true;
                } else if (this.z0 != -9223372036854775807L) {
                    this.D.getClass();
                    if (SystemClock.elapsedRealtime() < this.z0) {
                        z = true;
                    }
                }
            }
        }
        h0 h0Var = this.t1;
        if (h0Var != null) {
            return h0Var.s(z);
        }
        if (z && (this.k0 == null || this.Q1)) {
            return true;
        }
        return this.k1.b(z);
    }

    @Override // androidx.media3.exoplayer.mediacodec.r, androidx.media3.exoplayer.a
    public final void p() {
        androidx.media3.exoplayer.c cVar;
        androidx.media3.exoplayer.audio.t tVar = this.h1;
        this.O1 = null;
        this.V1 = -9223372036854775807L;
        M0();
        this.A1 = false;
        this.S1 = null;
        this.J1 = true;
        try {
            super.p();
            cVar = this.U0;
            tVar.getClass();
            synchronized (cVar) {
            }
        } finally {
            cVar = this.U0;
            tVar.getClass();
            synchronized (cVar) {
                Handler handler = tVar.a;
                if (handler != null) {
                    handler.post(new androidx.activity.c(26, tVar, cVar));
                }
                tVar.b(f1.d);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final void p0() {
        h0 h0Var = this.t1;
        if (h0Var != null) {
            h0Var.j();
        } else {
            long j = this.V0.f;
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void q(boolean z, boolean z2) {
        h0 h0Var;
        this.U0 = new androidx.media3.exoplayer.c();
        h1 h1Var = this.A;
        h1Var.getClass();
        boolean z3 = h1Var.b;
        com.google.android.material.motion.a.q((z3 && this.R1 == 0) ? false : true);
        if (this.Q1 != z3) {
            this.Q1 = z3;
            o0();
        }
        androidx.media3.exoplayer.c cVar = this.U0;
        androidx.media3.exoplayer.audio.t tVar = this.h1;
        Handler handler = tVar.a;
        if (handler != null) {
            handler.post(new d0(tVar, cVar, 3));
        }
        boolean z4 = this.u1;
        w wVar = this.k1;
        if (!z4) {
            if (this.w1 != null && this.t1 == null) {
                n nVar = new n(this.f1, wVar);
                nVar.d = true;
                long j = this.n1;
                nVar.g = j != -9223372036854775807L ? -j : -9223372036854775807L;
                androidx.media3.common.util.e0 e0Var = this.D;
                e0Var.getClass();
                nVar.e = e0Var;
                com.google.android.material.motion.a.q(!nVar.f);
                if (nVar.c == null) {
                    nVar.c = new q();
                }
                s sVar = new s(nVar);
                nVar.f = true;
                if (1 >= sVar.q) {
                    sVar.q = 1;
                }
                SparseArray sparseArray = sVar.c;
                if (j0.l(sparseArray, 0)) {
                    h0Var = (h0) sparseArray.get(0);
                } else {
                    o oVar = new o(sVar, sVar.a);
                    sVar.g.add(oVar);
                    sparseArray.put(0, oVar);
                    h0Var = oVar;
                }
                this.t1 = h0Var;
            }
            this.u1 = true;
        }
        h0 h0Var2 = this.t1;
        if (h0Var2 == null) {
            androidx.media3.common.util.e0 e0Var2 = this.D;
            e0Var2.getClass();
            wVar.l = e0Var2;
            wVar.e(!z2 ? 1 : 0);
            return;
        }
        h0Var2.f(new g(this));
        u uVar = this.T1;
        if (uVar != null) {
            this.t1.i(uVar);
        }
        if (this.x1 != null && !this.z1.equals(androidx.media3.common.util.x.c)) {
            this.t1.d(this.x1, this.z1);
        }
        this.t1.k(this.C1);
        this.t1.l(this.i0);
        List list = this.w1;
        if (list != null) {
            this.t1.p(list);
        }
        this.v1 = !z2 ? 1 : 0;
        this.Y0 = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.r, androidx.media3.exoplayer.a
    public final void r(long j, boolean z, boolean z2) throws androidx.media3.exoplayer.j {
        h0 h0Var = this.t1;
        if (h0Var != null && !z) {
            h0Var.o(true);
        }
        if (z2) {
            this.I1 = j;
        }
        super.r(j, z, z2);
        h0 h0Var2 = this.t1;
        w wVar = this.k1;
        if (h0Var2 == null) {
            wVar.b.b();
            wVar.h = -9223372036854775807L;
            wVar.f = -9223372036854775807L;
            wVar.e = Math.min(wVar.e, 1);
            wVar.i = -9223372036854775807L;
            wVar.n = false;
        }
        x xVar = this.o1;
        if (xVar != null) {
            xVar.b();
        }
        if (z) {
            h0 h0Var3 = this.t1;
            if (h0Var3 != null) {
                h0Var3.r(false);
            } else {
                wVar.c(false);
            }
        }
        M0();
        this.F1 = 0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final void r0() {
        super.r0();
        this.p1.clear();
        this.G1 = 0;
        this.X1 = 0;
        this.J1 = false;
        androidx.media3.common.util.b bVar = this.m1;
        if (bVar != null) {
            bVar.z = null;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.y;
            byteBuffer.position(byteBuffer.limit());
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void s() {
        h0 h0Var = this.t1;
        if (h0Var == null || !this.g1) {
            return;
        }
        h0Var.release();
    }

    @Override // androidx.media3.exoplayer.a
    public final void t() {
        try {
            try {
                this.E0 = false;
                q0();
                o0();
                androidx.media3.exoplayer.dash.manifest.t tVar = this.e0;
                if (tVar != null) {
                    tVar.O(null);
                }
                this.e0 = null;
                this.u1 = false;
                this.U1 = -9223372036854775807L;
                m mVar = this.y1;
                if (mVar != null) {
                    mVar.release();
                    this.y1 = null;
                }
            } catch (Throwable th) {
                androidx.media3.exoplayer.dash.manifest.t tVar2 = this.e0;
                if (tVar2 != null) {
                    tVar2.O(null);
                }
                this.e0 = null;
                throw th;
            }
        } catch (Throwable th2) {
            this.u1 = false;
            this.U1 = -9223372036854775807L;
            m mVar2 = this.y1;
            if (mVar2 != null) {
                mVar2.release();
                this.y1 = null;
            }
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void u() {
        this.E1 = 0;
        this.D.getClass();
        this.D1 = SystemClock.elapsedRealtime();
        this.K1 = 0L;
        this.L1 = 0;
        h0 h0Var = this.t1;
        if (h0Var != null) {
            h0Var.g();
        } else {
            this.k1.d();
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void v() {
        L0();
        int i = this.L1;
        if (i != 0) {
            long j = this.K1;
            androidx.media3.exoplayer.audio.t tVar = this.h1;
            Handler handler = tVar.a;
            if (handler != null) {
                handler.post(new d0(tVar, j, i));
            }
            this.K1 = 0L;
            this.L1 = 0;
        }
        h0 h0Var = this.t1;
        if (h0Var != null) {
            h0Var.e();
        } else {
            w wVar = this.k1;
            wVar.d = false;
            wVar.i = -9223372036854775807L;
            b0 b0Var = wVar.b;
            b0Var.d = false;
            y yVar = b0Var.c;
            if (yVar != null) {
                yVar.b();
            }
            b0Var.a();
        }
        x xVar = this.o1;
        if (xVar != null) {
            xVar.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:90:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0140  */
    /* JADX WARN: Code duplicated, block: B:92:0x0148  */
    @Override // androidx.media3.exoplayer.mediacodec.r
    public final boolean v0(androidx.media3.decoder.e eVar) {
        boolean z;
        ByteBuffer byteBuffer;
        int iLimit;
        androidx.media3.container.u uVar;
        n0 n0Var;
        boolean z2 = false;
        if (!K0(eVar)) {
            long j = eVar.D;
            boolean z3 = j < this.I;
            x xVar = this.o1;
            if (xVar != null) {
                long j2 = xVar.a;
                long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : (long) (((j - j2) * xVar.c) + xVar.b);
                if (j3 == -9223372036854775807L || j3 >= this.n1) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if ((z3 || z) && !eVar.g(268435456)) {
                if (!eVar.g(67108864)) {
                    androidx.media3.common.util.b bVar = this.m1;
                    if (bVar != null) {
                        ByteBuffer byteBuffer2 = (ByteBuffer) bVar.y;
                        androidx.media3.exoplayer.mediacodec.o oVar = this.r0;
                        oVar.getClass();
                        if (oVar.b.equals("video/av01") && (byteBuffer = eVar.B) != null) {
                            boolean z4 = z3 || this.X1 <= 0;
                            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                            byteBufferAsReadOnlyBuffer.flip();
                            if (byteBuffer2.hasRemaining()) {
                                bVar.K(androidx.media3.container.r.o(byteBuffer2));
                                byteBuffer2.position(byteBuffer2.limit());
                            }
                            ArrayList arrayListO = androidx.media3.container.r.o(byteBufferAsReadOnlyBuffer);
                            bVar.K(arrayListO);
                            int size = arrayListO.size() - 1;
                            int i = 0;
                            while (size >= 0) {
                                androidx.media3.container.t tVar = (androidx.media3.container.t) arrayListO.get(size);
                                int i2 = tVar.a;
                                if (i2 != 2 && i2 != 15) {
                                    if ((i2 == 3 && !z4) || ((i2 != 6 && i2 != 3) || (uVar = (androidx.media3.container.u) bVar.z) == null)) {
                                        break;
                                    }
                                    try {
                                        n0Var = new n0(uVar, tVar);
                                    } catch (androidx.media3.container.s unused) {
                                        n0Var = null;
                                    }
                                    if (n0Var == null || n0Var.e) {
                                        break;
                                    }
                                }
                                if (((androidx.media3.container.t) arrayListO.get(size)).a == 6 || ((androidx.media3.container.t) arrayListO.get(size)).a == 3) {
                                    i++;
                                }
                                size--;
                            }
                            if (i > 1 || size + 1 >= 8) {
                                iLimit = byteBufferAsReadOnlyBuffer.limit();
                            } else {
                                iLimit = size >= 0 ? ((androidx.media3.container.t) arrayListO.get(size)).b.limit() : byteBufferAsReadOnlyBuffer.position();
                            }
                            if (iLimit == 0) {
                                eVar.o();
                            } else if (iLimit != byteBufferAsReadOnlyBuffer.limit()) {
                                androidx.media3.container.j jVar = this.q1;
                                jVar.getClass();
                                if (jVar.c + iLimit < byteBufferAsReadOnlyBuffer.capacity() && !eVar.g(1073741824)) {
                                    ByteBuffer byteBuffer3 = eVar.B;
                                    byteBuffer3.getClass();
                                    byteBuffer3.position(iLimit);
                                }
                            }
                        }
                    }
                    if (z2) {
                        if (z3) {
                            this.U0.d++;
                        } else {
                            this.p1.add(Long.valueOf(eVar.D));
                            this.X1++;
                        }
                    }
                    return z2;
                }
                eVar.o();
                z2 = true;
                if (z2) {
                    if (z3) {
                        this.U0.d++;
                    } else {
                        this.p1.add(Long.valueOf(eVar.D));
                        this.X1++;
                    }
                }
                return z2;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.r, androidx.media3.exoplayer.a
    public final void w(androidx.media3.common.r[] rVarArr, long j, long j2, androidx.media3.exoplayer.source.v vVar) {
        super.w(rVarArr, j, j2, vVar);
        T0(vVar);
        x xVar = this.o1;
        if (xVar != null) {
            xVar.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    @Override // androidx.media3.exoplayer.mediacodec.r
    public final boolean w0() {
        boolean z;
        androidx.media3.common.r rVar = this.l0;
        long j = this.V1;
        if (j != -9223372036854775807L) {
            if (this.a1 + 1 + j > Long.MAX_VALUE - (this.V0.c + j)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        return this.H1 == null || this.J1 || this.Q1 || (rVar != null && rVar.q > 0) || z || this.V0.f != -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.a
    public final void x() {
        androidx.media3.exoplayer.source.v vVar = this.N;
        if (vVar != null) {
            T0(vVar);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final boolean x0(androidx.media3.exoplayer.mediacodec.o oVar) {
        return J0(oVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.r
    public final boolean y0() {
        androidx.media3.exoplayer.mediacodec.o oVar = this.r0;
        if (this.t1 != null && oVar != null) {
            String str = oVar.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.y0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.r, androidx.media3.exoplayer.a
    public final void z(long j, long j2) throws androidx.media3.exoplayer.j {
        h0 h0Var = this.t1;
        if (h0Var != null) {
            try {
                h0Var.q(j, j2);
            } catch (g0 e) {
                throw g(e, e.e, false, 7001);
            }
        }
        super.z(j, j2);
    }
}
