package org.schabi.newpipe.extractor.services.youtube;

import com.app.mlounge.emulator.LibretroCore;
import java.io.Serializable;
import java.util.Locale;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Serializable {
    public static final a[] I;
    public final String A;
    public int B;
    public String C;
    public String D;
    public Locale E;
    public String F;
    public final int G;
    public int H;
    public final org.schabi.newpipe.extractor.i e;
    public final int y;
    public final int z;

    static {
        org.schabi.newpipe.extractor.i iVar = org.schabi.newpipe.extractor.i.v3GPP;
        a aVar = new a(17, 2, iVar, "144p");
        a aVar2 = new a(36, 2, iVar, "240p");
        org.schabi.newpipe.extractor.i iVar2 = org.schabi.newpipe.extractor.i.MPEG_4;
        a aVar3 = new a(18, 2, iVar2, "360p");
        a aVar4 = new a(34, 2, iVar2, "360p");
        a aVar5 = new a(35, 2, iVar2, "480p");
        a aVar6 = new a(59, 2, iVar2, "480p");
        a aVar7 = new a(78, 2, iVar2, "480p");
        a aVar8 = new a(22, 2, iVar2, "720p");
        a aVar9 = new a(37, 2, iVar2, "1080p");
        a aVar10 = new a(38, 2, iVar2, "1080p");
        org.schabi.newpipe.extractor.i iVar3 = org.schabi.newpipe.extractor.i.WEBM;
        a aVar11 = new a(43, 2, iVar3, "360p");
        a aVar12 = new a(44, 2, iVar3, "480p");
        a aVar13 = new a(45, 2, iVar3, "720p");
        a aVar14 = new a(46, 2, iVar3, "1080p");
        org.schabi.newpipe.extractor.i iVar4 = org.schabi.newpipe.extractor.i.WEBMA;
        a aVar15 = new a(Token.ARRAYCOMP, iVar4, 128);
        a aVar16 = new a(Token.LETEXPR, iVar4, LibretroCore.SCREEN_WIDTH);
        org.schabi.newpipe.extractor.i iVar5 = org.schabi.newpipe.extractor.i.M4A;
        a aVar17 = new a(599, iVar5, 32);
        a aVar18 = new a(Token.VOID, iVar5, 48);
        a aVar19 = new a(140, iVar5, 128);
        a aVar20 = new a(Token.EMPTY, iVar5, LibretroCore.SCREEN_WIDTH);
        org.schabi.newpipe.extractor.i iVar6 = org.schabi.newpipe.extractor.i.WEBMA_OPUS;
        I = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, new a(600, iVar6, 35), new a(249, iVar6, 50), new a(Context.VERSION_ECMASCRIPT, iVar6, 70), new a(251, iVar6, 160), new a(160, 3, iVar2, "144p"), new a(394, 3, iVar2, "144p"), new a(Token.BREAK, 3, iVar2, "240p"), new a(395, 3, iVar2, "240p"), new a(Token.CONTINUE, 3, iVar2, "360p"), new a(396, 3, iVar2, "360p"), new a(Token.VAR, 3, iVar2, "480p"), new a(212, 3, iVar2, "480p"), new a(397, 3, iVar2, "480p"), new a(Token.WITH, 3, iVar2, "720p"), new a(398, 3, iVar2, "720p"), new a(298, iVar2, "720p60"), new a(Token.CATCH, 3, iVar2, "1080p"), new a(399, 3, iVar2, "1080p"), new a(299, iVar2, "1080p60"), new a(400, 3, iVar2, "1440p"), new a(266, 3, iVar2, "2160p"), new a(401, 3, iVar2, "2160p"), new a(278, 3, iVar3, "144p"), new a(242, 3, iVar3, "240p"), new a(243, 3, iVar3, "360p"), new a(244, 3, iVar3, "480p"), new a(245, 3, iVar3, "480p"), new a(246, 3, iVar3, "480p"), new a(247, 3, iVar3, "720p"), new a(248, 3, iVar3, "1080p"), new a(271, 3, iVar3, "1440p"), new a(LibretroCore.PSP_SCREEN_HEIGHT, 3, iVar3, "2160p"), new a(302, iVar3, "720p60"), new a(303, iVar3, "1080p60"), new a(308, iVar3, "1440p60"), new a(313, 3, iVar3, "2160p"), new a(315, iVar3, "2160p60")};
    }

    public a(a aVar) {
        this.z = -1;
        this.e = aVar.e;
        this.y = aVar.y;
        this.G = aVar.G;
        this.z = aVar.z;
        this.A = aVar.A;
        this.B = aVar.B;
        this.C = aVar.C;
        this.D = aVar.D;
        this.H = aVar.H;
        this.E = aVar.E;
    }

    public a(int i, org.schabi.newpipe.extractor.i iVar, String str) {
        this.z = -1;
        this.y = i;
        this.G = 3;
        this.e = iVar;
        this.A = str;
    }

    public a(int i, org.schabi.newpipe.extractor.i iVar, int i2) {
        this.y = i;
        this.G = 1;
        this.e = iVar;
        this.z = i2;
    }

    public a(int i, int i2, org.schabi.newpipe.extractor.i iVar, String str) {
        this.z = -1;
        this.y = i;
        this.G = i2;
        this.e = iVar;
        this.A = str;
    }
}
