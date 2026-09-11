package androidx.media3.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.text.BidiFormatter;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.compose.ui.platform.t1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends View implements n0 {
    public float A;
    public e B;
    public float C;
    public final ArrayList e;
    public List y;
    public int z;

    public d(Context context, int i) {
        super(context, null);
        this.e = new ArrayList();
        this.y = Collections.EMPTY_LIST;
        this.z = 0;
        this.A = 0.0533f;
        this.B = e.g;
        this.C = 0.08f;
    }

    @Override // androidx.media3.ui.n0
    public final void a(List list, e eVar, float f, int i, float f2) {
        this.y = list;
        this.B = eVar;
        this.A = f;
        this.z = i;
        this.C = f2;
        while (true) {
            ArrayList arrayList = this.e;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new m0(getContext()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:258:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:260:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:262:0x05ff  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [androidx.compose.ui.platform.t1] */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.compose.ui.platform.t1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        Object[] objArr;
        int[] iArr;
        Spanned spanned;
        int[] iArr2;
        List listD;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        float f3;
        int i8;
        int iMax;
        int iMin;
        int iRound;
        int i9;
        d dVar = this;
        Canvas canvas2 = canvas;
        List list = dVar.y;
        if (list.isEmpty()) {
            return;
        }
        int height = dVar.getHeight();
        int paddingLeft = dVar.getPaddingLeft();
        int paddingTop = dVar.getPaddingTop();
        int width = dVar.getWidth() - dVar.getPaddingRight();
        int paddingBottom = height - dVar.getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i10 = paddingBottom - paddingTop;
        float fH = _COROUTINE.a.H(dVar.z, dVar.A, height, i10);
        float f4 = 0.0f;
        if (fH <= 0.0f) {
            return;
        }
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            androidx.media3.common.text.b bVarA = (androidx.media3.common.text.b) list.get(i11);
            float f5 = f4;
            if (bVarA.p != Integer.MIN_VALUE) {
                androidx.media3.common.text.a aVarA = bVarA.a();
                aVarA.h = -3.4028235E38f;
                aVarA.i = Integer.MIN_VALUE;
                aVarA.c = null;
                int i12 = bVarA.f;
                float f6 = bVarA.e;
                if (i12 == 0) {
                    aVarA.e = 1.0f - f6;
                    i9 = 0;
                    aVarA.f = 0;
                } else {
                    i9 = 0;
                    aVarA.e = (-f6) - 1.0f;
                    aVarA.f = 1;
                }
                int i13 = bVarA.g;
                if (i13 == 0) {
                    aVarA.g = 2;
                } else if (i13 == 2) {
                    aVarA.g = i9;
                }
                bVarA = aVarA.a();
            }
            float fH2 = _COROUTINE.a.H(bVarA.n, bVarA.o, height, i10);
            m0 m0Var = (m0) dVar.e.get(i11);
            e eVar = dVar.B;
            List list2 = list;
            float f7 = dVar.C;
            TextPaint textPaint = m0Var.f;
            int i14 = height;
            Bitmap bitmap = bVarA.d;
            int i15 = i10;
            float f8 = bVarA.k;
            int i16 = size;
            float f9 = bVarA.j;
            int i17 = i11;
            int i18 = bVarA.i;
            float f10 = bVarA.h;
            int i19 = bVarA.g;
            float f11 = fH;
            int i20 = bVarA.f;
            float f12 = bVarA.e;
            Layout.Alignment alignment = bVarA.b;
            ?? spannableStringBuilder = bVarA.a;
            boolean z = bitmap == null;
            if (z) {
                if (TextUtils.isEmpty(spannableStringBuilder)) {
                    i6 = paddingBottom;
                } else {
                    f = f10;
                    i = bVarA.l ? bVarA.m : eVar.c;
                }
                i11 = i17 + 1;
                dVar = this;
                paddingBottom = i6;
                f4 = f5;
                list = list2;
                height = i14;
                i10 = i15;
                size = i16;
                fH = f11;
            } else {
                f = f10;
                i = -16777216;
            }
            ?? r14 = m0Var.i;
            if ((r14 == spannableStringBuilder || (r14 != 0 && r14.equals(spannableStringBuilder))) && Objects.equals(m0Var.j, alignment) && m0Var.k == bitmap && m0Var.l == f12 && m0Var.m == i20) {
                i2 = i19;
                if (Integer.valueOf(m0Var.n).equals(Integer.valueOf(i2)) && m0Var.o == f && Integer.valueOf(m0Var.p).equals(Integer.valueOf(i18)) && m0Var.q == f9 && m0Var.r == f8 && m0Var.s == eVar.a && m0Var.t == eVar.b && m0Var.u == i && m0Var.w == eVar.d && m0Var.v == eVar.e && Objects.equals(textPaint.getTypeface(), eVar.f) && m0Var.x == f11 && m0Var.y == fH2 && m0Var.z == f7 && m0Var.A == paddingLeft && m0Var.B == paddingTop && m0Var.C == width && m0Var.D == paddingBottom) {
                    m0Var.a(canvas2, z);
                    i6 = paddingBottom;
                }
                i11 = i17 + 1;
                dVar = this;
                paddingBottom = i6;
                f4 = f5;
                list = list2;
                height = i14;
                i10 = i15;
                size = i16;
                fH = f11;
            } else {
                i2 = i19;
            }
            t1 t1Var = c.a;
            if (spannableStringBuilder == 0) {
                i4 = width;
                paddingBottom = paddingBottom;
                z = z;
            } else {
                int length = spannableStringBuilder.length();
                int iCharCount = 0;
                while (true) {
                    if (iCharCount < length) {
                        int iCodePointAt = Character.codePointAt((CharSequence) spannableStringBuilder, iCharCount);
                        int i21 = length;
                        byte directionality = Character.getDirectionality(iCodePointAt);
                        int i22 = iCharCount;
                        if (directionality == 1 || directionality == 2 || directionality == 16 || directionality == 17) {
                            BidiFormatter bidiFormatter = BidiFormatter.getInstance();
                            if (spannableStringBuilder instanceof Spanned) {
                                spanned = (Spanned) spannableStringBuilder;
                                Object[] spans = spanned.getSpans(0, spannableStringBuilder.length(), Object.class);
                                int[] iArr3 = new int[spans.length];
                                iArr = new int[spans.length];
                                Arrays.fill(iArr3, -1);
                                Arrays.fill(iArr, -1);
                                objArr = spans;
                                iArr2 = iArr3;
                            } else {
                                objArr = null;
                                iArr = null;
                                spanned = null;
                                iArr2 = null;
                            }
                            int[] iArr4 = iArr;
                            if (spannableStringBuilder.toString().contains("\r\n")) {
                                listD = c.b.d(spannableStringBuilder);
                                i3 = 2;
                            } else {
                                listD = c.a.d(spannableStringBuilder);
                                i3 = 1;
                            }
                            List<String> list3 = listD;
                            ArrayList arrayList = new ArrayList(list3.size());
                            int i23 = 0;
                            int i24 = 0;
                            for (String str : list3) {
                                int i25 = i3;
                                int i26 = width;
                                String strUnicodeWrap = bidiFormatter.unicodeWrap(str, TextDirectionHeuristics.LTR);
                                if (objArr != null) {
                                    spanned.getClass();
                                    iArr2.getClass();
                                    iArr4.getClass();
                                    int length2 = strUnicodeWrap.length() - str.length();
                                    if (length2 > 0) {
                                        i24++;
                                    }
                                    for (int i27 = 0; i27 < objArr.length; i27 = i5 + 1) {
                                        if (iArr2[i27] >= 0 || spanned.getSpanStart(objArr[i27]) < i23) {
                                            i5 = i27;
                                        } else {
                                            i5 = i27;
                                            if (spanned.getSpanStart(objArr[i27]) < str.length() + i23) {
                                                iArr2[i5] = i24;
                                            }
                                        }
                                        if (iArr4[i5] < 0 && spanned.getSpanEnd(objArr[i5]) - 1 >= i23 && spanned.getSpanEnd(objArr[i5]) - 1 < str.length() + i23) {
                                            iArr4[i5] = i24;
                                        }
                                    }
                                    int length3 = str.length() + i25 + i23;
                                    if (length2 > 0) {
                                        i24++;
                                    }
                                    i23 = length3;
                                }
                                arrayList.add(strUnicodeWrap);
                                width = i26;
                                i3 = i25;
                                bidiFormatter = bidiFormatter;
                            }
                            i4 = width;
                            spannableStringBuilder = new SpannableStringBuilder(c.c.d(arrayList));
                            if (objArr != null) {
                                spanned.getClass();
                                iArr2.getClass();
                                iArr4.getClass();
                                int i28 = 0;
                                while (i28 < objArr.length) {
                                    int spanStart = spanned.getSpanStart(objArr[i28]) + iArr2[i28];
                                    int spanEnd = spanned.getSpanEnd(objArr[i28]) + iArr4[i28];
                                    int spanFlags = spanned.getSpanFlags(objArr[i28]);
                                    Object[] objArr2 = objArr;
                                    if (spanStart < 0 || spanStart >= spannableStringBuilder.length() || spanEnd < 0 || spanEnd > spannableStringBuilder.length()) {
                                        StringBuilder sbW = androidx.privacysandbox.ads.adservices.java.internal.a.w("Span out of bounds: start=", ",end=", spanStart, ",len=", spanEnd);
                                        sbW.append(spannableStringBuilder.length());
                                        androidx.media3.common.util.c.t("BidiUtils", sbW.toString());
                                    } else {
                                        spannableStringBuilder.setSpan(objArr2[i28], spanStart, spanEnd, spanFlags);
                                    }
                                    i28++;
                                    objArr = objArr2;
                                }
                            }
                        } else {
                            iCharCount = Character.charCount(iCodePointAt) + i22;
                            length = i21;
                        }
                    } else {
                        i4 = width;
                        paddingBottom = paddingBottom;
                        z = z;
                    }
                }
            }
            m0Var.i = spannableStringBuilder;
            m0Var.j = alignment;
            m0Var.k = bitmap;
            m0Var.l = f12;
            m0Var.m = i20;
            m0Var.n = i2;
            m0Var.o = f;
            m0Var.p = i18;
            m0Var.q = f9;
            m0Var.r = f8;
            m0Var.s = eVar.a;
            m0Var.t = eVar.b;
            m0Var.u = i;
            m0Var.w = eVar.d;
            m0Var.v = eVar.e;
            textPaint.setTypeface(eVar.f);
            f11 = f11;
            m0Var.x = f11;
            m0Var.y = fH2;
            m0Var.z = f7;
            m0Var.A = paddingLeft;
            m0Var.B = paddingTop;
            width = i4;
            m0Var.C = width;
            i6 = paddingBottom;
            m0Var.D = i6;
            if (z) {
                m0Var.i.getClass();
                CharSequence charSequence = m0Var.i;
                SpannableStringBuilder spannableStringBuilder2 = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(m0Var.i);
                int i29 = m0Var.C - m0Var.A;
                int i30 = m0Var.D - m0Var.B;
                textPaint.setTextSize(m0Var.x);
                int i31 = (int) ((m0Var.x * 0.125f) + 0.5f);
                int i32 = i31 * 2;
                int i33 = i29 - i32;
                float f13 = m0Var.q;
                if (f13 != -3.4028235E38f) {
                    i33 = (int) (i33 * f13);
                }
                int i34 = i33;
                if (i34 <= 0) {
                    androidx.media3.common.util.c.t("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
                    f11 = f11;
                } else {
                    if (m0Var.y > f5) {
                        i8 = 0;
                        spannableStringBuilder2.setSpan(new AbsoluteSizeSpan((int) m0Var.y), 0, spannableStringBuilder2.length(), 16711680);
                    } else {
                        i8 = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder2);
                    if (m0Var.w == 1) {
                        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder3.getSpans(i8, spannableStringBuilder3.length(), ForegroundColorSpan.class);
                        int i35 = 0;
                        for (int length4 = foregroundColorSpanArr.length; i35 < length4; length4 = length4) {
                            spannableStringBuilder3.removeSpan(foregroundColorSpanArr[i35]);
                            i35++;
                        }
                    }
                    if (Color.alpha(m0Var.t) > 0) {
                        int i36 = m0Var.w;
                        if (i36 == 0 || i36 == 2) {
                            spannableStringBuilder2.setSpan(new BackgroundColorSpan(m0Var.t), 0, spannableStringBuilder2.length(), 16711680);
                        } else {
                            spannableStringBuilder3.setSpan(new BackgroundColorSpan(m0Var.t), 0, spannableStringBuilder3.length(), 16711680);
                        }
                    }
                    Layout.Alignment alignment2 = m0Var.j;
                    if (alignment2 == null) {
                        alignment2 = Layout.Alignment.ALIGN_CENTER;
                    }
                    Layout.Alignment alignment3 = alignment2;
                    SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0473: CONSTRUCTOR (r22v1 'staticLayout' android.text.StaticLayout) = 
                          (r23v1 'spannableStringBuilder4' android.text.SpannableStringBuilder)
                          (r1v16 ?? I:??[OBJECT, ARRAY])
                          (r25v1 'i34' int)
                          (r26v1 'alignment3' android.text.Layout$Alignment)
                          (wrap float:0x0467: IGET (r12v3 'm0Var' androidx.media3.ui.m0) A[WRAPPED] (LINE:1128) androidx.media3.ui.m0.d float)
                          (wrap float:0x0469: IGET (r12v3 'm0Var' androidx.media3.ui.m0) A[WRAPPED] (LINE:1130) androidx.media3.ui.m0.e float)
                          true
                         A[DECLARE_VAR, MD:(java.lang.CharSequence, android.text.TextPaint, int, android.text.Layout$Alignment, float, float, boolean):void (c)] (LINE:1140) call: android.text.StaticLayout.<init>(java.lang.CharSequence, android.text.TextPaint, int, android.text.Layout$Alignment, float, float, boolean):void type: CONSTRUCTOR in method: androidx.media3.ui.d.dispatchDraw(android.graphics.Canvas):void, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                        	at java.base/java.util.ArrayList.forEach(Unknown Source)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v16 ??
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 1576
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.d.dispatchDraw(android.graphics.Canvas):void");
                }
            }
