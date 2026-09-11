package androidx.compose.ui.platform;

import android.content.ClipDescription;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.app.mlounge.R;
import com.app.mlounge.emulator.LibretroCore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import org.mozilla.javascript.Parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends com.app.mlounge.data.music.e {
    public final /* synthetic */ androidx.core.view.b A;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(androidx.core.view.b bVar, int i) {
        super(22);
        this.z = i;
        this.A = bVar;
    }

    @Override // com.app.mlounge.data.music.e
    public void g(int i, androidx.core.view.accessibility.d dVar, String str, Bundle bundle) {
        switch (this.z) {
            case 0:
                ((a0) this.A).j(i, dVar, str, bundle);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:101:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:109:0x021e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0223  */
    /* JADX WARN: Code duplicated, block: B:117:0x0236  */
    /* JADX WARN: Code duplicated, block: B:118:0x0240  */
    /* JADX WARN: Code duplicated, block: B:121:0x024f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0269  */
    /* JADX WARN: Code duplicated, block: B:125:0x0272  */
    /* JADX WARN: Code duplicated, block: B:127:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:128:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:132:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:140:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:142:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:143:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:146:0x030b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0311  */
    /* JADX WARN: Code duplicated, block: B:151:0x031d  */
    /* JADX WARN: Code duplicated, block: B:153:0x0327  */
    /* JADX WARN: Code duplicated, block: B:156:0x0338  */
    /* JADX WARN: Code duplicated, block: B:159:0x036d  */
    /* JADX WARN: Code duplicated, block: B:162:0x0378  */
    /* JADX WARN: Code duplicated, block: B:164:0x0388  */
    /* JADX WARN: Code duplicated, block: B:170:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:173:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:175:0x03c0 A[LOOP:3: B:172:0x03ac->B:175:0x03c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:180:0x03df  */
    /* JADX WARN: Code duplicated, block: B:182:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:188:0x040d  */
    /* JADX WARN: Code duplicated, block: B:191:0x0415  */
    /* JADX WARN: Code duplicated, block: B:193:0x042d  */
    /* JADX WARN: Code duplicated, block: B:197:0x0447  */
    /* JADX WARN: Code duplicated, block: B:199:0x0457  */
    /* JADX WARN: Code duplicated, block: B:207:0x047c  */
    /* JADX WARN: Code duplicated, block: B:209:0x048a  */
    /* JADX WARN: Code duplicated, block: B:211:0x0491  */
    /* JADX WARN: Code duplicated, block: B:213:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:215:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:217:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:219:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:222:0x04df  */
    /* JADX WARN: Code duplicated, block: B:225:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:227:0x050b  */
    /* JADX WARN: Code duplicated, block: B:230:0x0515  */
    /* JADX WARN: Code duplicated, block: B:233:0x0522  */
    /* JADX WARN: Code duplicated, block: B:234:0x0526  */
    /* JADX WARN: Code duplicated, block: B:237:0x053e  */
    /* JADX WARN: Code duplicated, block: B:240:0x0544  */
    /* JADX WARN: Code duplicated, block: B:242:0x0548  */
    /* JADX WARN: Code duplicated, block: B:243:0x054d  */
    /* JADX WARN: Code duplicated, block: B:245:0x0551  */
    /* JADX WARN: Code duplicated, block: B:248:0x055d  */
    /* JADX WARN: Code duplicated, block: B:251:0x0563  */
    /* JADX WARN: Code duplicated, block: B:253:0x0569  */
    /* JADX WARN: Code duplicated, block: B:254:0x056d  */
    /* JADX WARN: Code duplicated, block: B:256:0x0574  */
    /* JADX WARN: Code duplicated, block: B:259:0x057e  */
    /* JADX WARN: Code duplicated, block: B:264:0x0590  */
    /* JADX WARN: Code duplicated, block: B:266:0x0598  */
    /* JADX WARN: Code duplicated, block: B:269:0x059e  */
    /* JADX WARN: Code duplicated, block: B:270:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:274:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:277:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:279:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:282:0x05d2 A[LOOP:8: B:278:0x05b9->B:282:0x05d2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:285:0x05da  */
    /* JADX WARN: Code duplicated, block: B:288:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:291:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:294:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:296:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:297:0x0602  */
    /* JADX WARN: Code duplicated, block: B:300:0x0623  */
    /* JADX WARN: Code duplicated, block: B:303:0x0629  */
    /* JADX WARN: Code duplicated, block: B:304:0x062e  */
    /* JADX WARN: Code duplicated, block: B:307:0x0648  */
    /* JADX WARN: Code duplicated, block: B:309:0x065b  */
    /* JADX WARN: Code duplicated, block: B:311:0x0665  */
    /* JADX WARN: Code duplicated, block: B:312:0x066c  */
    /* JADX WARN: Code duplicated, block: B:315:0x067f  */
    /* JADX WARN: Code duplicated, block: B:317:0x0683  */
    /* JADX WARN: Code duplicated, block: B:319:0x0692  */
    /* JADX WARN: Code duplicated, block: B:321:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:322:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:326:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:327:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:328:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:333:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:334:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:336:0x06bb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:340:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:343:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:348:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:350:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:353:0x070c  */
    /* JADX WARN: Code duplicated, block: B:356:0x071e  */
    /* JADX WARN: Code duplicated, block: B:358:0x0728  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:361:0x073e  */
    /* JADX WARN: Code duplicated, block: B:364:0x0755  */
    /* JADX WARN: Code duplicated, block: B:367:0x076b  */
    /* JADX WARN: Code duplicated, block: B:371:0x077d  */
    /* JADX WARN: Code duplicated, block: B:372:0x0784  */
    /* JADX WARN: Code duplicated, block: B:374:0x0787  */
    /* JADX WARN: Code duplicated, block: B:377:0x079a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:381:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:383:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:385:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:386:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:389:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:393:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:395:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:399:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:402:0x080c  */
    /* JADX WARN: Code duplicated, block: B:404:0x0812  */
    /* JADX WARN: Code duplicated, block: B:406:0x0818  */
    /* JADX WARN: Code duplicated, block: B:411:0x0829  */
    /* JADX WARN: Code duplicated, block: B:414:0x082d A[LOOP:9: B:403:0x0810->B:414:0x082d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:417:0x0836  */
    /* JADX WARN: Code duplicated, block: B:419:0x083c  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:421:0x0844  */
    /* JADX WARN: Code duplicated, block: B:423:0x084d  */
    /* JADX WARN: Code duplicated, block: B:425:0x0850  */
    /* JADX WARN: Code duplicated, block: B:428:0x0855  */
    /* JADX WARN: Code duplicated, block: B:431:0x0864  */
    /* JADX WARN: Code duplicated, block: B:433:0x0874  */
    /* JADX WARN: Code duplicated, block: B:437:0x087d  */
    /* JADX WARN: Code duplicated, block: B:439:0x0880  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:444:0x0895  */
    /* JADX WARN: Code duplicated, block: B:447:0x08a2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:451:0x08c4  */
    /* JADX WARN: Code duplicated, block: B:453:0x08d2  */
    /* JADX WARN: Code duplicated, block: B:454:0x08d8  */
    /* JADX WARN: Code duplicated, block: B:457:0x08e1  */
    /* JADX WARN: Code duplicated, block: B:460:0x08ef  */
    /* JADX WARN: Code duplicated, block: B:464:0x08f9  */
    /* JADX WARN: Code duplicated, block: B:465:0x08fb  */
    /* JADX WARN: Code duplicated, block: B:468:0x0900  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:472:0x090a  */
    /* JADX WARN: Code duplicated, block: B:475:0x090f  */
    /* JADX WARN: Code duplicated, block: B:478:0x091a  */
    /* JADX WARN: Code duplicated, block: B:483:0x0940  */
    /* JADX WARN: Code duplicated, block: B:486:0x0948  */
    /* JADX WARN: Code duplicated, block: B:487:0x0959  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:490:0x096d  */
    /* JADX WARN: Code duplicated, block: B:492:0x0970  */
    /* JADX WARN: Code duplicated, block: B:494:0x097c  */
    /* JADX WARN: Code duplicated, block: B:496:0x0996  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:500:0x09ab  */
    /* JADX WARN: Code duplicated, block: B:502:0x09b2  */
    /* JADX WARN: Code duplicated, block: B:503:0x09b4  */
    /* JADX WARN: Code duplicated, block: B:505:0x09ba  */
    /* JADX WARN: Code duplicated, block: B:509:0x09db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:512:0x09eb  */
    /* JADX WARN: Code duplicated, block: B:514:0x09ef  */
    /* JADX WARN: Code duplicated, block: B:516:0x09fd  */
    /* JADX WARN: Code duplicated, block: B:519:0x0a02  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:520:0x0a04  */
    /* JADX WARN: Code duplicated, block: B:522:0x0a07  */
    /* JADX WARN: Code duplicated, block: B:525:0x0a1c  */
    /* JADX WARN: Code duplicated, block: B:528:0x0a26  */
    /* JADX WARN: Code duplicated, block: B:530:0x0a2e  */
    /* JADX WARN: Code duplicated, block: B:532:0x0a39  */
    /* JADX WARN: Code duplicated, block: B:533:0x0a3b  */
    /* JADX WARN: Code duplicated, block: B:535:0x0a3e  */
    /* JADX WARN: Code duplicated, block: B:536:0x0a41  */
    /* JADX WARN: Code duplicated, block: B:538:0x0a47  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:541:0x0a4f  */
    /* JADX WARN: Code duplicated, block: B:543:0x0a58  */
    /* JADX WARN: Code duplicated, block: B:544:0x0a5a  */
    /* JADX WARN: Code duplicated, block: B:546:0x0a5d  */
    /* JADX WARN: Code duplicated, block: B:547:0x0a60  */
    /* JADX WARN: Code duplicated, block: B:551:0x0a6f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:562:0x0a98  */
    /* JADX WARN: Code duplicated, block: B:576:0x0adb  */
    /* JADX WARN: Code duplicated, block: B:579:0x0ae2  */
    /* JADX WARN: Code duplicated, block: B:57:0x011c  */
    /* JADX WARN: Code duplicated, block: B:582:0x0af6  */
    /* JADX WARN: Code duplicated, block: B:584:0x0b00  */
    /* JADX WARN: Code duplicated, block: B:587:0x0b16  */
    /* JADX WARN: Code duplicated, block: B:590:0x0b2c  */
    /* JADX WARN: Code duplicated, block: B:593:0x0b40  */
    /* JADX WARN: Code duplicated, block: B:595:0x0b50  */
    /* JADX WARN: Code duplicated, block: B:597:0x0b60  */
    /* JADX WARN: Code duplicated, block: B:601:0x0b6e  */
    /* JADX WARN: Code duplicated, block: B:603:0x0b71  */
    /* JADX WARN: Code duplicated, block: B:605:0x0b86  */
    /* JADX WARN: Code duplicated, block: B:607:0x0b91  */
    /* JADX WARN: Code duplicated, block: B:608:0x0ba1  */
    /* JADX WARN: Code duplicated, block: B:60:0x0129  */
    /* JADX WARN: Code duplicated, block: B:612:0x0bb6  */
    /* JADX WARN: Code duplicated, block: B:615:0x0bbd  */
    /* JADX WARN: Code duplicated, block: B:617:0x0bc7  */
    /* JADX WARN: Code duplicated, block: B:618:0x0bce  */
    /* JADX WARN: Code duplicated, block: B:620:0x0bd1  */
    /* JADX WARN: Code duplicated, block: B:622:0x0bdd  */
    /* JADX WARN: Code duplicated, block: B:625:0x0bed  */
    /* JADX WARN: Code duplicated, block: B:627:0x0bf8  */
    /* JADX WARN: Code duplicated, block: B:630:0x0c1c  */
    /* JADX WARN: Code duplicated, block: B:632:0x0c26  */
    /* JADX WARN: Code duplicated, block: B:633:0x0c2c  */
    /* JADX WARN: Code duplicated, block: B:635:0x0c39  */
    /* JADX WARN: Code duplicated, block: B:638:0x0c46  */
    /* JADX WARN: Code duplicated, block: B:63:0x0136  */
    /* JADX WARN: Code duplicated, block: B:643:0x0c62  */
    /* JADX WARN: Code duplicated, block: B:654:0x0c78  */
    /* JADX WARN: Code duplicated, block: B:655:0x0c7d  */
    /* JADX WARN: Code duplicated, block: B:657:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:0x022b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:660:0x022b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:0x0344 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:0x03d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x013c  */
    /* JADX WARN: Code duplicated, block: B:676:0x0437 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:0x05d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:0x05c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:0x0832 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:0x0834 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0144  */
    /* JADX WARN: Code duplicated, block: B:694:0x0999 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0152  */
    /* JADX WARN: Code duplicated, block: B:74:0x0159  */
    /* JADX WARN: Code duplicated, block: B:75:0x0168  */
    /* JADX WARN: Code duplicated, block: B:77:0x016b  */
    /* JADX WARN: Code duplicated, block: B:78:0x017a  */
    /* JADX WARN: Code duplicated, block: B:84:0x018b  */
    /* JADX WARN: Code duplicated, block: B:85:0x018f  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:90:0x01af  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f1 A[DONT_INVERT] */
    /* JADX WARN: Instruction removed from duplicated block: B:500:0x09ab, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:655:0x0c7d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v69, types: [androidx.core.view.accessibility.d] */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.core.view.accessibility.d] */
    /* JADX WARN: Type inference failed for: r2v19, types: [kotlin.collections.u] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v10, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r5v11, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v145 */
    /* JADX WARN: Type inference failed for: r6v148, types: [androidx.core.view.accessibility.d] */
    /* JADX WARN: Type inference failed for: r6v153 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44, types: [androidx.compose.ui.platform.a0] */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.compose.ui.platform.a0] */
    /* JADX WARN: Type inference failed for: r8v112, types: [androidx.compose.ui.node.f0] */
    /* JADX WARN: Type inference failed for: r8v113 */
    /* JADX WARN: Type inference failed for: r8v114, types: [androidx.compose.ui.node.f0] */
    /* JADX WARN: Type inference failed for: r8v168 */
    /* JADX WARN: Type inference failed for: r8v169 */
    /* JADX WARN: Type inference failed for: r8v170 */
    /* JADX WARN: Type inference failed for: r8v97 */
    /* JADX WARN: Type inference failed for: r8v98, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.view.accessibility.AccessibilityNodeInfo] */
    @Override // com.app.mlounge.data.music.e
    public final androidx.core.view.accessibility.d j(int i) throws Throwable {
        AccessibilityNodeInfo accessibilityNodeInfoObtain;
        androidx.core.view.accessibility.d dVar;
        int i2;
        Throwable th;
        androidx.compose.ui.semantics.p pVarL;
        Integer numValueOf;
        int iIntValue;
        androidx.collection.x xVar;
        androidx.collection.z0 z0Var;
        Resources resources;
        androidx.compose.ui.semantics.l lVar;
        androidx.collection.o0 o0Var;
        Object objG;
        androidx.compose.ui.semantics.h hVar;
        AccessibilityManager accessibilityManager;
        androidx.collection.z0 z0Var2;
        boolean zJ;
        List listJ;
        int size;
        boolean z;
        int i3;
        int i4;
        ?? r9;
        androidx.compose.ui.text.g gVarI;
        androidx.collection.x xVar2;
        androidx.compose.ui.semantics.p pVar;
        androidx.collection.o0 o0Var2;
        androidx.compose.ui.semantics.h hVar2;
        androidx.compose.ui.semantics.l lVar2;
        AccessibilityNodeInfo accessibilityNodeInfo;
        ?? r1;
        ?? r0;
        androidx.compose.ui.semantics.w wVar;
        androidx.collection.o0 o0Var3;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        androidx.compose.ui.semantics.p pVar2;
        String strH;
        Object objG2;
        androidx.compose.ui.state.a aVar;
        Object objG3;
        Boolean bool;
        androidx.compose.ui.semantics.h hVar3;
        int i5;
        androidx.compose.ui.semantics.l lVar3;
        Object objG4;
        List list;
        ?? r4;
        Object objG5;
        String str;
        Object objG6;
        int i6;
        Object objG7;
        Integer num;
        int iIntValue2;
        androidx.compose.ui.semantics.w wVar2;
        a0 a0Var;
        boolean z2;
        ?? r7;
        Object objG8;
        androidx.compose.ui.semantics.a aVar2;
        char c;
        androidx.compose.ui.semantics.a aVar3;
        androidx.compose.ui.semantics.a aVar4;
        String strT;
        boolean z3;
        androidx.compose.ui.semantics.g gVar;
        float f;
        Object objG9;
        androidx.compose.ui.semantics.c cVar;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        ArrayList arrayList;
        Object objG10;
        float f2;
        boolean zK;
        int size2;
        List listJ2;
        int size3;
        int i7;
        androidx.compose.ui.semantics.p pVar3;
        androidx.compose.ui.semantics.i iVar;
        androidx.compose.ui.semantics.i iVar2;
        boolean z4;
        int iD;
        ?? r5;
        u uVar;
        int iD2;
        String str2;
        ?? r6;
        androidx.compose.ui.viewinterop.h hVarP;
        androidx.compose.ui.viewinterop.h hVarP2;
        androidx.compose.ui.semantics.a aVar5;
        androidx.compose.ui.semantics.a aVar6;
        androidx.compose.ui.semantics.a aVar7;
        androidx.compose.ui.semantics.w wVar3;
        List list2;
        int size4;
        androidx.collection.y yVar;
        androidx.collection.z0 z0Var3;
        androidx.collection.f0 f0Var;
        int[] iArr;
        int i8;
        int[] iArrCopyOf;
        int i9;
        int i10;
        ArrayList arrayList2;
        int i11;
        boolean z5;
        Object objG11;
        boolean z6;
        boolean z7;
        androidx.compose.ui.unit.m mVar;
        androidx.compose.ui.node.f0 f0Var2;
        boolean z8;
        androidx.core.view.accessibility.b bVar;
        boolean z9;
        androidx.core.view.accessibility.b bVar2;
        Object objG12;
        androidx.compose.ui.semantics.a aVar8;
        float f3;
        float f4;
        androidx.compose.ui.semantics.w wVar4;
        float f5;
        ArrayList arrayList3;
        CharSequence charSequenceG;
        boolean z10;
        androidx.compose.ui.semantics.a aVar9;
        ?? r8;
        List list3;
        boolean z11;
        ?? V;
        androidx.compose.ui.semantics.l lVarX;
        boolean zA;
        Object objG13;
        androidx.compose.ui.semantics.l lVarX2;
        boolean z12;
        boolean z13;
        androidx.compose.ui.semantics.a aVar10;
        androidx.compose.ui.semantics.a aVar11;
        androidx.compose.ui.semantics.a aVar12;
        androidx.compose.ui.semantics.a aVar13;
        ClipDescription primaryClipDescription;
        boolean zHasMimeType;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int iD3;
        androidx.compose.ui.semantics.p pVarL2;
        boolean zBooleanValue;
        androidx.compose.ui.semantics.l lVar4;
        androidx.compose.ui.semantics.w wVar5;
        boolean zBooleanValue2;
        Object objG14;
        androidx.compose.ui.unit.c density;
        androidx.appcompat.widget.c2 c2Var;
        SpannableString spannableString;
        List list4;
        ArrayList arrayList4;
        SpannableString spannableString2;
        ?? arrayList5;
        ?? arrayList6;
        int size5;
        int i12;
        ?? arrayList7;
        int size6;
        int i13;
        int size7;
        int i14;
        androidx.compose.ui.text.e eVar;
        int i15;
        Object obj;
        int i16;
        androidx.compose.ui.text.m mVar2;
        WeakHashMap weakHashMap;
        Object gVar2;
        androidx.compose.ui.text.e eVar2;
        androidx.compose.ui.text.l lVar5;
        WeakHashMap weakHashMap2;
        Object uRLSpan;
        int size8;
        int i17;
        androidx.compose.ui.text.e eVar3;
        androidx.compose.ui.text.n0 n0Var;
        WeakHashMap weakHashMap3;
        Object uRLSpan2;
        int size9;
        int i18;
        androidx.compose.ui.text.e eVar4;
        androidx.compose.ui.text.o0 o0Var4;
        int i19;
        int i20;
        int size10;
        int i21;
        androidx.compose.ui.text.e eVar5;
        int size11;
        int i22;
        int i23;
        int i24;
        long jB;
        androidx.compose.ui.text.font.l lVar6;
        androidx.compose.ui.text.font.j jVar;
        androidx.compose.ui.text.style.p pVar4;
        long j;
        androidx.compose.ui.text.style.l lVar7;
        androidx.compose.ui.text.style.o oVar;
        androidx.compose.ui.text.style.o cVar2;
        androidx.compose.ui.text.style.o oVar2;
        SpannableString spannableString3;
        androidx.compose.ui.text.font.l lVar8;
        int i25;
        int i26;
        int i27;
        androidx.compose.ui.semantics.p pVar5;
        androidx.collection.n nVarS;
        int i28;
        androidx.compose.ui.viewinterop.h hVar4;
        androidx.compose.ui.semantics.q qVar;
        boolean zA2;
        androidx.compose.ui.semantics.p pVar6;
        int i29;
        int i30;
        String strR;
        Object parentForAccessibility;
        View view;
        ?? r10;
        androidx.core.view.accessibility.d dVar2;
        androidx.lifecycle.p lifecycle;
        switch (this.z) {
            case 0:
                a0 a0Var2 = (a0) this.A;
                AccessibilityManager accessibilityManager2 = a0Var2.D;
                u uVar2 = a0Var2.A;
                l viewTreeOwners = uVar2.getViewTreeOwners();
                if (((viewTreeOwners == null || (lifecycle = viewTreeOwners.a.getLifecycle()) == null) ? null : ((androidx.lifecycle.x) lifecycle).d) == androidx.lifecycle.o.e) {
                    if (accessibilityManager2.isEnabled()) {
                        dVar2 = null;
                    } else {
                        dVar2 = new androidx.core.view.accessibility.d(AccessibilityNodeInfo.obtain());
                    }
                    i6 = i;
                    r10 = a0Var2;
                    r6 = dVar2;
                } else {
                    androidx.compose.ui.semantics.q qVar2 = (androidx.compose.ui.semantics.q) a0Var2.s().b(i);
                    if (qVar2 == null) {
                        if (accessibilityManager2.isEnabled()) {
                            dVar2 = null;
                        } else {
                            dVar2 = new androidx.core.view.accessibility.d(AccessibilityNodeInfo.obtain());
                        }
                        i6 = i;
                        r10 = a0Var2;
                        r6 = dVar2;
                    } else {
                        androidx.compose.ui.semantics.p pVar7 = qVar2.a;
                        androidx.compose.ui.semantics.l lVarK = pVar7.k();
                        androidx.compose.ui.node.f0 f0Var3 = pVar7.c;
                        Object objG15 = lVarK.e.g(androidx.compose.ui.semantics.t.n);
                        if (objG15 == null) {
                            objG15 = null;
                        }
                        boolean zA3 = kotlin.jvm.internal.l.a(objG15, Boolean.TRUE);
                        if (!zA3) {
                            accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                            dVar = new androidx.core.view.accessibility.d(accessibilityNodeInfoObtain);
                            i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 34) {
                                androidx.compose.ui.text.android.b.l(accessibilityNodeInfoObtain, zA3);
                            } else {
                                dVar.j(64, zA3);
                            }
                            if (i == -1) {
                                th = null;
                                pVarL = pVar7.l();
                                if (pVarL != null) {
                                    numValueOf = Integer.valueOf(pVarL.g);
                                } else {
                                    numValueOf = null;
                                }
                                if (numValueOf != null) {
                                    iIntValue = numValueOf.intValue();
                                    if (iIntValue == uVar2.getSemanticsOwner().a().g) {
                                        iIntValue = -1;
                                    }
                                    dVar.b = iIntValue;
                                    accessibilityNodeInfoObtain.setParent(uVar2, iIntValue);
                                } else {
                                    androidx.compose.ui.internal.a.c("semanticsNode " + i + " has null parent");
                                    com.google.gson.b.b();
                                }
                                return null;
                            }
                            parentForAccessibility = uVar2.getParentForAccessibility();
                            th = null;
                            if (parentForAccessibility instanceof View) {
                                view = (View) parentForAccessibility;
                            } else {
                                view = null;
                            }
                            dVar.b = -1;
                            accessibilityNodeInfoObtain.setParent(view);
                            dVar.c = i;
                            accessibilityNodeInfoObtain.setSource(uVar2, i);
                            accessibilityNodeInfoObtain.setBoundsInScreen(a0Var2.k(qVar2));
                            xVar = a0Var2.h0;
                            z0Var = a0Var2.Q;
                            resources = uVar2.getContext().getResources();
                            dVar.k("android.view.View");
                            lVar = pVar7.d;
                            o0Var = lVar.e;
                            if (o0Var.c(androidx.compose.ui.semantics.t.F)) {
                                dVar.k("android.widget.EditText");
                            }
                            if (o0Var.c(androidx.compose.ui.semantics.t.B)) {
                                dVar.k("android.widget.TextView");
                            }
                            objG = o0Var.g(androidx.compose.ui.semantics.t.y);
                            if (objG == null) {
                                objG = th;
                            }
                            hVar = (androidx.compose.ui.semantics.h) objG;
                            if (hVar != null) {
                                i29 = hVar.a;
                                accessibilityManager = accessibilityManager2;
                                if (pVar7.e) {
                                    i30 = 4;
                                    z0Var2 = z0Var;
                                    if (androidx.compose.ui.semantics.p.j(4, pVar7).isEmpty()) {
                                    }
                                } else {
                                    i30 = 4;
                                    z0Var2 = z0Var;
                                }
                                if (i29 == i30) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                                } else if (i29 == 2) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                                } else {
                                    strR = i0.r(i29);
                                    if (i29 == 5 || pVar7.n() || lVar.z) {
                                        dVar.k(strR);
                                    }
                                }
                            } else {
                                accessibilityManager = accessibilityManager2;
                                z0Var2 = z0Var;
                            }
                            accessibilityNodeInfoObtain.setPackageName(uVar2.getContext().getPackageName());
                            accessibilityNodeInfoObtain.setImportantForAccessibility(androidx.compose.ui.semantics.s.f(pVar7));
                            if (i2 >= 34) {
                                zJ = androidx.compose.ui.text.android.b.j(accessibilityManager);
                            } else {
                                zJ = true;
                            }
                            listJ = androidx.compose.ui.semantics.p.j(4, pVar7);
                            size = listJ.size();
                            z = zJ;
                            i3 = 0;
                            i4 = 0;
                            while (true) {
                                r9 = dVar.a;
                                if (i4 < size) {
                                    if (i == a0Var2.I) {
                                        r9.setAccessibilityFocused(true);
                                        dVar.b(androidx.core.view.accessibility.b.g);
                                    } else {
                                        r9.setAccessibilityFocused(false);
                                        dVar.b(androidx.core.view.accessibility.b.f);
                                    }
                                    gVarI = i0.i(pVar7);
                                    if (gVarI != null) {
                                        uVar2.getFontFamilyResolver();
                                        density = uVar2.getDensity();
                                        c2Var = a0Var2.d0;
                                        String str3 = gVarI.y;
                                        list4 = gVarI.e;
                                        spannableString = new SpannableString(str3);
                                        arrayList4 = gVarI.z;
                                        if (arrayList4 != null) {
                                            size11 = arrayList4.size();
                                            i22 = 0;
                                            while (i22 < size11) {
                                                ArrayList arrayList8 = arrayList4;
                                                androidx.compose.ui.text.e eVar6 = (androidx.compose.ui.text.e) arrayList4.get(i22);
                                                int i31 = i22;
                                                androidx.compose.ui.text.e0 e0Var = (androidx.compose.ui.text.e0) eVar6.a;
                                                int i32 = size11;
                                                i23 = eVar6.b;
                                                i24 = eVar6.c;
                                                androidx.collection.x xVar3 = xVar;
                                                androidx.compose.ui.semantics.h hVar5 = hVar;
                                                androidx.compose.ui.semantics.l lVar9 = lVar;
                                                jB = e0Var.a.b();
                                                androidx.compose.ui.semantics.p pVar8 = pVar7;
                                                androidx.collection.o0 o0Var5 = o0Var;
                                                long j2 = e0Var.b;
                                                lVar6 = e0Var.c;
                                                jVar = e0Var.d;
                                                pVar4 = e0Var.j;
                                                androidx.compose.ui.text.intl.b bVar3 = e0Var.k;
                                                AccessibilityNodeInfo accessibilityNodeInfo4 = accessibilityNodeInfoObtain;
                                                androidx.core.view.accessibility.d dVar3 = dVar;
                                                j = e0Var.l;
                                                lVar7 = e0Var.m;
                                                oVar = e0Var.a;
                                                if (androidx.compose.ui.graphics.t.c(jB, oVar.b())) {
                                                    oVar2 = oVar;
                                                } else {
                                                    if (jB != 16) {
                                                        cVar2 = new androidx.compose.ui.text.style.c(jB);
                                                    } else {
                                                        cVar2 = androidx.compose.ui.text.style.n.a;
                                                    }
                                                    oVar2 = cVar2;
                                                }
                                                com.google.firebase.crashlytics.internal.model.t1.z(spannableString, oVar2.b(), i23, i24);
                                                spannableString3 = spannableString;
                                                com.google.firebase.crashlytics.internal.model.t1.A(spannableString3, j2, density, i23, i24);
                                                if (lVar6 == null || jVar != null) {
                                                    if (lVar6 == null) {
                                                        lVar8 = androidx.compose.ui.text.font.l.z;
                                                    } else {
                                                        lVar8 = lVar6;
                                                    }
                                                    if (jVar != null) {
                                                        i25 = jVar.a;
                                                    } else {
                                                        i25 = 0;
                                                    }
                                                    StyleSpan styleSpan = new StyleSpan(_COROUTINE.b.n(lVar8, i25));
                                                    i26 = 33;
                                                    spannableString3.setSpan(styleSpan, i23, i24, 33);
                                                } else {
                                                    i26 = 33;
                                                }
                                                if (lVar7 != null) {
                                                    i27 = lVar7.a;
                                                    if ((i27 | 1) == i27) {
                                                        spannableString3.setSpan(new UnderlineSpan(), i23, i24, i26);
                                                    }
                                                    if ((i27 | 2) == i27) {
                                                        spannableString3.setSpan(new StrikethroughSpan(), i23, i24, i26);
                                                    }
                                                }
                                                if (pVar4 != null) {
                                                    spannableString3.setSpan(new ScaleXSpan(pVar4.a), i23, i24, i26);
                                                }
                                                com.google.firebase.crashlytics.internal.model.t1.B(spannableString3, bVar3, i23, i24);
                                                if (j != 16) {
                                                    spannableString3.setSpan(new BackgroundColorSpan(androidx.compose.ui.graphics.a0.y(j)), i23, i24, i26);
                                                }
                                                i22 = i31 + 1;
                                                spannableString = spannableString3;
                                                arrayList4 = arrayList8;
                                                size11 = i32;
                                                xVar = xVar3;
                                                lVar = lVar9;
                                                hVar = hVar5;
                                                o0Var = o0Var5;
                                                pVar7 = pVar8;
                                                accessibilityNodeInfoObtain = accessibilityNodeInfo4;
                                                dVar = dVar3;
                                            }
                                        }
                                        xVar2 = xVar;
                                        spannableString2 = spannableString;
                                        pVar = pVar7;
                                        o0Var2 = o0Var;
                                        hVar2 = hVar;
                                        lVar2 = lVar;
                                        accessibilityNodeInfo = accessibilityNodeInfoObtain;
                                        androidx.core.view.accessibility.d dVar4 = dVar;
                                        int length = str3.length();
                                        arrayList5 = kotlin.collections.u.e;
                                        if (list4 != null) {
                                            arrayList6 = new ArrayList(list4.size());
                                            size10 = list4.size();
                                            while (i21 < size10) {
                                                Object obj2 = list4.get(i21);
                                                eVar5 = (androidx.compose.ui.text.e) obj2;
                                                if (!(eVar5.a instanceof androidx.compose.ui.text.o0) && androidx.compose.ui.text.h.b(0, length, eVar5.b, eVar5.c)) {
                                                    arrayList6.add(obj2);
                                                }
                                            }
                                        } else {
                                            arrayList6 = arrayList5;
                                        }
                                        size5 = arrayList6.size();
                                        while (i12 < size5) {
                                            androidx.compose.ui.text.e eVar7 = (androidx.compose.ui.text.e) arrayList6.get(i12);
                                            o0Var4 = (androidx.compose.ui.text.o0) eVar7.a;
                                            i19 = eVar7.b;
                                            i20 = eVar7.c;
                                            if (o0Var4 instanceof androidx.compose.ui.text.o0) {
                                                coil3.g.a();
                                                return null;
                                            }
                                            spannableString2.setSpan(new TtsSpan.VerbatimBuilder(o0Var4.a).build(), i19, i20, 33);
                                        }
                                        int length2 = str3.length();
                                        if (list4 != null) {
                                            arrayList7 = new ArrayList(list4.size());
                                            size9 = list4.size();
                                            while (i18 < size9) {
                                                Object obj3 = list4.get(i18);
                                                eVar4 = (androidx.compose.ui.text.e) obj3;
                                                if (!(eVar4.a instanceof androidx.compose.ui.text.n0) && androidx.compose.ui.text.h.b(0, length2, eVar4.b, eVar4.c)) {
                                                    arrayList7.add(obj3);
                                                }
                                            }
                                        } else {
                                            arrayList7 = arrayList5;
                                        }
                                        size6 = arrayList7.size();
                                        while (i13 < size6) {
                                            androidx.compose.ui.text.e eVar8 = (androidx.compose.ui.text.e) arrayList7.get(i13);
                                            n0Var = (androidx.compose.ui.text.n0) eVar8.a;
                                            int i33 = eVar8.b;
                                            int i34 = eVar8.c;
                                            weakHashMap3 = (WeakHashMap) c2Var.y;
                                            uRLSpan2 = weakHashMap3.get(n0Var);
                                            if (uRLSpan2 == null) {
                                                uRLSpan2 = new URLSpan(n0Var.a);
                                                weakHashMap3.put(n0Var, uRLSpan2);
                                            }
                                            spannableString2.setSpan((URLSpan) uRLSpan2, i33, i34, 33);
                                        }
                                        int length3 = str3.length();
                                        if (list4 != null) {
                                            arrayList5 = new ArrayList(list4.size());
                                            size8 = list4.size();
                                            while (i17 < size8) {
                                                Object obj4 = list4.get(i17);
                                                eVar3 = (androidx.compose.ui.text.e) obj4;
                                                if (!(eVar3.a instanceof androidx.compose.ui.text.m) && androidx.compose.ui.text.h.b(0, length3, eVar3.b, eVar3.c)) {
                                                    arrayList5.add(obj4);
                                                }
                                            }
                                        }
                                        size7 = arrayList5.size();
                                        while (i14 < size7) {
                                            eVar = (androidx.compose.ui.text.e) arrayList5.get(i14);
                                            i15 = eVar.b;
                                            obj = eVar.a;
                                            i16 = eVar.c;
                                            if (i15 != i16) {
                                                mVar2 = (androidx.compose.ui.text.m) obj;
                                                if (mVar2 instanceof androidx.compose.ui.text.l) {
                                                    obj.getClass();
                                                    lVar5 = (androidx.compose.ui.text.l) obj;
                                                    eVar2 = new androidx.compose.ui.text.e(lVar5, i15, i16);
                                                    weakHashMap2 = (WeakHashMap) c2Var.z;
                                                    uRLSpan = weakHashMap2.get(eVar2);
                                                    if (uRLSpan == null) {
                                                        uRLSpan = new URLSpan(lVar5.a);
                                                        weakHashMap2.put(eVar2, uRLSpan);
                                                    }
                                                    spannableString2.setSpan((URLSpan) uRLSpan, i15, i16, 33);
                                                } else {
                                                    weakHashMap = (WeakHashMap) c2Var.A;
                                                    gVar2 = weakHashMap.get(eVar);
                                                    if (gVar2 == null) {
                                                        gVar2 = new androidx.compose.ui.text.platform.g(mVar2);
                                                        weakHashMap.put(eVar, gVar2);
                                                    }
                                                    spannableString2.setSpan((ClickableSpan) gVar2, i15, i16, 33);
                                                }
                                            }
                                        }
                                        r1 = dVar4;
                                        r0 = (SpannableString) a0.P(spannableString2);
                                    } else {
                                        a0Var2 = a0Var2;
                                        xVar2 = xVar;
                                        pVar = pVar7;
                                        o0Var2 = o0Var;
                                        hVar2 = hVar;
                                        lVar2 = lVar;
                                        accessibilityNodeInfo = accessibilityNodeInfoObtain;
                                        r1 = dVar;
                                        r0 = th;
                                    }
                                    r1.r(r0);
                                    wVar = androidx.compose.ui.semantics.t.L;
                                    o0Var3 = o0Var2;
                                    if (o0Var3.c(wVar)) {
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        accessibilityNodeInfo2.setContentInvalid(true);
                                        objG14 = o0Var3.g(wVar);
                                        if (objG14 == null) {
                                            objG14 = th;
                                        }
                                        r9.setError((CharSequence) objG14);
                                    } else {
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                    }
                                    pVar2 = pVar;
                                    strH = i0.h(pVar2, resources);
                                    if (Build.VERSION.SDK_INT >= 30) {
                                        androidx.compose.ui.graphics.layer.i.l(r9, strH);
                                    } else {
                                        r9.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strH);
                                    }
                                    r9.setCheckable(i0.g(pVar2));
                                    objG2 = o0Var3.g(androidx.compose.ui.semantics.t.J);
                                    if (objG2 == null) {
                                        objG2 = th;
                                    }
                                    aVar = (androidx.compose.ui.state.a) objG2;
                                    if (aVar != null) {
                                        if (aVar == androidx.compose.ui.state.a.e) {
                                            r9.setChecked(true);
                                        } else if (aVar == androidx.compose.ui.state.a.y) {
                                            r9.setChecked(false);
                                        }
                                    }
                                    objG3 = o0Var3.g(androidx.compose.ui.semantics.t.I);
                                    if (objG3 == null) {
                                        objG3 = th;
                                    }
                                    bool = (Boolean) objG3;
                                    if (bool != null) {
                                        zBooleanValue2 = bool.booleanValue();
                                        if (hVar2 == null) {
                                            hVar3 = hVar2;
                                            i5 = 4;
                                        } else {
                                            hVar3 = hVar2;
                                            i5 = 4;
                                            if (hVar3.a == 4) {
                                                accessibilityNodeInfo2.setSelected(zBooleanValue2);
                                            }
                                        }
                                        r9.setChecked(zBooleanValue2);
                                    } else {
                                        hVar3 = hVar2;
                                        i5 = 4;
                                    }
                                    lVar3 = lVar2;
                                    if (lVar3.z || androidx.compose.ui.semantics.p.j(i5, pVar2).isEmpty()) {
                                        objG4 = o0Var3.g(androidx.compose.ui.semantics.t.a);
                                        if (objG4 == null) {
                                            objG4 = th;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            r4 = (String) kotlin.collections.o.M(list);
                                        } else {
                                            r4 = th;
                                        }
                                        r9.setContentDescription(r4);
                                    }
                                    objG5 = o0Var3.g(androidx.compose.ui.semantics.t.z);
                                    if (objG5 == null) {
                                        objG5 = th;
                                    }
                                    str = (String) objG5;
                                    if (str != null) {
                                        pVarL2 = pVar2;
                                        while (true) {
                                            if (pVarL2 != null) {
                                                lVar4 = pVarL2.d;
                                                wVar5 = androidx.compose.ui.semantics.u.a;
                                                if (lVar4.e.c(wVar5)) {
                                                    zBooleanValue = ((Boolean) lVar4.d(wVar5)).booleanValue();
                                                } else {
                                                    pVarL2 = pVarL2.l();
                                                }
                                            } else {
                                                zBooleanValue = false;
                                            }
                                        }
                                        if (zBooleanValue) {
                                            accessibilityNodeInfo2.setViewIdResourceName(str);
                                        }
                                    }
                                    objG6 = o0Var3.g(androidx.compose.ui.semantics.t.h);
                                    if (objG6 == null) {
                                        objG6 = th;
                                    }
                                    if (((kotlin.y) objG6) != null) {
                                        r1.l(true);
                                    }
                                    i6 = i;
                                    if (i6 != -1) {
                                        iD3 = xVar2.d(pVar2.g);
                                        if (iD3 != -1) {
                                            accessibilityNodeInfo2.setDrawingOrder(iD3);
                                        } else {
                                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                                        }
                                    }
                                    accessibilityNodeInfo2.setPassword(o0Var3.c(androidx.compose.ui.semantics.t.K));
                                    accessibilityNodeInfo2.setEditable(o0Var3.c(androidx.compose.ui.semantics.t.N));
                                    objG7 = o0Var3.g(androidx.compose.ui.semantics.t.O);
                                    if (objG7 == null) {
                                        objG7 = th;
                                    }
                                    num = (Integer) objG7;
                                    if (num != null) {
                                        iIntValue2 = num.intValue();
                                    } else {
                                        iIntValue2 = -1;
                                    }
                                    r9.setMaxTextLength(iIntValue2);
                                    r9.setEnabled(i0.b(pVar2));
                                    wVar2 = androidx.compose.ui.semantics.t.k;
                                    r9.setFocusable(o0Var3.c(wVar2));
                                    if (accessibilityNodeInfo2.isFocusable()) {
                                        r9.setFocused(((Boolean) lVar3.d(wVar2)).booleanValue());
                                        if (accessibilityNodeInfo2.isFocused()) {
                                            r1.a(2);
                                            a0 a0Var3 = a0Var2;
                                            a0Var3.J = i6;
                                            a0Var = a0Var3;
                                        } else {
                                            r7 = a0Var2;
                                            z2 = true;
                                            r1.a(1);
                                        }
                                        r9.setVisibleToUser(androidx.compose.ui.semantics.s.e(pVar2) ^ z2);
                                        objG8 = o0Var3.g(androidx.compose.ui.semantics.t.j);
                                        if (objG8 == null) {
                                            objG8 = th;
                                        }
                                        if (objG8 == null) {
                                            r9.setClickable(false);
                                            aVar2 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.b);
                                            c = 3;
                                            if (aVar2 != null) {
                                                boolean zA4 = kotlin.jvm.internal.l.a(androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.t.I), Boolean.TRUE);
                                                if (hVar3 == null && hVar3.a == 4) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                if (z14) {
                                                    z15 = true;
                                                } else {
                                                    if (hVar3 == null && hVar3.a == 3) {
                                                        z17 = true;
                                                    } else {
                                                        z17 = false;
                                                    }
                                                    if (z17) {
                                                        z15 = true;
                                                    } else {
                                                        z15 = false;
                                                    }
                                                }
                                                if (z15 || (z15 && !zA4)) {
                                                    z16 = true;
                                                } else {
                                                    z16 = false;
                                                }
                                                r9.setClickable(z16);
                                                if (i0.b(pVar2) && accessibilityNodeInfo2.isClickable()) {
                                                    r1.b(new androidx.core.view.accessibility.b(16, aVar2.a));
                                                }
                                            }
                                            r9.setLongClickable(false);
                                            aVar3 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.c);
                                            if (aVar3 != null) {
                                                r9.setLongClickable(true);
                                                if (i0.b(pVar2)) {
                                                    r1.b(new androidx.core.view.accessibility.b(32, aVar3.a));
                                                }
                                            }
                                            aVar4 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.q);
                                            if (aVar4 != null) {
                                                r1.b(new androidx.core.view.accessibility.b(16384, aVar4.a));
                                            }
                                            if (i0.b(pVar2)) {
                                                aVar10 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.k);
                                                if (aVar10 != null) {
                                                    r1.b(new androidx.core.view.accessibility.b(2097152, aVar10.a));
                                                }
                                                aVar11 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.p);
                                                if (aVar11 != null) {
                                                    r1.b(new androidx.core.view.accessibility.b(android.R.id.accessibilityActionImeEnter, aVar11.a));
                                                }
                                                aVar12 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.r);
                                                if (aVar12 != null) {
                                                    r1.b(new androidx.core.view.accessibility.b(Parser.ARGC_LIMIT, aVar12.a));
                                                }
                                                aVar13 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.s);
                                                if (aVar13 != null && accessibilityNodeInfo2.isFocused()) {
                                                    primaryClipDescription = uVar2.getClipboardManager().a.getPrimaryClipDescription();
                                                    if (primaryClipDescription != null) {
                                                        zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                                    } else {
                                                        zHasMimeType = false;
                                                    }
                                                    if (zHasMimeType) {
                                                        r1.b(new androidx.core.view.accessibility.b(32768, aVar13.a));
                                                    }
                                                }
                                            }
                                            strT = a0.t(pVar2);
                                            if (strT != null || strT.length() == 0) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            if (!z3) {
                                                accessibilityNodeInfo2.setTextSelection(r7.r(pVar2), r7.q(pVar2));
                                                aVar9 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.j);
                                                if (aVar9 != null) {
                                                    r8 = aVar9.a;
                                                } else {
                                                    r8 = th;
                                                }
                                                r1.b(new androidx.core.view.accessibility.b(131072, (String) r8));
                                                r1.a(LibretroCore.SCREEN_WIDTH);
                                                r1.a(512);
                                                r9.setMovementGranularities(11);
                                                list3 = (List) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.t.a);
                                                if (list3 != null || list3.isEmpty()) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (z11 && o0Var3.c(androidx.compose.ui.semantics.k.a)) {
                                                    if (o0Var3.c(androidx.compose.ui.semantics.t.F) || kotlin.jvm.internal.l.a(androidx.compose.ui.semantics.s.d(lVar3, wVar2), Boolean.TRUE)) {
                                                        V = f0Var3.v();
                                                        while (true) {
                                                            if (V == 0) {
                                                                V = th;
                                                            } else {
                                                                lVarX2 = V.x();
                                                                if (lVarX2 != null || !lVarX2.z) {
                                                                    z12 = false;
                                                                } else if (lVarX2.e.c(androidx.compose.ui.semantics.t.F)) {
                                                                    z12 = true;
                                                                } else {
                                                                    z12 = false;
                                                                }
                                                                if (!z12) {
                                                                    V = V.v();
                                                                }
                                                            }
                                                        }
                                                        if (V != 0) {
                                                            lVarX = V.x();
                                                            if (lVarX != null) {
                                                                objG13 = lVarX.e.g(wVar2);
                                                                if (objG13 == null) {
                                                                    objG13 = th;
                                                                }
                                                                zA = kotlin.jvm.internal.l.a(objG13, Boolean.TRUE);
                                                            } else {
                                                                zA = false;
                                                            }
                                                            z13 = zA ? false : true;
                                                        }
                                                    }
                                                    if (!z13) {
                                                        r9.setMovementGranularities(accessibilityNodeInfo2.getMovementGranularities() | 20);
                                                    }
                                                }
                                            }
                                            if (Build.VERSION.SDK_INT >= 26) {
                                                arrayList3 = new ArrayList();
                                                arrayList3.add("androidx.compose.ui.semantics.id");
                                                charSequenceG = r1.g();
                                                if (charSequenceG != null || charSequenceG.length() == 0) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (!z10 && o0Var3.c(androidx.compose.ui.semantics.k.a)) {
                                                    arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                                }
                                                if (o0Var3.c(androidx.compose.ui.semantics.t.z)) {
                                                    arrayList3.add("androidx.compose.ui.semantics.testTag");
                                                }
                                                if (o0Var3.c(androidx.compose.ui.semantics.t.P)) {
                                                    arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                                    arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                                    arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                                    arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                                                }
                                                r1.i(arrayList3);
                                            }
                                            gVar = (androidx.compose.ui.semantics.g) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.t.c);
                                            f = 0.0f;
                                            if (gVar != null) {
                                                f3 = gVar.a;
                                                f4 = gVar.b.a;
                                                wVar4 = androidx.compose.ui.semantics.k.i;
                                                if (o0Var3.c(wVar4)) {
                                                    r1.k("android.widget.SeekBar");
                                                } else {
                                                    r1.k("android.widget.ProgressBar");
                                                }
                                                if (gVar != androidx.compose.ui.semantics.g.c) {
                                                    accessibilityNodeInfo2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, f4, f3));
                                                }
                                                if (o0Var3.c(wVar4) && i0.b(pVar2)) {
                                                    if (f4 < 0.0f) {
                                                        f5 = 0.0f;
                                                    } else {
                                                        f5 = f4;
                                                    }
                                                    if (f3 < f5) {
                                                        r1.b(androidx.core.view.accessibility.b.h);
                                                    }
                                                    if (0.0f <= f4) {
                                                        f4 = 0.0f;
                                                    }
                                                    if (f3 > f4) {
                                                        r1.b(androidx.core.view.accessibility.b.i);
                                                    }
                                                }
                                            }
                                            if (i0.b(pVar2) && (aVar8 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.i)) != null) {
                                                r1.b(new androidx.core.view.accessibility.b(android.R.id.accessibilityActionSetProgress, aVar8.a));
                                            }
                                            objG9 = pVar2.k().e.g(androidx.compose.ui.semantics.t.f);
                                            if (objG9 == null) {
                                                objG9 = null;
                                            }
                                            cVar = (androidx.compose.ui.semantics.c) objG9;
                                            accessibilityNodeInfo3 = r1.a;
                                            if (cVar != null) {
                                                accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(cVar.a, cVar.b, false, 0));
                                                f2 = 0.0f;
                                            } else {
                                                arrayList = new ArrayList();
                                                objG10 = pVar2.k().e.g(androidx.compose.ui.semantics.t.e);
                                                if ((objG10 != null ? objG10 : null) != null) {
                                                    listJ2 = androidx.compose.ui.semantics.p.j(4, pVar2);
                                                    size3 = listJ2.size();
                                                    i7 = 0;
                                                    while (i7 < size3) {
                                                        float f6 = f;
                                                        pVar3 = (androidx.compose.ui.semantics.p) listJ2.get(i7);
                                                        char c2 = c;
                                                        if (pVar3.k().e.c(androidx.compose.ui.semantics.t.I)) {
                                                            arrayList.add(pVar3);
                                                        }
                                                        i7++;
                                                        c = c2;
                                                        f = f6;
                                                    }
                                                }
                                                f2 = f;
                                                if (!arrayList.isEmpty()) {
                                                    zK = _COROUTINE.a.k(arrayList);
                                                    if (zK) {
                                                        size2 = 1;
                                                    } else {
                                                        size2 = arrayList.size();
                                                    }
                                                    accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(size2, zK ? arrayList.size() : 1, false, 0));
                                                }
                                            }
                                            _COROUTINE.a.I(pVar2, r1);
                                            iVar = (androidx.compose.ui.semantics.i) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.t.u);
                                            androidx.compose.ui.semantics.a aVar14 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.d);
                                            if (iVar != null && aVar14 != null) {
                                                objG11 = pVar2.k().e.g(androidx.compose.ui.semantics.t.f);
                                                if (objG11 == null) {
                                                    objG11 = th;
                                                }
                                                if (objG11 == null) {
                                                    objG12 = pVar2.k().e.g(androidx.compose.ui.semantics.t.e);
                                                    if (objG12 == null) {
                                                        objG12 = th;
                                                    }
                                                    if (objG12 != null) {
                                                        z6 = true;
                                                    } else {
                                                        z6 = false;
                                                    }
                                                } else {
                                                    z6 = true;
                                                }
                                                if (!z6) {
                                                    r1.k("android.widget.HorizontalScrollView");
                                                }
                                                if (((Number) iVar.b.invoke()).floatValue() > f2) {
                                                    r1.p(true);
                                                }
                                                if (i0.b(pVar2)) {
                                                    z7 = a0.z(iVar);
                                                    mVar = androidx.compose.ui.unit.m.y;
                                                    if (z7) {
                                                        r1.b(androidx.core.view.accessibility.b.h);
                                                        f0Var2 = f0Var3;
                                                        if (f0Var2.X == mVar) {
                                                            z9 = true;
                                                        } else {
                                                            z9 = false;
                                                        }
                                                        if (z9) {
                                                            bVar2 = androidx.core.view.accessibility.b.p;
                                                        } else {
                                                            bVar2 = androidx.core.view.accessibility.b.n;
                                                        }
                                                        r1.b(bVar2);
                                                    } else {
                                                        f0Var2 = f0Var3;
                                                    }
                                                    if (a0.y(iVar)) {
                                                        r1.b(androidx.core.view.accessibility.b.i);
                                                        if (f0Var2.X == mVar) {
                                                            z8 = true;
                                                        } else {
                                                            z8 = false;
                                                        }
                                                        if (z8) {
                                                            bVar = androidx.core.view.accessibility.b.n;
                                                        } else {
                                                            bVar = androidx.core.view.accessibility.b.p;
                                                        }
                                                        r1.b(bVar);
                                                    }
                                                }
                                            }
                                            iVar2 = (androidx.compose.ui.semantics.i) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.t.v);
                                            if (iVar2 != null || aVar14 == null) {
                                                z4 = true;
                                            } else {
                                                Object objG16 = pVar2.k().e.g(androidx.compose.ui.semantics.t.f);
                                                if (objG16 == null) {
                                                    objG16 = th;
                                                }
                                                if (objG16 == null) {
                                                    Object objG17 = pVar2.k().e.g(androidx.compose.ui.semantics.t.e);
                                                    if (objG17 == null) {
                                                        objG17 = th;
                                                    }
                                                    if (objG17 != null) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                } else {
                                                    z5 = true;
                                                }
                                                if (!z5) {
                                                    r1.k("android.widget.ScrollView");
                                                }
                                                z4 = true;
                                                if (((Number) iVar2.b.invoke()).floatValue() > f2) {
                                                    r1.p(true);
                                                }
                                                if (i0.b(pVar2)) {
                                                    if (a0.z(iVar2)) {
                                                        r1.b(androidx.core.view.accessibility.b.h);
                                                        r1.b(androidx.core.view.accessibility.b.o);
                                                    }
                                                    if (a0.y(iVar2)) {
                                                        r1.b(androidx.core.view.accessibility.b.i);
                                                        r1.b(androidx.core.view.accessibility.b.m);
                                                    }
                                                }
                                            }
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                i0.d(pVar2, r1);
                                            }
                                            r1.n((CharSequence) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.t.d));
                                            if (i0.b(pVar2)) {
                                                aVar5 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.t);
                                                if (aVar5 != null) {
                                                    r1.b(new androidx.core.view.accessibility.b(262144, aVar5.a));
                                                }
                                                aVar6 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.u);
                                                if (aVar6 != null) {
                                                    r1.b(new androidx.core.view.accessibility.b(524288, aVar6.a));
                                                }
                                                aVar7 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.v);
                                                if (aVar7 != null) {
                                                    r1.b(new androidx.core.view.accessibility.b(1048576, aVar7.a));
                                                }
                                                wVar3 = androidx.compose.ui.semantics.k.x;
                                                if (o0Var3.c(wVar3)) {
                                                    list2 = (List) lVar3.d(wVar3);
                                                    size4 = list2.size();
                                                    yVar = a0.l0;
                                                    if (size4 < yVar.b) {
                                                        androidx.collection.z0 z0Var4 = new androidx.collection.z0(0);
                                                        androidx.collection.f0 f0VarA = androidx.collection.t0.a();
                                                        z0Var3 = z0Var2;
                                                        if (z0Var3.e) {
                                                            androidx.collection.t.a(z0Var3);
                                                        }
                                                        if (androidx.collection.internal.a.a(z0Var3.y, z0Var3.A, i6) < 0) {
                                                            z4 = false;
                                                        }
                                                        if (z4) {
                                                            f0Var = (androidx.collection.f0) z0Var3.c(i6);
                                                            iArr = yVar.a;
                                                            i8 = yVar.b;
                                                            iArrCopyOf = new int[16];
                                                            i9 = 0;
                                                            i10 = 0;
                                                            while (i9 < i8) {
                                                                int i35 = iArr[i9];
                                                                int i36 = i8;
                                                                i11 = i10 + 1;
                                                                int i37 = i9;
                                                                if (iArrCopyOf.length < i11) {
                                                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i11, (iArrCopyOf.length * 3) / 2));
                                                                }
                                                                iArrCopyOf[i10] = i35;
                                                                i9 = i37 + 1;
                                                                i10 = i11;
                                                                i8 = i36;
                                                            }
                                                            arrayList2 = new ArrayList();
                                                            if (list2.size() <= 0) {
                                                                androidx.privacysandbox.ads.adservices.java.internal.a.C(list2.get(0));
                                                                f0Var.getClass();
                                                                throw th;
                                                            }
                                                            if (arrayList2.size() > 0) {
                                                                androidx.privacysandbox.ads.adservices.java.internal.a.C(arrayList2.get(0));
                                                                if (i10 <= 0) {
                                                                    int i38 = iArrCopyOf[0];
                                                                    throw th;
                                                                }
                                                                com.google.gson.b.n("Index must be between 0 and size");
                                                            }
                                                        } else if (list2.size() > 0) {
                                                            androidx.privacysandbox.ads.adservices.java.internal.a.C(list2.get(0));
                                                            yVar.c(0);
                                                            throw th;
                                                        }
                                                        r7.P.e(i6, z0Var4);
                                                        z0Var3.e(i6, f0VarA);
                                                    } else {
                                                        net.luminis.tls.engine.impl.c.r(androidx.privacysandbox.ads.adservices.java.internal.a.m(yVar.b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                                    }
                                                }
                                            }
                                            r1.o(i0.c(pVar2, resources));
                                            iD = r7.Z.d(i6);
                                            if (iD != -1) {
                                                hVarP2 = i0.p(uVar2.getAndroidViewsHandler$ui(), iD);
                                                if (hVarP2 != null) {
                                                    r9.setTraversalBefore(hVarP2);
                                                    uVar = uVar2;
                                                } else {
                                                    uVar = uVar2;
                                                    r9.setTraversalBefore(uVar, iD);
                                                }
                                                ?? r11 = th;
                                                r7.j(i6, r1, r7.b0, r11);
                                                r5 = r11;
                                            } else {
                                                r5 = th;
                                                uVar = uVar2;
                                            }
                                            iD2 = r7.a0.d(i6);
                                            if (iD2 != -1 && (hVarP = i0.p(uVar.getAndroidViewsHandler$ui(), iD2)) != null) {
                                                r9.setTraversalAfter(hVarP);
                                                r7.j(i6, r1, r7.c0, r5);
                                            }
                                            str2 = (String) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.u.b);
                                            if (str2 != null) {
                                                r1.k(str2);
                                            }
                                            r6 = r1;
                                            r10 = r7;
                                        } else {
                                            androidx.transition.k.i();
                                        }
                                        return null;
                                    }
                                    a0Var = a0Var2;
                                    z2 = true;
                                    r7 = a0Var;
                                    r9.setVisibleToUser(androidx.compose.ui.semantics.s.e(pVar2) ^ z2);
                                    objG8 = o0Var3.g(androidx.compose.ui.semantics.t.j);
                                    if (objG8 == null) {
                                        objG8 = th;
                                    }
                                    if (objG8 == null) {
                                        r9.setClickable(false);
                                        aVar2 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.b);
                                        c = 3;
                                        if (aVar2 != null) {
                                            boolean zA5 = kotlin.jvm.internal.l.a(androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.t.I), Boolean.TRUE);
                                            if (hVar3 == null) {
                                                z14 = false;
                                            } else {
                                                z14 = true;
                                            }
                                            if (z14) {
                                                z15 = true;
                                            } else {
                                                if (hVar3 == null) {
                                                    z17 = false;
                                                } else {
                                                    z17 = true;
                                                }
                                                if (z17) {
                                                    z15 = true;
                                                } else {
                                                    z15 = false;
                                                }
                                            }
                                            if (z15) {
                                                z16 = true;
                                            } else {
                                                z16 = true;
                                            }
                                            r9.setClickable(z16);
                                            if (i0.b(pVar2)) {
                                                r1.b(new androidx.core.view.accessibility.b(16, aVar2.a));
                                            }
                                        }
                                        r9.setLongClickable(false);
                                        aVar3 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.c);
                                        if (aVar3 != null) {
                                            r9.setLongClickable(true);
                                            if (i0.b(pVar2)) {
                                                r1.b(new androidx.core.view.accessibility.b(32, aVar3.a));
                                            }
                                        }
                                        aVar4 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.q);
                                        if (aVar4 != null) {
                                            r1.b(new androidx.core.view.accessibility.b(16384, aVar4.a));
                                        }
                                        if (i0.b(pVar2)) {
                                            aVar10 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.k);
                                            if (aVar10 != null) {
                                                r1.b(new androidx.core.view.accessibility.b(2097152, aVar10.a));
                                            }
                                            aVar11 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.p);
                                            if (aVar11 != null) {
                                                r1.b(new androidx.core.view.accessibility.b(android.R.id.accessibilityActionImeEnter, aVar11.a));
                                            }
                                            aVar12 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.r);
                                            if (aVar12 != null) {
                                                r1.b(new androidx.core.view.accessibility.b(Parser.ARGC_LIMIT, aVar12.a));
                                            }
                                            aVar13 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.s);
                                            if (aVar13 != null) {
                                                primaryClipDescription = uVar2.getClipboardManager().a.getPrimaryClipDescription();
                                                if (primaryClipDescription != null) {
                                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                                } else {
                                                    zHasMimeType = false;
                                                }
                                                if (zHasMimeType) {
                                                    r1.b(new androidx.core.view.accessibility.b(32768, aVar13.a));
                                                }
                                            }
                                        }
                                        strT = a0.t(pVar2);
                                        if (strT != null) {
                                            z3 = true;
                                        } else {
                                            z3 = true;
                                        }
                                        if (!z3) {
                                            accessibilityNodeInfo2.setTextSelection(r7.r(pVar2), r7.q(pVar2));
                                            aVar9 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.j);
                                            if (aVar9 != null) {
                                                r8 = aVar9.a;
                                            } else {
                                                r8 = th;
                                            }
                                            r1.b(new androidx.core.view.accessibility.b(131072, (String) r8));
                                            r1.a(LibretroCore.SCREEN_WIDTH);
                                            r1.a(512);
                                            r9.setMovementGranularities(11);
                                            list3 = (List) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.t.a);
                                            if (list3 != null) {
                                                z11 = true;
                                            } else {
                                                z11 = true;
                                            }
                                            if (z11) {
                                                if (o0Var3.c(androidx.compose.ui.semantics.t.F)) {
                                                    V = f0Var3.v();
                                                    while (true) {
                                                        if (V == 0) {
                                                            V = th;
                                                        } else {
                                                            lVarX2 = V.x();
                                                            if (lVarX2 != null) {
                                                                z12 = false;
                                                            } else {
                                                                z12 = false;
                                                            }
                                                            if (!z12) {
                                                                V = V.v();
                                                            }
                                                        }
                                                    }
                                                    if (V != 0) {
                                                        lVarX = V.x();
                                                        if (lVarX != null) {
                                                            objG13 = lVarX.e.g(wVar2);
                                                            if (objG13 == null) {
                                                                objG13 = th;
                                                            }
                                                            zA = kotlin.jvm.internal.l.a(objG13, Boolean.TRUE);
                                                        } else {
                                                            zA = false;
                                                        }
                                                        if (zA) {
                                                        }
                                                    }
                                                } else {
                                                    V = f0Var3.v();
                                                    while (true) {
                                                        if (V == 0) {
                                                            V = th;
                                                        } else {
                                                            lVarX2 = V.x();
                                                            if (lVarX2 != null) {
                                                                z12 = false;
                                                            } else {
                                                                z12 = false;
                                                            }
                                                            if (!z12) {
                                                                V = V.v();
                                                            }
                                                        }
                                                    }
                                                    if (V != 0) {
                                                        lVarX = V.x();
                                                        if (lVarX != null) {
                                                            objG13 = lVarX.e.g(wVar2);
                                                            if (objG13 == null) {
                                                                objG13 = th;
                                                            }
                                                            zA = kotlin.jvm.internal.l.a(objG13, Boolean.TRUE);
                                                        } else {
                                                            zA = false;
                                                        }
                                                        if (zA) {
                                                        }
                                                    }
                                                }
                                                if (!z13) {
                                                    r9.setMovementGranularities(accessibilityNodeInfo2.getMovementGranularities() | 20);
                                                }
                                            }
                                        }
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            arrayList3 = new ArrayList();
                                            arrayList3.add("androidx.compose.ui.semantics.id");
                                            charSequenceG = r1.g();
                                            if (charSequenceG != null) {
                                                z10 = true;
                                            } else {
                                                z10 = true;
                                            }
                                            if (!z10) {
                                                arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                            }
                                            if (o0Var3.c(androidx.compose.ui.semantics.t.z)) {
                                                arrayList3.add("androidx.compose.ui.semantics.testTag");
                                            }
                                            if (o0Var3.c(androidx.compose.ui.semantics.t.P)) {
                                                arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                                            }
                                            r1.i(arrayList3);
                                        }
                                        gVar = (androidx.compose.ui.semantics.g) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.t.c);
                                        f = 0.0f;
                                        if (gVar != null) {
                                            f3 = gVar.a;
                                            f4 = gVar.b.a;
                                            wVar4 = androidx.compose.ui.semantics.k.i;
                                            if (o0Var3.c(wVar4)) {
                                                r1.k("android.widget.SeekBar");
                                            } else {
                                                r1.k("android.widget.ProgressBar");
                                            }
                                            if (gVar != androidx.compose.ui.semantics.g.c) {
                                                accessibilityNodeInfo2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, f4, f3));
                                            }
                                            if (o0Var3.c(wVar4)) {
                                                if (f4 < 0.0f) {
                                                    f5 = 0.0f;
                                                } else {
                                                    f5 = f4;
                                                }
                                                if (f3 < f5) {
                                                    r1.b(androidx.core.view.accessibility.b.h);
                                                }
                                                if (0.0f <= f4) {
                                                    f4 = 0.0f;
                                                }
                                                if (f3 > f4) {
                                                    r1.b(androidx.core.view.accessibility.b.i);
                                                }
                                            }
                                        }
                                        if (i0.b(pVar2)) {
                                            r1.b(new androidx.core.view.accessibility.b(android.R.id.accessibilityActionSetProgress, aVar8.a));
                                        }
                                        objG9 = pVar2.k().e.g(androidx.compose.ui.semantics.t.f);
                                        if (objG9 == null) {
                                            objG9 = null;
                                        }
                                        cVar = (androidx.compose.ui.semantics.c) objG9;
                                        accessibilityNodeInfo3 = r1.a;
                                        if (cVar != null) {
                                            accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(cVar.a, cVar.b, false, 0));
                                            f2 = 0.0f;
                                        } else {
                                            arrayList = new ArrayList();
                                            objG10 = pVar2.k().e.g(androidx.compose.ui.semantics.t.e);
                                            if ((objG10 != null ? objG10 : null) != null) {
                                                listJ2 = androidx.compose.ui.semantics.p.j(4, pVar2);
                                                size3 = listJ2.size();
                                                i7 = 0;
                                                while (i7 < size3) {
                                                    float f7 = f;
                                                    pVar3 = (androidx.compose.ui.semantics.p) listJ2.get(i7);
                                                    char c3 = c;
                                                    if (pVar3.k().e.c(androidx.compose.ui.semantics.t.I)) {
                                                        arrayList.add(pVar3);
                                                    }
                                                    i7++;
                                                    c = c3;
                                                    f = f7;
                                                }
                                            }
                                            f2 = f;
                                            if (!arrayList.isEmpty()) {
                                                zK = _COROUTINE.a.k(arrayList);
                                                if (zK) {
                                                    size2 = 1;
                                                } else {
                                                    size2 = arrayList.size();
                                                }
                                                accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(size2, zK ? arrayList.size() : 1, false, 0));
                                            }
                                        }
                                        _COROUTINE.a.I(pVar2, r1);
                                        iVar = (androidx.compose.ui.semantics.i) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.t.u);
                                        androidx.compose.ui.semantics.a aVar15 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.d);
                                        if (iVar != null) {
                                            objG11 = pVar2.k().e.g(androidx.compose.ui.semantics.t.f);
                                            if (objG11 == null) {
                                                objG11 = th;
                                            }
                                            if (objG11 == null) {
                                                objG12 = pVar2.k().e.g(androidx.compose.ui.semantics.t.e);
                                                if (objG12 == null) {
                                                    objG12 = th;
                                                }
                                                if (objG12 != null) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                            } else {
                                                z6 = true;
                                            }
                                            if (!z6) {
                                                r1.k("android.widget.HorizontalScrollView");
                                            }
                                            if (((Number) iVar.b.invoke()).floatValue() > f2) {
                                                r1.p(true);
                                            }
                                            if (i0.b(pVar2)) {
                                                z7 = a0.z(iVar);
                                                mVar = androidx.compose.ui.unit.m.y;
                                                if (z7) {
                                                    r1.b(androidx.core.view.accessibility.b.h);
                                                    f0Var2 = f0Var3;
                                                    if (f0Var2.X == mVar) {
                                                        z9 = true;
                                                    } else {
                                                        z9 = false;
                                                    }
                                                    if (z9) {
                                                        bVar2 = androidx.core.view.accessibility.b.p;
                                                    } else {
                                                        bVar2 = androidx.core.view.accessibility.b.n;
                                                    }
                                                    r1.b(bVar2);
                                                } else {
                                                    f0Var2 = f0Var3;
                                                }
                                                if (a0.y(iVar)) {
                                                    r1.b(androidx.core.view.accessibility.b.i);
                                                    if (f0Var2.X == mVar) {
                                                        z8 = true;
                                                    } else {
                                                        z8 = false;
                                                    }
                                                    if (z8) {
                                                        bVar = androidx.core.view.accessibility.b.n;
                                                    } else {
                                                        bVar = androidx.core.view.accessibility.b.p;
                                                    }
                                                    r1.b(bVar);
                                                }
                                            }
                                        }
                                        iVar2 = (androidx.compose.ui.semantics.i) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.t.v);
                                        if (iVar2 != null) {
                                            z4 = true;
                                        } else {
                                            z4 = true;
                                        }
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            i0.d(pVar2, r1);
                                        }
                                        r1.n((CharSequence) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.t.d));
                                        if (i0.b(pVar2)) {
                                            aVar5 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.t);
                                            if (aVar5 != null) {
                                                r1.b(new androidx.core.view.accessibility.b(262144, aVar5.a));
                                            }
                                            aVar6 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.u);
                                            if (aVar6 != null) {
                                                r1.b(new androidx.core.view.accessibility.b(524288, aVar6.a));
                                            }
                                            aVar7 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.v);
                                            if (aVar7 != null) {
                                                r1.b(new androidx.core.view.accessibility.b(1048576, aVar7.a));
                                            }
                                            wVar3 = androidx.compose.ui.semantics.k.x;
                                            if (o0Var3.c(wVar3)) {
                                                list2 = (List) lVar3.d(wVar3);
                                                size4 = list2.size();
                                                yVar = a0.l0;
                                                if (size4 < yVar.b) {
                                                    androidx.collection.z0 z0Var5 = new androidx.collection.z0(0);
                                                    androidx.collection.f0 f0VarA2 = androidx.collection.t0.a();
                                                    z0Var3 = z0Var2;
                                                    if (z0Var3.e) {
                                                        androidx.collection.t.a(z0Var3);
                                                    }
                                                    if (androidx.collection.internal.a.a(z0Var3.y, z0Var3.A, i6) < 0) {
                                                        z4 = false;
                                                    }
                                                    if (z4) {
                                                        f0Var = (androidx.collection.f0) z0Var3.c(i6);
                                                        iArr = yVar.a;
                                                        i8 = yVar.b;
                                                        iArrCopyOf = new int[16];
                                                        i9 = 0;
                                                        i10 = 0;
                                                        while (i9 < i8) {
                                                            int i39 = iArr[i9];
                                                            int i310 = i8;
                                                            i11 = i10 + 1;
                                                            int i311 = i9;
                                                            if (iArrCopyOf.length < i11) {
                                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i11, (iArrCopyOf.length * 3) / 2));
                                                            }
                                                            iArrCopyOf[i10] = i39;
                                                            i9 = i311 + 1;
                                                            i10 = i11;
                                                            i8 = i310;
                                                        }
                                                        arrayList2 = new ArrayList();
                                                        if (list2.size() <= 0) {
                                                            androidx.privacysandbox.ads.adservices.java.internal.a.C(list2.get(0));
                                                            f0Var.getClass();
                                                            throw th;
                                                        }
                                                        if (arrayList2.size() > 0) {
                                                            androidx.privacysandbox.ads.adservices.java.internal.a.C(arrayList2.get(0));
                                                            if (i10 <= 0) {
                                                                int i312 = iArrCopyOf[0];
                                                                throw th;
                                                            }
                                                            com.google.gson.b.n("Index must be between 0 and size");
                                                        }
                                                    } else if (list2.size() > 0) {
                                                        androidx.privacysandbox.ads.adservices.java.internal.a.C(list2.get(0));
                                                        yVar.c(0);
                                                        throw th;
                                                    }
                                                    r7.P.e(i6, z0Var5);
                                                    z0Var3.e(i6, f0VarA2);
                                                } else {
                                                    net.luminis.tls.engine.impl.c.r(androidx.privacysandbox.ads.adservices.java.internal.a.m(yVar.b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                                }
                                            }
                                        }
                                        r1.o(i0.c(pVar2, resources));
                                        iD = r7.Z.d(i6);
                                        if (iD != -1) {
                                            hVarP2 = i0.p(uVar2.getAndroidViewsHandler$ui(), iD);
                                            if (hVarP2 != null) {
                                                r9.setTraversalBefore(hVarP2);
                                                uVar = uVar2;
                                            } else {
                                                uVar = uVar2;
                                                r9.setTraversalBefore(uVar, iD);
                                            }
                                            ?? r12 = th;
                                            r7.j(i6, r1, r7.b0, r12);
                                            r5 = r12;
                                        } else {
                                            r5 = th;
                                            uVar = uVar2;
                                        }
                                        iD2 = r7.a0.d(i6);
                                        if (iD2 != -1) {
                                            r9.setTraversalAfter(hVarP);
                                            r7.j(i6, r1, r7.c0, r5);
                                        }
                                        str2 = (String) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.u.b);
                                        if (str2 != null) {
                                            r1.k(str2);
                                        }
                                        r6 = r1;
                                        r10 = r7;
                                    } else {
                                        androidx.transition.k.i();
                                    }
                                    return null;
                                }
                                int i40 = size;
                                pVar5 = (androidx.compose.ui.semantics.p) listJ.get(i4);
                                List list5 = listJ;
                                nVarS = a0Var2.s();
                                int i41 = i4;
                                i28 = pVar5.g;
                                if (nVarS.a(i28)) {
                                    hVar4 = uVar2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(pVar5.c);
                                    if (i28 != -1) {
                                        if (hVar4 != null) {
                                            accessibilityNodeInfoObtain.addChild(hVar4);
                                        } else {
                                            qVar = (androidx.compose.ui.semantics.q) a0Var2.s().b(i28);
                                            if (qVar != null || (pVar6 = qVar.a) == null) {
                                                zA2 = false;
                                            } else {
                                                Object objG18 = pVar6.k().e.g(androidx.compose.ui.semantics.t.n);
                                                if (objG18 == null) {
                                                    objG18 = th;
                                                }
                                                zA2 = kotlin.jvm.internal.l.a(objG18, Boolean.TRUE);
                                            }
                                            if (z || !zA2) {
                                                r9.addChild(uVar2, i28);
                                            }
                                        }
                                        xVar.f(i28, i3);
                                        i3++;
                                    }
                                }
                                i4 = i41 + 1;
                                listJ = list5;
                                size = i40;
                            }
                        } else if (Build.VERSION.SDK_INT >= 34 ? androidx.compose.ui.text.android.b.j(accessibilityManager2) : true) {
                            accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                            dVar = new androidx.core.view.accessibility.d(accessibilityNodeInfoObtain);
                            i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 34) {
                                androidx.compose.ui.text.android.b.l(accessibilityNodeInfoObtain, zA3);
                            } else {
                                dVar.j(64, zA3);
                            }
                            if (i == -1) {
                                th = null;
                                pVarL = pVar7.l();
                                if (pVarL != null) {
                                    numValueOf = Integer.valueOf(pVarL.g);
                                } else {
                                    numValueOf = null;
                                }
                                if (numValueOf != null) {
                                    iIntValue = numValueOf.intValue();
                                    if (iIntValue == uVar2.getSemanticsOwner().a().g) {
                                        iIntValue = -1;
                                    }
                                    dVar.b = iIntValue;
                                    accessibilityNodeInfoObtain.setParent(uVar2, iIntValue);
                                } else {
                                    androidx.compose.ui.internal.a.c("semanticsNode " + i + " has null parent");
                                    com.google.gson.b.b();
                                }
                                return null;
                            }
                            parentForAccessibility = uVar2.getParentForAccessibility();
                            th = null;
                            if (parentForAccessibility instanceof View) {
                                view = (View) parentForAccessibility;
                            } else {
                                view = null;
                            }
                            dVar.b = -1;
                            accessibilityNodeInfoObtain.setParent(view);
                            dVar.c = i;
                            accessibilityNodeInfoObtain.setSource(uVar2, i);
                            accessibilityNodeInfoObtain.setBoundsInScreen(a0Var2.k(qVar2));
                            xVar = a0Var2.h0;
                            z0Var = a0Var2.Q;
                            resources = uVar2.getContext().getResources();
                            dVar.k("android.view.View");
                            lVar = pVar7.d;
                            o0Var = lVar.e;
                            if (o0Var.c(androidx.compose.ui.semantics.t.F)) {
                                dVar.k("android.widget.EditText");
                            }
                            if (o0Var.c(androidx.compose.ui.semantics.t.B)) {
                                dVar.k("android.widget.TextView");
                            }
                            objG = o0Var.g(androidx.compose.ui.semantics.t.y);
                            if (objG == null) {
                                objG = th;
                            }
                            hVar = (androidx.compose.ui.semantics.h) objG;
                            if (hVar != null) {
                                i29 = hVar.a;
                                accessibilityManager = accessibilityManager2;
                                if (pVar7.e) {
                                    i30 = 4;
                                    z0Var2 = z0Var;
                                } else {
                                    i30 = 4;
                                    z0Var2 = z0Var;
                                    if (androidx.compose.ui.semantics.p.j(4, pVar7).isEmpty()) {
                                    }
                                }
                                if (i29 == i30) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                                } else if (i29 == 2) {
                                    accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                                } else {
                                    strR = i0.r(i29);
                                    if (i29 == 5) {
                                        dVar.k(strR);
                                    } else {
                                        dVar.k(strR);
                                    }
                                }
                            } else {
                                accessibilityManager = accessibilityManager2;
                                z0Var2 = z0Var;
                            }
                            accessibilityNodeInfoObtain.setPackageName(uVar2.getContext().getPackageName());
                            accessibilityNodeInfoObtain.setImportantForAccessibility(androidx.compose.ui.semantics.s.f(pVar7));
                            if (i2 >= 34) {
                                zJ = androidx.compose.ui.text.android.b.j(accessibilityManager);
                            } else {
                                zJ = true;
                            }
                            listJ = androidx.compose.ui.semantics.p.j(4, pVar7);
                            size = listJ.size();
                            z = zJ;
                            i3 = 0;
                            i4 = 0;
                            while (true) {
                                r9 = dVar.a;
                                if (i4 < size) {
                                    if (i == a0Var2.I) {
                                        r9.setAccessibilityFocused(true);
                                        dVar.b(androidx.core.view.accessibility.b.g);
                                    } else {
                                        r9.setAccessibilityFocused(false);
                                        dVar.b(androidx.core.view.accessibility.b.f);
                                    }
                                    gVarI = i0.i(pVar7);
                                    if (gVarI != null) {
                                        uVar2.getFontFamilyResolver();
                                        density = uVar2.getDensity();
                                        c2Var = a0Var2.d0;
                                        String str4 = gVarI.y;
                                        list4 = gVarI.e;
                                        spannableString = new SpannableString(str4);
                                        arrayList4 = gVarI.z;
                                        if (arrayList4 != null) {
                                            size11 = arrayList4.size();
                                            i22 = 0;
                                            while (i22 < size11) {
                                                ArrayList arrayList9 = arrayList4;
                                                androidx.compose.ui.text.e eVar9 = (androidx.compose.ui.text.e) arrayList4.get(i22);
                                                int i313 = i22;
                                                androidx.compose.ui.text.e0 e0Var2 = (androidx.compose.ui.text.e0) eVar9.a;
                                                int i314 = size11;
                                                i23 = eVar9.b;
                                                i24 = eVar9.c;
                                                androidx.collection.x xVar4 = xVar;
                                                androidx.compose.ui.semantics.h hVar6 = hVar;
                                                androidx.compose.ui.semantics.l lVar10 = lVar;
                                                jB = e0Var2.a.b();
                                                androidx.compose.ui.semantics.p pVar9 = pVar7;
                                                androidx.collection.o0 o0Var6 = o0Var;
                                                long j3 = e0Var2.b;
                                                lVar6 = e0Var2.c;
                                                jVar = e0Var2.d;
                                                pVar4 = e0Var2.j;
                                                androidx.compose.ui.text.intl.b bVar4 = e0Var2.k;
                                                AccessibilityNodeInfo accessibilityNodeInfo5 = accessibilityNodeInfoObtain;
                                                androidx.core.view.accessibility.d dVar5 = dVar;
                                                j = e0Var2.l;
                                                lVar7 = e0Var2.m;
                                                oVar = e0Var2.a;
                                                if (androidx.compose.ui.graphics.t.c(jB, oVar.b())) {
                                                    oVar2 = oVar;
                                                } else {
                                                    if (jB != 16) {
                                                        cVar2 = new androidx.compose.ui.text.style.c(jB);
                                                    } else {
                                                        cVar2 = androidx.compose.ui.text.style.n.a;
                                                    }
                                                    oVar2 = cVar2;
                                                }
                                                com.google.firebase.crashlytics.internal.model.t1.z(spannableString, oVar2.b(), i23, i24);
                                                spannableString3 = spannableString;
                                                com.google.firebase.crashlytics.internal.model.t1.A(spannableString3, j3, density, i23, i24);
                                                if (lVar6 == null) {
                                                    if (lVar6 == null) {
                                                        lVar8 = androidx.compose.ui.text.font.l.z;
                                                    } else {
                                                        lVar8 = lVar6;
                                                    }
                                                    if (jVar != null) {
                                                        i25 = jVar.a;
                                                    } else {
                                                        i25 = 0;
                                                    }
                                                    StyleSpan styleSpan2 = new StyleSpan(_COROUTINE.b.n(lVar8, i25));
                                                    i26 = 33;
                                                    spannableString3.setSpan(styleSpan2, i23, i24, 33);
                                                } else {
                                                    if (lVar6 == null) {
                                                        lVar8 = androidx.compose.ui.text.font.l.z;
                                                    } else {
                                                        lVar8 = lVar6;
                                                    }
                                                    if (jVar != null) {
                                                        i25 = jVar.a;
                                                    } else {
                                                        i25 = 0;
                                                    }
                                                    StyleSpan styleSpan3 = new StyleSpan(_COROUTINE.b.n(lVar8, i25));
                                                    i26 = 33;
                                                    spannableString3.setSpan(styleSpan3, i23, i24, 33);
                                                }
                                                if (lVar7 != null) {
                                                    i27 = lVar7.a;
                                                    if ((i27 | 1) == i27) {
                                                        spannableString3.setSpan(new UnderlineSpan(), i23, i24, i26);
                                                    }
                                                    if ((i27 | 2) == i27) {
                                                        spannableString3.setSpan(new StrikethroughSpan(), i23, i24, i26);
                                                    }
                                                }
                                                if (pVar4 != null) {
                                                    spannableString3.setSpan(new ScaleXSpan(pVar4.a), i23, i24, i26);
                                                }
                                                com.google.firebase.crashlytics.internal.model.t1.B(spannableString3, bVar4, i23, i24);
                                                if (j != 16) {
                                                    spannableString3.setSpan(new BackgroundColorSpan(androidx.compose.ui.graphics.a0.y(j)), i23, i24, i26);
                                                }
                                                i22 = i313 + 1;
                                                spannableString = spannableString3;
                                                arrayList4 = arrayList9;
                                                size11 = i314;
                                                xVar = xVar4;
                                                lVar = lVar10;
                                                hVar = hVar6;
                                                o0Var = o0Var6;
                                                pVar7 = pVar9;
                                                accessibilityNodeInfoObtain = accessibilityNodeInfo5;
                                                dVar = dVar5;
                                            }
                                        }
                                        xVar2 = xVar;
                                        spannableString2 = spannableString;
                                        pVar = pVar7;
                                        o0Var2 = o0Var;
                                        hVar2 = hVar;
                                        lVar2 = lVar;
                                        accessibilityNodeInfo = accessibilityNodeInfoObtain;
                                        androidx.core.view.accessibility.d dVar6 = dVar;
                                        int length4 = str4.length();
                                        arrayList5 = kotlin.collections.u.e;
                                        if (list4 != null) {
                                            arrayList6 = new ArrayList(list4.size());
                                            size10 = list4.size();
                                            for (i21 = 0; i21 < size10; i21++) {
                                                Object obj5 = list4.get(i21);
                                                eVar5 = (androidx.compose.ui.text.e) obj5;
                                                if (!(eVar5.a instanceof androidx.compose.ui.text.o0)) {
                                                }
                                            }
                                        } else {
                                            arrayList6 = arrayList5;
                                        }
                                        size5 = arrayList6.size();
                                        for (i12 = 0; i12 < size5; i12++) {
                                            androidx.compose.ui.text.e eVar10 = (androidx.compose.ui.text.e) arrayList6.get(i12);
                                            o0Var4 = (androidx.compose.ui.text.o0) eVar10.a;
                                            i19 = eVar10.b;
                                            i20 = eVar10.c;
                                            if (o0Var4 instanceof androidx.compose.ui.text.o0) {
                                                coil3.g.a();
                                                return null;
                                            }
                                            spannableString2.setSpan(new TtsSpan.VerbatimBuilder(o0Var4.a).build(), i19, i20, 33);
                                        }
                                        int length5 = str4.length();
                                        if (list4 != null) {
                                            arrayList7 = new ArrayList(list4.size());
                                            size9 = list4.size();
                                            for (i18 = 0; i18 < size9; i18++) {
                                                Object obj6 = list4.get(i18);
                                                eVar4 = (androidx.compose.ui.text.e) obj6;
                                                if (!(eVar4.a instanceof androidx.compose.ui.text.n0)) {
                                                }
                                            }
                                        } else {
                                            arrayList7 = arrayList5;
                                        }
                                        size6 = arrayList7.size();
                                        for (i13 = 0; i13 < size6; i13++) {
                                            androidx.compose.ui.text.e eVar11 = (androidx.compose.ui.text.e) arrayList7.get(i13);
                                            n0Var = (androidx.compose.ui.text.n0) eVar11.a;
                                            int i315 = eVar11.b;
                                            int i316 = eVar11.c;
                                            weakHashMap3 = (WeakHashMap) c2Var.y;
                                            uRLSpan2 = weakHashMap3.get(n0Var);
                                            if (uRLSpan2 == null) {
                                                uRLSpan2 = new URLSpan(n0Var.a);
                                                weakHashMap3.put(n0Var, uRLSpan2);
                                            }
                                            spannableString2.setSpan((URLSpan) uRLSpan2, i315, i316, 33);
                                        }
                                        int length6 = str4.length();
                                        if (list4 != null) {
                                            arrayList5 = new ArrayList(list4.size());
                                            size8 = list4.size();
                                            for (i17 = 0; i17 < size8; i17++) {
                                                Object obj7 = list4.get(i17);
                                                eVar3 = (androidx.compose.ui.text.e) obj7;
                                                if (!(eVar3.a instanceof androidx.compose.ui.text.m)) {
                                                }
                                            }
                                        }
                                        size7 = arrayList5.size();
                                        for (i14 = 0; i14 < size7; i14++) {
                                            eVar = (androidx.compose.ui.text.e) arrayList5.get(i14);
                                            i15 = eVar.b;
                                            obj = eVar.a;
                                            i16 = eVar.c;
                                            if (i15 != i16) {
                                                mVar2 = (androidx.compose.ui.text.m) obj;
                                                if (mVar2 instanceof androidx.compose.ui.text.l) {
                                                    obj.getClass();
                                                    lVar5 = (androidx.compose.ui.text.l) obj;
                                                    eVar2 = new androidx.compose.ui.text.e(lVar5, i15, i16);
                                                    weakHashMap2 = (WeakHashMap) c2Var.z;
                                                    uRLSpan = weakHashMap2.get(eVar2);
                                                    if (uRLSpan == null) {
                                                        uRLSpan = new URLSpan(lVar5.a);
                                                        weakHashMap2.put(eVar2, uRLSpan);
                                                    }
                                                    spannableString2.setSpan((URLSpan) uRLSpan, i15, i16, 33);
                                                } else {
                                                    weakHashMap = (WeakHashMap) c2Var.A;
                                                    gVar2 = weakHashMap.get(eVar);
                                                    if (gVar2 == null) {
                                                        gVar2 = new androidx.compose.ui.text.platform.g(mVar2);
                                                        weakHashMap.put(eVar, gVar2);
                                                    }
                                                    spannableString2.setSpan((ClickableSpan) gVar2, i15, i16, 33);
                                                }
                                            }
                                        }
                                        r1 = dVar6;
                                        r0 = (SpannableString) a0.P(spannableString2);
                                    } else {
                                        a0Var2 = a0Var2;
                                        xVar2 = xVar;
                                        pVar = pVar7;
                                        o0Var2 = o0Var;
                                        hVar2 = hVar;
                                        lVar2 = lVar;
                                        accessibilityNodeInfo = accessibilityNodeInfoObtain;
                                        r1 = dVar;
                                        r0 = th;
                                    }
                                    r1.r(r0);
                                    wVar = androidx.compose.ui.semantics.t.L;
                                    o0Var3 = o0Var2;
                                    if (o0Var3.c(wVar)) {
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                        accessibilityNodeInfo2.setContentInvalid(true);
                                        objG14 = o0Var3.g(wVar);
                                        if (objG14 == null) {
                                            objG14 = th;
                                        }
                                        r9.setError((CharSequence) objG14);
                                    } else {
                                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                                    }
                                    pVar2 = pVar;
                                    strH = i0.h(pVar2, resources);
                                    if (Build.VERSION.SDK_INT >= 30) {
                                        androidx.compose.ui.graphics.layer.i.l(r9, strH);
                                    } else {
                                        r9.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strH);
                                    }
                                    r9.setCheckable(i0.g(pVar2));
                                    objG2 = o0Var3.g(androidx.compose.ui.semantics.t.J);
                                    if (objG2 == null) {
                                        objG2 = th;
                                    }
                                    aVar = (androidx.compose.ui.state.a) objG2;
                                    if (aVar != null) {
                                        if (aVar == androidx.compose.ui.state.a.e) {
                                            r9.setChecked(true);
                                        } else if (aVar == androidx.compose.ui.state.a.y) {
                                            r9.setChecked(false);
                                        }
                                    }
                                    objG3 = o0Var3.g(androidx.compose.ui.semantics.t.I);
                                    if (objG3 == null) {
                                        objG3 = th;
                                    }
                                    bool = (Boolean) objG3;
                                    if (bool != null) {
                                        zBooleanValue2 = bool.booleanValue();
                                        if (hVar2 == null) {
                                            hVar3 = hVar2;
                                            i5 = 4;
                                        } else {
                                            hVar3 = hVar2;
                                            i5 = 4;
                                            if (hVar3.a == 4) {
                                                accessibilityNodeInfo2.setSelected(zBooleanValue2);
                                            }
                                        }
                                        r9.setChecked(zBooleanValue2);
                                    } else {
                                        hVar3 = hVar2;
                                        i5 = 4;
                                    }
                                    lVar3 = lVar2;
                                    if (lVar3.z) {
                                        objG4 = o0Var3.g(androidx.compose.ui.semantics.t.a);
                                        if (objG4 == null) {
                                            objG4 = th;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            r4 = (String) kotlin.collections.o.M(list);
                                        } else {
                                            r4 = th;
                                        }
                                        r9.setContentDescription(r4);
                                    } else {
                                        objG4 = o0Var3.g(androidx.compose.ui.semantics.t.a);
                                        if (objG4 == null) {
                                            objG4 = th;
                                        }
                                        list = (List) objG4;
                                        if (list != null) {
                                            r4 = (String) kotlin.collections.o.M(list);
                                        } else {
                                            r4 = th;
                                        }
                                        r9.setContentDescription(r4);
                                    }
                                    objG5 = o0Var3.g(androidx.compose.ui.semantics.t.z);
                                    if (objG5 == null) {
                                        objG5 = th;
                                    }
                                    str = (String) objG5;
                                    if (str != null) {
                                        pVarL2 = pVar2;
                                        while (true) {
                                            if (pVarL2 != null) {
                                                lVar4 = pVarL2.d;
                                                wVar5 = androidx.compose.ui.semantics.u.a;
                                                if (lVar4.e.c(wVar5)) {
                                                    zBooleanValue = ((Boolean) lVar4.d(wVar5)).booleanValue();
                                                } else {
                                                    pVarL2 = pVarL2.l();
                                                }
                                            } else {
                                                zBooleanValue = false;
                                            }
                                        }
                                        if (zBooleanValue) {
                                            accessibilityNodeInfo2.setViewIdResourceName(str);
                                        }
                                    }
                                    objG6 = o0Var3.g(androidx.compose.ui.semantics.t.h);
                                    if (objG6 == null) {
                                        objG6 = th;
                                    }
                                    if (((kotlin.y) objG6) != null) {
                                        r1.l(true);
                                    }
                                    i6 = i;
                                    if (i6 != -1) {
                                        iD3 = xVar2.d(pVar2.g);
                                        if (iD3 != -1) {
                                            accessibilityNodeInfo2.setDrawingOrder(iD3);
                                        } else {
                                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                                        }
                                    }
                                    accessibilityNodeInfo2.setPassword(o0Var3.c(androidx.compose.ui.semantics.t.K));
                                    accessibilityNodeInfo2.setEditable(o0Var3.c(androidx.compose.ui.semantics.t.N));
                                    objG7 = o0Var3.g(androidx.compose.ui.semantics.t.O);
                                    if (objG7 == null) {
                                        objG7 = th;
                                    }
                                    num = (Integer) objG7;
                                    if (num != null) {
                                        iIntValue2 = num.intValue();
                                    } else {
                                        iIntValue2 = -1;
                                    }
                                    r9.setMaxTextLength(iIntValue2);
                                    r9.setEnabled(i0.b(pVar2));
                                    wVar2 = androidx.compose.ui.semantics.t.k;
                                    r9.setFocusable(o0Var3.c(wVar2));
                                    if (accessibilityNodeInfo2.isFocusable()) {
                                        r9.setFocused(((Boolean) lVar3.d(wVar2)).booleanValue());
                                        if (accessibilityNodeInfo2.isFocused()) {
                                            r1.a(2);
                                            a0 a0Var4 = a0Var2;
                                            a0Var4.J = i6;
                                            a0Var = a0Var4;
                                        } else {
                                            r7 = a0Var2;
                                            z2 = true;
                                            r1.a(1);
                                        }
                                        r9.setVisibleToUser(androidx.compose.ui.semantics.s.e(pVar2) ^ z2);
                                        objG8 = o0Var3.g(androidx.compose.ui.semantics.t.j);
                                        if (objG8 == null) {
                                            objG8 = th;
                                        }
                                        if (objG8 == null) {
                                            r9.setClickable(false);
                                            aVar2 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.b);
                                            c = 3;
                                            if (aVar2 != null) {
                                                boolean zA6 = kotlin.jvm.internal.l.a(androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.t.I), Boolean.TRUE);
                                                if (hVar3 == null) {
                                                    z14 = false;
                                                } else {
                                                    z14 = true;
                                                }
                                                if (z14) {
                                                    z15 = true;
                                                } else {
                                                    if (hVar3 == null) {
                                                        z17 = false;
                                                    } else {
                                                        z17 = true;
                                                    }
                                                    if (z17) {
                                                        z15 = true;
                                                    } else {
                                                        z15 = false;
                                                    }
                                                }
                                                if (z15) {
                                                    z16 = true;
                                                } else {
                                                    z16 = true;
                                                }
                                                r9.setClickable(z16);
                                                if (i0.b(pVar2)) {
                                                    r1.b(new androidx.core.view.accessibility.b(16, aVar2.a));
                                                }
                                            }
                                            r9.setLongClickable(false);
                                            aVar3 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.c);
                                            if (aVar3 != null) {
                                                r9.setLongClickable(true);
                                                if (i0.b(pVar2)) {
                                                    r1.b(new androidx.core.view.accessibility.b(32, aVar3.a));
                                                }
                                            }
                                            aVar4 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.q);
                                            if (aVar4 != null) {
                                                r1.b(new androidx.core.view.accessibility.b(16384, aVar4.a));
                                            }
                                            if (i0.b(pVar2)) {
                                                aVar10 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.k);
                                                if (aVar10 != null) {
                                                    r1.b(new androidx.core.view.accessibility.b(2097152, aVar10.a));
                                                }
                                                aVar11 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.p);
                                                if (aVar11 != null) {
                                                    r1.b(new androidx.core.view.accessibility.b(android.R.id.accessibilityActionImeEnter, aVar11.a));
                                                }
                                                aVar12 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.r);
                                                if (aVar12 != null) {
                                                    r1.b(new androidx.core.view.accessibility.b(Parser.ARGC_LIMIT, aVar12.a));
                                                }
                                                aVar13 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.s);
                                                if (aVar13 != null) {
                                                    primaryClipDescription = uVar2.getClipboardManager().a.getPrimaryClipDescription();
                                                    if (primaryClipDescription != null) {
                                                        zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                                    } else {
                                                        zHasMimeType = false;
                                                    }
                                                    if (zHasMimeType) {
                                                        r1.b(new androidx.core.view.accessibility.b(32768, aVar13.a));
                                                    }
                                                }
                                            }
                                            strT = a0.t(pVar2);
                                            if (strT != null) {
                                                z3 = true;
                                            } else {
                                                z3 = true;
                                            }
                                            if (!z3) {
                                                accessibilityNodeInfo2.setTextSelection(r7.r(pVar2), r7.q(pVar2));
                                                aVar9 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.j);
                                                if (aVar9 != null) {
                                                    r8 = aVar9.a;
                                                } else {
                                                    r8 = th;
                                                }
                                                r1.b(new androidx.core.view.accessibility.b(131072, (String) r8));
                                                r1.a(LibretroCore.SCREEN_WIDTH);
                                                r1.a(512);
                                                r9.setMovementGranularities(11);
                                                list3 = (List) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.t.a);
                                                if (list3 != null) {
                                                    z11 = true;
                                                } else {
                                                    z11 = true;
                                                }
                                                if (z11) {
                                                    if (o0Var3.c(androidx.compose.ui.semantics.t.F)) {
                                                        V = f0Var3.v();
                                                        while (true) {
                                                            if (V == 0) {
                                                                V = th;
                                                            } else {
                                                                lVarX2 = V.x();
                                                                if (lVarX2 != null) {
                                                                    z12 = false;
                                                                } else {
                                                                    z12 = false;
                                                                }
                                                                if (!z12) {
                                                                    V = V.v();
                                                                }
                                                            }
                                                        }
                                                        if (V != 0) {
                                                            lVarX = V.x();
                                                            if (lVarX != null) {
                                                                objG13 = lVarX.e.g(wVar2);
                                                                if (objG13 == null) {
                                                                    objG13 = th;
                                                                }
                                                                zA = kotlin.jvm.internal.l.a(objG13, Boolean.TRUE);
                                                            } else {
                                                                zA = false;
                                                            }
                                                            if (zA) {
                                                            }
                                                        }
                                                    } else {
                                                        V = f0Var3.v();
                                                        while (true) {
                                                            if (V == 0) {
                                                                V = th;
                                                            } else {
                                                                lVarX2 = V.x();
                                                                if (lVarX2 != null) {
                                                                    z12 = false;
                                                                } else {
                                                                    z12 = false;
                                                                }
                                                                if (!z12) {
                                                                    V = V.v();
                                                                }
                                                            }
                                                        }
                                                        if (V != 0) {
                                                            lVarX = V.x();
                                                            if (lVarX != null) {
                                                                objG13 = lVarX.e.g(wVar2);
                                                                if (objG13 == null) {
                                                                    objG13 = th;
                                                                }
                                                                zA = kotlin.jvm.internal.l.a(objG13, Boolean.TRUE);
                                                            } else {
                                                                zA = false;
                                                            }
                                                            if (zA) {
                                                            }
                                                        }
                                                    }
                                                    if (!z13) {
                                                        r9.setMovementGranularities(accessibilityNodeInfo2.getMovementGranularities() | 20);
                                                    }
                                                }
                                            }
                                            if (Build.VERSION.SDK_INT >= 26) {
                                                arrayList3 = new ArrayList();
                                                arrayList3.add("androidx.compose.ui.semantics.id");
                                                charSequenceG = r1.g();
                                                if (charSequenceG != null) {
                                                    z10 = true;
                                                } else {
                                                    z10 = true;
                                                }
                                                if (!z10) {
                                                    arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                                }
                                                if (o0Var3.c(androidx.compose.ui.semantics.t.z)) {
                                                    arrayList3.add("androidx.compose.ui.semantics.testTag");
                                                }
                                                if (o0Var3.c(androidx.compose.ui.semantics.t.P)) {
                                                    arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                                    arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                                    arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                                    arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                                                }
                                                r1.i(arrayList3);
                                            }
                                            gVar = (androidx.compose.ui.semantics.g) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.t.c);
                                            f = 0.0f;
                                            if (gVar != null) {
                                                f3 = gVar.a;
                                                f4 = gVar.b.a;
                                                wVar4 = androidx.compose.ui.semantics.k.i;
                                                if (o0Var3.c(wVar4)) {
                                                    r1.k("android.widget.SeekBar");
                                                } else {
                                                    r1.k("android.widget.ProgressBar");
                                                }
                                                if (gVar != androidx.compose.ui.semantics.g.c) {
                                                    accessibilityNodeInfo2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, f4, f3));
                                                }
                                                if (o0Var3.c(wVar4)) {
                                                    if (f4 < 0.0f) {
                                                        f5 = 0.0f;
                                                    } else {
                                                        f5 = f4;
                                                    }
                                                    if (f3 < f5) {
                                                        r1.b(androidx.core.view.accessibility.b.h);
                                                    }
                                                    if (0.0f <= f4) {
                                                        f4 = 0.0f;
                                                    }
                                                    if (f3 > f4) {
                                                        r1.b(androidx.core.view.accessibility.b.i);
                                                    }
                                                }
                                            }
                                            if (i0.b(pVar2)) {
                                                r1.b(new androidx.core.view.accessibility.b(android.R.id.accessibilityActionSetProgress, aVar8.a));
                                            }
                                            objG9 = pVar2.k().e.g(androidx.compose.ui.semantics.t.f);
                                            if (objG9 == null) {
                                                objG9 = null;
                                            }
                                            cVar = (androidx.compose.ui.semantics.c) objG9;
                                            accessibilityNodeInfo3 = r1.a;
                                            if (cVar != null) {
                                                accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(cVar.a, cVar.b, false, 0));
                                                f2 = 0.0f;
                                            } else {
                                                arrayList = new ArrayList();
                                                objG10 = pVar2.k().e.g(androidx.compose.ui.semantics.t.e);
                                                if ((objG10 != null ? objG10 : null) != null) {
                                                    listJ2 = androidx.compose.ui.semantics.p.j(4, pVar2);
                                                    size3 = listJ2.size();
                                                    i7 = 0;
                                                    while (i7 < size3) {
                                                        float f8 = f;
                                                        pVar3 = (androidx.compose.ui.semantics.p) listJ2.get(i7);
                                                        char c4 = c;
                                                        if (pVar3.k().e.c(androidx.compose.ui.semantics.t.I)) {
                                                            arrayList.add(pVar3);
                                                        }
                                                        i7++;
                                                        c = c4;
                                                        f = f8;
                                                    }
                                                }
                                                f2 = f;
                                                if (!arrayList.isEmpty()) {
                                                    zK = _COROUTINE.a.k(arrayList);
                                                    if (zK) {
                                                        size2 = 1;
                                                    } else {
                                                        size2 = arrayList.size();
                                                    }
                                                    accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(size2, zK ? arrayList.size() : 1, false, 0));
                                                }
                                            }
                                            _COROUTINE.a.I(pVar2, r1);
                                            iVar = (androidx.compose.ui.semantics.i) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.t.u);
                                            androidx.compose.ui.semantics.a aVar16 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.d);
                                            if (iVar != null) {
                                                objG11 = pVar2.k().e.g(androidx.compose.ui.semantics.t.f);
                                                if (objG11 == null) {
                                                    objG11 = th;
                                                }
                                                if (objG11 == null) {
                                                    objG12 = pVar2.k().e.g(androidx.compose.ui.semantics.t.e);
                                                    if (objG12 == null) {
                                                        objG12 = th;
                                                    }
                                                    if (objG12 != null) {
                                                        z6 = true;
                                                    } else {
                                                        z6 = false;
                                                    }
                                                } else {
                                                    z6 = true;
                                                }
                                                if (!z6) {
                                                    r1.k("android.widget.HorizontalScrollView");
                                                }
                                                if (((Number) iVar.b.invoke()).floatValue() > f2) {
                                                    r1.p(true);
                                                }
                                                if (i0.b(pVar2)) {
                                                    z7 = a0.z(iVar);
                                                    mVar = androidx.compose.ui.unit.m.y;
                                                    if (z7) {
                                                        r1.b(androidx.core.view.accessibility.b.h);
                                                        f0Var2 = f0Var3;
                                                        if (f0Var2.X == mVar) {
                                                            z9 = true;
                                                        } else {
                                                            z9 = false;
                                                        }
                                                        if (z9) {
                                                            bVar2 = androidx.core.view.accessibility.b.n;
                                                        } else {
                                                            bVar2 = androidx.core.view.accessibility.b.p;
                                                        }
                                                        r1.b(bVar2);
                                                    } else {
                                                        f0Var2 = f0Var3;
                                                    }
                                                    if (a0.y(iVar)) {
                                                        r1.b(androidx.core.view.accessibility.b.i);
                                                        if (f0Var2.X == mVar) {
                                                            z8 = true;
                                                        } else {
                                                            z8 = false;
                                                        }
                                                        if (z8) {
                                                            bVar = androidx.core.view.accessibility.b.p;
                                                        } else {
                                                            bVar = androidx.core.view.accessibility.b.n;
                                                        }
                                                        r1.b(bVar);
                                                    }
                                                }
                                            }
                                            iVar2 = (androidx.compose.ui.semantics.i) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.t.v);
                                            if (iVar2 != null) {
                                                z4 = true;
                                            } else {
                                                z4 = true;
                                            }
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                i0.d(pVar2, r1);
                                            }
                                            r1.n((CharSequence) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.t.d));
                                            if (i0.b(pVar2)) {
                                                aVar5 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.t);
                                                if (aVar5 != null) {
                                                    r1.b(new androidx.core.view.accessibility.b(262144, aVar5.a));
                                                }
                                                aVar6 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.u);
                                                if (aVar6 != null) {
                                                    r1.b(new androidx.core.view.accessibility.b(524288, aVar6.a));
                                                }
                                                aVar7 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.v);
                                                if (aVar7 != null) {
                                                    r1.b(new androidx.core.view.accessibility.b(1048576, aVar7.a));
                                                }
                                                wVar3 = androidx.compose.ui.semantics.k.x;
                                                if (o0Var3.c(wVar3)) {
                                                    list2 = (List) lVar3.d(wVar3);
                                                    size4 = list2.size();
                                                    yVar = a0.l0;
                                                    if (size4 < yVar.b) {
                                                        androidx.collection.z0 z0Var6 = new androidx.collection.z0(0);
                                                        androidx.collection.f0 f0VarA3 = androidx.collection.t0.a();
                                                        z0Var3 = z0Var2;
                                                        if (z0Var3.e) {
                                                            androidx.collection.t.a(z0Var3);
                                                        }
                                                        if (androidx.collection.internal.a.a(z0Var3.y, z0Var3.A, i6) < 0) {
                                                            z4 = false;
                                                        }
                                                        if (z4) {
                                                            f0Var = (androidx.collection.f0) z0Var3.c(i6);
                                                            iArr = yVar.a;
                                                            i8 = yVar.b;
                                                            iArrCopyOf = new int[16];
                                                            i9 = 0;
                                                            i10 = 0;
                                                            while (i9 < i8) {
                                                                int i317 = iArr[i9];
                                                                int i318 = i8;
                                                                i11 = i10 + 1;
                                                                int i319 = i9;
                                                                if (iArrCopyOf.length < i11) {
                                                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i11, (iArrCopyOf.length * 3) / 2));
                                                                }
                                                                iArrCopyOf[i10] = i317;
                                                                i9 = i319 + 1;
                                                                i10 = i11;
                                                                i8 = i318;
                                                            }
                                                            arrayList2 = new ArrayList();
                                                            if (list2.size() <= 0) {
                                                                androidx.privacysandbox.ads.adservices.java.internal.a.C(list2.get(0));
                                                                f0Var.getClass();
                                                                throw th;
                                                            }
                                                            if (arrayList2.size() > 0) {
                                                                androidx.privacysandbox.ads.adservices.java.internal.a.C(arrayList2.get(0));
                                                                if (i10 <= 0) {
                                                                    int i3110 = iArrCopyOf[0];
                                                                    throw th;
                                                                }
                                                                com.google.gson.b.n("Index must be between 0 and size");
                                                            }
                                                        } else if (list2.size() > 0) {
                                                            androidx.privacysandbox.ads.adservices.java.internal.a.C(list2.get(0));
                                                            yVar.c(0);
                                                            throw th;
                                                        }
                                                        r7.P.e(i6, z0Var6);
                                                        z0Var3.e(i6, f0VarA3);
                                                    } else {
                                                        net.luminis.tls.engine.impl.c.r(androidx.privacysandbox.ads.adservices.java.internal.a.m(yVar.b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                                    }
                                                }
                                            }
                                            r1.o(i0.c(pVar2, resources));
                                            iD = r7.Z.d(i6);
                                            if (iD != -1) {
                                                hVarP2 = i0.p(uVar2.getAndroidViewsHandler$ui(), iD);
                                                if (hVarP2 != null) {
                                                    r9.setTraversalBefore(hVarP2);
                                                    uVar = uVar2;
                                                } else {
                                                    uVar = uVar2;
                                                    r9.setTraversalBefore(uVar, iD);
                                                }
                                                ?? r13 = th;
                                                r7.j(i6, r1, r7.b0, r13);
                                                r5 = r13;
                                            } else {
                                                r5 = th;
                                                uVar = uVar2;
                                            }
                                            iD2 = r7.a0.d(i6);
                                            if (iD2 != -1) {
                                                r9.setTraversalAfter(hVarP);
                                                r7.j(i6, r1, r7.c0, r5);
                                            }
                                            str2 = (String) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.u.b);
                                            if (str2 != null) {
                                                r1.k(str2);
                                            }
                                            r6 = r1;
                                            r10 = r7;
                                        } else {
                                            androidx.transition.k.i();
                                        }
                                        return null;
                                    }
                                    a0Var = a0Var2;
                                    z2 = true;
                                    r7 = a0Var;
                                    r9.setVisibleToUser(androidx.compose.ui.semantics.s.e(pVar2) ^ z2);
                                    objG8 = o0Var3.g(androidx.compose.ui.semantics.t.j);
                                    if (objG8 == null) {
                                        objG8 = th;
                                    }
                                    if (objG8 == null) {
                                        r9.setClickable(false);
                                        aVar2 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.b);
                                        c = 3;
                                        if (aVar2 != null) {
                                            boolean zA7 = kotlin.jvm.internal.l.a(androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.t.I), Boolean.TRUE);
                                            if (hVar3 == null) {
                                                z14 = false;
                                            } else {
                                                z14 = true;
                                            }
                                            if (z14) {
                                                z15 = true;
                                            } else {
                                                if (hVar3 == null) {
                                                    z17 = false;
                                                } else {
                                                    z17 = true;
                                                }
                                                if (z17) {
                                                    z15 = true;
                                                } else {
                                                    z15 = false;
                                                }
                                            }
                                            if (z15) {
                                                z16 = true;
                                            } else {
                                                z16 = true;
                                            }
                                            r9.setClickable(z16);
                                            if (i0.b(pVar2)) {
                                                r1.b(new androidx.core.view.accessibility.b(16, aVar2.a));
                                            }
                                        }
                                        r9.setLongClickable(false);
                                        aVar3 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.c);
                                        if (aVar3 != null) {
                                            r9.setLongClickable(true);
                                            if (i0.b(pVar2)) {
                                                r1.b(new androidx.core.view.accessibility.b(32, aVar3.a));
                                            }
                                        }
                                        aVar4 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.q);
                                        if (aVar4 != null) {
                                            r1.b(new androidx.core.view.accessibility.b(16384, aVar4.a));
                                        }
                                        if (i0.b(pVar2)) {
                                            aVar10 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.k);
                                            if (aVar10 != null) {
                                                r1.b(new androidx.core.view.accessibility.b(2097152, aVar10.a));
                                            }
                                            aVar11 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.p);
                                            if (aVar11 != null) {
                                                r1.b(new androidx.core.view.accessibility.b(android.R.id.accessibilityActionImeEnter, aVar11.a));
                                            }
                                            aVar12 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.r);
                                            if (aVar12 != null) {
                                                r1.b(new androidx.core.view.accessibility.b(Parser.ARGC_LIMIT, aVar12.a));
                                            }
                                            aVar13 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.s);
                                            if (aVar13 != null) {
                                                primaryClipDescription = uVar2.getClipboardManager().a.getPrimaryClipDescription();
                                                if (primaryClipDescription != null) {
                                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                                } else {
                                                    zHasMimeType = false;
                                                }
                                                if (zHasMimeType) {
                                                    r1.b(new androidx.core.view.accessibility.b(32768, aVar13.a));
                                                }
                                            }
                                        }
                                        strT = a0.t(pVar2);
                                        if (strT != null) {
                                            z3 = true;
                                        } else {
                                            z3 = true;
                                        }
                                        if (!z3) {
                                            accessibilityNodeInfo2.setTextSelection(r7.r(pVar2), r7.q(pVar2));
                                            aVar9 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.j);
                                            if (aVar9 != null) {
                                                r8 = aVar9.a;
                                            } else {
                                                r8 = th;
                                            }
                                            r1.b(new androidx.core.view.accessibility.b(131072, (String) r8));
                                            r1.a(LibretroCore.SCREEN_WIDTH);
                                            r1.a(512);
                                            r9.setMovementGranularities(11);
                                            list3 = (List) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.t.a);
                                            if (list3 != null) {
                                                z11 = true;
                                            } else {
                                                z11 = true;
                                            }
                                            if (z11) {
                                                if (o0Var3.c(androidx.compose.ui.semantics.t.F)) {
                                                    V = f0Var3.v();
                                                    while (true) {
                                                        if (V == 0) {
                                                            V = th;
                                                        } else {
                                                            lVarX2 = V.x();
                                                            if (lVarX2 != null) {
                                                                z12 = false;
                                                            } else {
                                                                z12 = false;
                                                            }
                                                            if (!z12) {
                                                                V = V.v();
                                                            }
                                                        }
                                                    }
                                                    if (V != 0) {
                                                        lVarX = V.x();
                                                        if (lVarX != null) {
                                                            objG13 = lVarX.e.g(wVar2);
                                                            if (objG13 == null) {
                                                                objG13 = th;
                                                            }
                                                            zA = kotlin.jvm.internal.l.a(objG13, Boolean.TRUE);
                                                        } else {
                                                            zA = false;
                                                        }
                                                        if (zA) {
                                                        }
                                                    }
                                                } else {
                                                    V = f0Var3.v();
                                                    while (true) {
                                                        if (V == 0) {
                                                            V = th;
                                                        } else {
                                                            lVarX2 = V.x();
                                                            if (lVarX2 != null) {
                                                                z12 = false;
                                                            } else {
                                                                z12 = false;
                                                            }
                                                            if (!z12) {
                                                                V = V.v();
                                                            }
                                                        }
                                                    }
                                                    if (V != 0) {
                                                        lVarX = V.x();
                                                        if (lVarX != null) {
                                                            objG13 = lVarX.e.g(wVar2);
                                                            if (objG13 == null) {
                                                                objG13 = th;
                                                            }
                                                            zA = kotlin.jvm.internal.l.a(objG13, Boolean.TRUE);
                                                        } else {
                                                            zA = false;
                                                        }
                                                        if (zA) {
                                                        }
                                                    }
                                                }
                                                if (!z13) {
                                                    r9.setMovementGranularities(accessibilityNodeInfo2.getMovementGranularities() | 20);
                                                }
                                            }
                                        }
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            arrayList3 = new ArrayList();
                                            arrayList3.add("androidx.compose.ui.semantics.id");
                                            charSequenceG = r1.g();
                                            if (charSequenceG != null) {
                                                z10 = true;
                                            } else {
                                                z10 = true;
                                            }
                                            if (!z10) {
                                                arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                            }
                                            if (o0Var3.c(androidx.compose.ui.semantics.t.z)) {
                                                arrayList3.add("androidx.compose.ui.semantics.testTag");
                                            }
                                            if (o0Var3.c(androidx.compose.ui.semantics.t.P)) {
                                                arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                                arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                                            }
                                            r1.i(arrayList3);
                                        }
                                        gVar = (androidx.compose.ui.semantics.g) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.t.c);
                                        f = 0.0f;
                                        if (gVar != null) {
                                            f3 = gVar.a;
                                            f4 = gVar.b.a;
                                            wVar4 = androidx.compose.ui.semantics.k.i;
                                            if (o0Var3.c(wVar4)) {
                                                r1.k("android.widget.SeekBar");
                                            } else {
                                                r1.k("android.widget.ProgressBar");
                                            }
                                            if (gVar != androidx.compose.ui.semantics.g.c) {
                                                accessibilityNodeInfo2.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, f4, f3));
                                            }
                                            if (o0Var3.c(wVar4)) {
                                                if (f4 < 0.0f) {
                                                    f5 = 0.0f;
                                                } else {
                                                    f5 = f4;
                                                }
                                                if (f3 < f5) {
                                                    r1.b(androidx.core.view.accessibility.b.h);
                                                }
                                                if (0.0f <= f4) {
                                                    f4 = 0.0f;
                                                }
                                                if (f3 > f4) {
                                                    r1.b(androidx.core.view.accessibility.b.i);
                                                }
                                            }
                                        }
                                        if (i0.b(pVar2)) {
                                            r1.b(new androidx.core.view.accessibility.b(android.R.id.accessibilityActionSetProgress, aVar8.a));
                                        }
                                        objG9 = pVar2.k().e.g(androidx.compose.ui.semantics.t.f);
                                        if (objG9 == null) {
                                            objG9 = null;
                                        }
                                        cVar = (androidx.compose.ui.semantics.c) objG9;
                                        accessibilityNodeInfo3 = r1.a;
                                        if (cVar != null) {
                                            accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(cVar.a, cVar.b, false, 0));
                                            f2 = 0.0f;
                                        } else {
                                            arrayList = new ArrayList();
                                            objG10 = pVar2.k().e.g(androidx.compose.ui.semantics.t.e);
                                            if ((objG10 != null ? objG10 : null) != null) {
                                                listJ2 = androidx.compose.ui.semantics.p.j(4, pVar2);
                                                size3 = listJ2.size();
                                                i7 = 0;
                                                while (i7 < size3) {
                                                    float f9 = f;
                                                    pVar3 = (androidx.compose.ui.semantics.p) listJ2.get(i7);
                                                    char c5 = c;
                                                    if (pVar3.k().e.c(androidx.compose.ui.semantics.t.I)) {
                                                        arrayList.add(pVar3);
                                                    }
                                                    i7++;
                                                    c = c5;
                                                    f = f9;
                                                }
                                            }
                                            f2 = f;
                                            if (!arrayList.isEmpty()) {
                                                zK = _COROUTINE.a.k(arrayList);
                                                if (zK) {
                                                    size2 = 1;
                                                } else {
                                                    size2 = arrayList.size();
                                                }
                                                accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(size2, zK ? arrayList.size() : 1, false, 0));
                                            }
                                        }
                                        _COROUTINE.a.I(pVar2, r1);
                                        iVar = (androidx.compose.ui.semantics.i) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.t.u);
                                        androidx.compose.ui.semantics.a aVar17 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.d);
                                        if (iVar != null) {
                                            objG11 = pVar2.k().e.g(androidx.compose.ui.semantics.t.f);
                                            if (objG11 == null) {
                                                objG11 = th;
                                            }
                                            if (objG11 == null) {
                                                objG12 = pVar2.k().e.g(androidx.compose.ui.semantics.t.e);
                                                if (objG12 == null) {
                                                    objG12 = th;
                                                }
                                                if (objG12 != null) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                            } else {
                                                z6 = true;
                                            }
                                            if (!z6) {
                                                r1.k("android.widget.HorizontalScrollView");
                                            }
                                            if (((Number) iVar.b.invoke()).floatValue() > f2) {
                                                r1.p(true);
                                            }
                                            if (i0.b(pVar2)) {
                                                z7 = a0.z(iVar);
                                                mVar = androidx.compose.ui.unit.m.y;
                                                if (z7) {
                                                    r1.b(androidx.core.view.accessibility.b.h);
                                                    f0Var2 = f0Var3;
                                                    if (f0Var2.X == mVar) {
                                                        z9 = true;
                                                    } else {
                                                        z9 = false;
                                                    }
                                                    if (z9) {
                                                        bVar2 = androidx.core.view.accessibility.b.p;
                                                    } else {
                                                        bVar2 = androidx.core.view.accessibility.b.n;
                                                    }
                                                    r1.b(bVar2);
                                                } else {
                                                    f0Var2 = f0Var3;
                                                }
                                                if (a0.y(iVar)) {
                                                    r1.b(androidx.core.view.accessibility.b.i);
                                                    if (f0Var2.X == mVar) {
                                                        z8 = true;
                                                    } else {
                                                        z8 = false;
                                                    }
                                                    if (z8) {
                                                        bVar = androidx.core.view.accessibility.b.n;
                                                    } else {
                                                        bVar = androidx.core.view.accessibility.b.p;
                                                    }
                                                    r1.b(bVar);
                                                }
                                            }
                                        }
                                        iVar2 = (androidx.compose.ui.semantics.i) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.t.v);
                                        if (iVar2 != null) {
                                            z4 = true;
                                        } else {
                                            z4 = true;
                                        }
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            i0.d(pVar2, r1);
                                        }
                                        r1.n((CharSequence) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.t.d));
                                        if (i0.b(pVar2)) {
                                            aVar5 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.t);
                                            if (aVar5 != null) {
                                                r1.b(new androidx.core.view.accessibility.b(262144, aVar5.a));
                                            }
                                            aVar6 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.u);
                                            if (aVar6 != null) {
                                                r1.b(new androidx.core.view.accessibility.b(524288, aVar6.a));
                                            }
                                            aVar7 = (androidx.compose.ui.semantics.a) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.k.v);
                                            if (aVar7 != null) {
                                                r1.b(new androidx.core.view.accessibility.b(1048576, aVar7.a));
                                            }
                                            wVar3 = androidx.compose.ui.semantics.k.x;
                                            if (o0Var3.c(wVar3)) {
                                                list2 = (List) lVar3.d(wVar3);
                                                size4 = list2.size();
                                                yVar = a0.l0;
                                                if (size4 < yVar.b) {
                                                    androidx.collection.z0 z0Var7 = new androidx.collection.z0(0);
                                                    androidx.collection.f0 f0VarA4 = androidx.collection.t0.a();
                                                    z0Var3 = z0Var2;
                                                    if (z0Var3.e) {
                                                        androidx.collection.t.a(z0Var3);
                                                    }
                                                    if (androidx.collection.internal.a.a(z0Var3.y, z0Var3.A, i6) < 0) {
                                                        z4 = false;
                                                    }
                                                    if (z4) {
                                                        f0Var = (androidx.collection.f0) z0Var3.c(i6);
                                                        iArr = yVar.a;
                                                        i8 = yVar.b;
                                                        iArrCopyOf = new int[16];
                                                        i9 = 0;
                                                        i10 = 0;
                                                        while (i9 < i8) {
                                                            int i3111 = iArr[i9];
                                                            int i3112 = i8;
                                                            i11 = i10 + 1;
                                                            int i3113 = i9;
                                                            if (iArrCopyOf.length < i11) {
                                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i11, (iArrCopyOf.length * 3) / 2));
                                                            }
                                                            iArrCopyOf[i10] = i3111;
                                                            i9 = i3113 + 1;
                                                            i10 = i11;
                                                            i8 = i3112;
                                                        }
                                                        arrayList2 = new ArrayList();
                                                        if (list2.size() <= 0) {
                                                            androidx.privacysandbox.ads.adservices.java.internal.a.C(list2.get(0));
                                                            f0Var.getClass();
                                                            throw th;
                                                        }
                                                        if (arrayList2.size() > 0) {
                                                            androidx.privacysandbox.ads.adservices.java.internal.a.C(arrayList2.get(0));
                                                            if (i10 <= 0) {
                                                                int i3114 = iArrCopyOf[0];
                                                                throw th;
                                                            }
                                                            com.google.gson.b.n("Index must be between 0 and size");
                                                        }
                                                    } else if (list2.size() > 0) {
                                                        androidx.privacysandbox.ads.adservices.java.internal.a.C(list2.get(0));
                                                        yVar.c(0);
                                                        throw th;
                                                    }
                                                    r7.P.e(i6, z0Var7);
                                                    z0Var3.e(i6, f0VarA4);
                                                } else {
                                                    net.luminis.tls.engine.impl.c.r(androidx.privacysandbox.ads.adservices.java.internal.a.m(yVar.b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                                }
                                            }
                                        }
                                        r1.o(i0.c(pVar2, resources));
                                        iD = r7.Z.d(i6);
                                        if (iD != -1) {
                                            hVarP2 = i0.p(uVar2.getAndroidViewsHandler$ui(), iD);
                                            if (hVarP2 != null) {
                                                r9.setTraversalBefore(hVarP2);
                                                uVar = uVar2;
                                            } else {
                                                uVar = uVar2;
                                                r9.setTraversalBefore(uVar, iD);
                                            }
                                            ?? r14 = th;
                                            r7.j(i6, r1, r7.b0, r14);
                                            r5 = r14;
                                        } else {
                                            r5 = th;
                                            uVar = uVar2;
                                        }
                                        iD2 = r7.a0.d(i6);
                                        if (iD2 != -1) {
                                            r9.setTraversalAfter(hVarP);
                                            r7.j(i6, r1, r7.c0, r5);
                                        }
                                        str2 = (String) androidx.compose.ui.semantics.s.d(lVar3, androidx.compose.ui.semantics.u.b);
                                        if (str2 != null) {
                                            r1.k(str2);
                                        }
                                        r6 = r1;
                                        r10 = r7;
                                    } else {
                                        androidx.transition.k.i();
                                    }
                                    return null;
                                }
                                int i42 = size;
                                pVar5 = (androidx.compose.ui.semantics.p) listJ.get(i4);
                                List list6 = listJ;
                                nVarS = a0Var2.s();
                                int i43 = i4;
                                i28 = pVar5.g;
                                if (nVarS.a(i28)) {
                                    hVar4 = uVar2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(pVar5.c);
                                    if (i28 != -1) {
                                        if (hVar4 != null) {
                                            accessibilityNodeInfoObtain.addChild(hVar4);
                                        } else {
                                            qVar = (androidx.compose.ui.semantics.q) a0Var2.s().b(i28);
                                            if (qVar != null) {
                                                zA2 = false;
                                            } else {
                                                zA2 = false;
                                            }
                                            if (z) {
                                                r9.addChild(uVar2, i28);
                                            } else {
                                                r9.addChild(uVar2, i28);
                                            }
                                        }
                                        xVar.f(i28, i3);
                                        i3++;
                                    }
                                }
                                i4 = i43 + 1;
                                listJ = list6;
                                size = i42;
                            }
                        } else {
                            i6 = i;
                            r10 = a0Var2;
                            r6 = 0;
                        }
                    }
                }
                if (r10.M) {
                    if (i6 == r10.I) {
                        r10.K = r6;
                    }
                    if (i6 == r10.J) {
                        r10.L = r6;
                    }
                }
                return r6;
            default:
                return new androidx.core.view.accessibility.d(AccessibilityNodeInfo.obtain(((androidx.customview.widget.a) this.A).n(i).a));
        }
    }

    @Override // com.app.mlounge.data.music.e
    public final androidx.core.view.accessibility.d q(int i) {
        switch (this.z) {
            case 0:
                a0 a0Var = (a0) this.A;
                if (i == 1) {
                    int i2 = a0Var.J;
                    if (i2 != Integer.MIN_VALUE) {
                        return j(i2);
                    }
                } else {
                    if (i == 2) {
                        return j(a0Var.I);
                    }
                    net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Unknown focus type: "));
                }
                return null;
            default:
                androidx.customview.widget.a aVar = (androidx.customview.widget.a) this.A;
                int i3 = i == 2 ? aVar.H : aVar.I;
                if (i3 == Integer.MIN_VALUE) {
                    return null;
                }
                return j(i3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:181:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:277:0x044e  */
    /* JADX WARN: Code duplicated, block: B:279:0x0452  */
    /* JADX WARN: Code duplicated, block: B:280:0x0454  */
    /* JADX WARN: Code duplicated, block: B:283:0x0459  */
    /* JADX WARN: Code duplicated, block: B:284:0x045b  */
    /* JADX WARN: Code duplicated, block: B:287:0x0461  */
    /* JADX WARN: Code duplicated, block: B:288:0x0463  */
    /* JADX WARN: Code duplicated, block: B:291:0x0469  */
    /* JADX WARN: Code duplicated, block: B:292:0x046b  */
    /* JADX WARN: Code duplicated, block: B:295:0x0471  */
    /* JADX WARN: Code duplicated, block: B:296:0x0473  */
    /* JADX WARN: Code duplicated, block: B:299:0x0479  */
    /* JADX WARN: Code duplicated, block: B:300:0x047b  */
    /* JADX WARN: Code duplicated, block: B:307:0x0487  */
    /* JADX WARN: Code duplicated, block: B:314:0x0493  */
    /* JADX WARN: Code duplicated, block: B:317:0x0498  */
    /* JADX WARN: Code duplicated, block: B:319:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:322:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:325:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:327:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:329:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:330:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:333:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:336:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:339:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:340:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:342:0x0501  */
    /* JADX WARN: Code duplicated, block: B:345:0x0506  */
    /* JADX WARN: Code duplicated, block: B:350:0x0520  */
    /* JADX WARN: Code duplicated, block: B:353:0x0529  */
    /* JADX WARN: Code duplicated, block: B:357:0x0530  */
    /* JADX WARN: Code duplicated, block: B:359:0x053a  */
    /* JADX WARN: Code duplicated, block: B:362:0x053f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:403:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:406:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:409:0x05d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:411:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:412:0x05de  */
    /* JADX WARN: Code duplicated, block: B:414:0x05eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:415:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:418:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:420:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:426:0x0619  */
    /* JADX WARN: Code duplicated, block: B:428:0x061d  */
    /* JADX WARN: Code duplicated, block: B:430:0x0625  */
    /* JADX WARN: Code duplicated, block: B:431:0x0627  */
    /* JADX WARN: Code duplicated, block: B:433:0x062b  */
    /* JADX WARN: Code duplicated, block: B:435:0x0631  */
    /* JADX WARN: Code duplicated, block: B:436:0x0633  */
    /* JADX WARN: Code duplicated, block: B:439:0x0638  */
    /* JADX WARN: Code duplicated, block: B:502:0x072b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:503:0x072d  */
    /* JADX WARN: Code duplicated, block: B:505:0x073b  */
    /* JADX WARN: Code duplicated, block: B:506:0x073d  */
    /* JADX WARN: Code duplicated, block: B:509:0x0742  */
    /* JADX WARN: Code duplicated, block: B:510:0x0744  */
    /* JADX WARN: Code duplicated, block: B:516:0x0759  */
    /* JADX WARN: Code duplicated, block: B:521:0x0767  */
    /* JADX WARN: Code duplicated, block: B:534:0x077f  */
    /* JADX WARN: Code duplicated, block: B:539:0x0796  */
    /* JADX WARN: Code duplicated, block: B:546:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:548:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:551:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:553:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:565:0x0830  */
    /* JADX WARN: Code duplicated, block: B:567:0x0837 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:568:0x0839  */
    /* JADX WARN: Code duplicated, block: B:569:0x083b  */
    /* JADX WARN: Code duplicated, block: B:572:0x0842  */
    /* JADX WARN: Code duplicated, block: B:573:0x0847  */
    /* JADX WARN: Code duplicated, block: B:576:0x084f  */
    /* JADX WARN: Code duplicated, block: B:578:0x0859  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:590:0x087f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:591:0x0881  */
    /* JADX WARN: Code duplicated, block: B:592:0x0884  */
    /* JADX WARN: Code duplicated, block: B:595:0x0889  */
    /* JADX WARN: Code duplicated, block: B:596:0x088c  */
    /* JADX WARN: Code duplicated, block: B:599:0x08a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:601:0x08ae  */
    /* JADX WARN: Code duplicated, block: B:602:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:604:0x08b4  */
    /* JADX WARN: Code duplicated, block: B:605:0x08c4  */
    /* JADX WARN: Code duplicated, block: B:610:0x08d5  */
    /* JADX WARN: Code duplicated, block: B:613:0x08da  */
    /* JADX WARN: Code duplicated, block: B:615:0x08de  */
    /* JADX WARN: Code duplicated, block: B:616:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:618:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:620:0x08e8  */
    /* JADX WARN: Code duplicated, block: B:621:0x08ef  */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0370, code lost:
    
        if (((java.lang.Boolean) r1.invoke(java.lang.Float.valueOf(r3), java.lang.Float.valueOf(r16))).booleanValue() == true) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x023d, code lost:
    
        r2 = null;
     */
    @Override // com.app.mlounge.data.music.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(int r27, int r28, android.os.Bundle r29) {
        /*
            Method dump skipped, instruction units count: 2388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.v.v(int, int, android.os.Bundle):boolean");
    }
}
