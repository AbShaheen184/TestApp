package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.app.mlounge.emulator.LibretroCore;
import com.google.android.gms.measurement.internal.e0;
import com.google.android.material.internal.CheckableImageButton;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static com.app.mlounge.data.music.e a;
    public static org.schabi.newpipe.extractor.localization.c b;
    public static org.schabi.newpipe.extractor.localization.a c;

    public static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static int b(long j) {
        if (j <= 63) {
            return 1;
        }
        if (j <= 16383) {
            return 2;
        }
        return j <= LockFreeTaskQueueCore.HEAD_MASK ? 4 : 8;
    }

    public static void c(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            com.google.gson.b.j(androidx.privacysandbox.ads.adservices.java.internal.a.w("startIndex: ", ", endIndex: ", i, ", size: ", i2), i3);
        } else {
            if (i <= i2) {
                return;
            }
            net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("startIndex: ", i, " > endIndex: ", i2));
        }
    }

    public static void d(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            com.google.gson.b.j(androidx.privacysandbox.ads.adservices.java.internal.a.w("fromIndex: ", ", toIndex: ", i, ", size: ", i2), i3);
        } else {
            if (i <= i2) {
                return;
            }
            net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("fromIndex: ", i, " > toIndex: ", i2));
        }
    }

    public static int e(int i, int i2) {
        long j = ((long) i) + ((long) i2);
        int i3 = (int) j;
        if (j == ((long) i3)) {
            return i3;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i + ", " + i2 + ")");
    }

    public static final void f(com.caverock.androidsvg.m mVar, String str, String str2) {
        mVar.getClass();
        str.getClass();
        str2.getClass();
        ArrayList arrayList = mVar.b;
        arrayList.add(str);
        arrayList.add(kotlin.text.k.A0(str2).toString());
    }

    public static ImageView.ScaleType g(int i) {
        if (i == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i != 5) {
            return i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    public static void h(InputStream inputStream, OutputStream outputStream) throws IOException {
        inputStream.getClass();
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            i = inputStream.read(bArr);
        }
    }

    public static com.google.firebase.components.b i(String str, String str2) {
        com.google.firebase.platforminfo.a aVar = new com.google.firebase.platforminfo.a(str, str2);
        com.google.firebase.components.a aVarB = com.google.firebase.components.b.b(com.google.firebase.platforminfo.a.class);
        aVarB.e = 1;
        aVarB.f = new androidx.media3.exoplayer.analytics.e(aVar);
        return aVarB.b();
    }

    public static int j(int i, int i2) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (com.google.common.math.d.a[roundingMode.ordinal()]) {
            case 1:
                com.google.common.base.c.f(i4 == 0);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i3;
                }
                if (iAbs2 <= 0) {
                    return i3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i3 + i5;
    }

    public static int k(long j, ByteBuffer byteBuffer) {
        if (j <= 2147483647L) {
            return l(byteBuffer, (int) j);
        }
        if (j > 4611686018427387903L) {
            net.luminis.tls.engine.impl.c.o("value cannot be encoded in variable-length integer");
            return 0;
        }
        int iPosition = byteBuffer.position();
        byteBuffer.putLong(j);
        byteBuffer.put(iPosition, (byte) (byteBuffer.get(iPosition) | (-64)));
        return 8;
    }

    public static int l(ByteBuffer byteBuffer, int i) {
        if (i <= 63) {
            byteBuffer.put((byte) i);
            return 1;
        }
        if (i <= 16383) {
            byteBuffer.put((byte) ((i / LibretroCore.SCREEN_WIDTH) | 64));
            byteBuffer.put((byte) (i % LibretroCore.SCREEN_WIDTH));
            return 2;
        }
        if (i <= 1073741823) {
            int iPosition = byteBuffer.position();
            byteBuffer.putInt(i);
            byteBuffer.put(iPosition, (byte) (byteBuffer.get(iPosition) | (-128)));
            return 4;
        }
        int iPosition2 = byteBuffer.position();
        byteBuffer.putLong(i);
        byteBuffer.put(iPosition2, (byte) (byteBuffer.get(iPosition2) | (-64)));
        return 8;
    }

    public static com.google.firebase.components.b m(String str, androidx.transition.k kVar) {
        com.google.firebase.components.a aVarB = com.google.firebase.components.b.b(com.google.firebase.platforminfo.a.class);
        aVarB.e = 1;
        aVarB.a(com.google.firebase.components.j.b(Context.class));
        aVarB.f = new androidx.media3.exoplayer.analytics.c(11, str, kVar);
        return aVarB.b();
    }

    public static final void n(String str) {
        str.getClass();
        if (str.length() <= 0) {
            net.luminis.tls.engine.impl.c.o("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                com.google.android.material.shape.e.a(16);
                String string = Integer.toString(cCharAt, 16);
                string.getClass();
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in header name: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void o(String str, String str2) {
        str.getClass();
        str2.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                com.google.android.material.shape.e.a(16);
                String string = Integer.toString(cCharAt, 16);
                string.getClass();
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                sb.append(okhttp3.internal.e.m(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static void p(com.app.mlounge.data.music.e eVar) {
        e0 e0Var = org.schabi.newpipe.extractor.utils.a.b;
        e0 e0Var2 = org.schabi.newpipe.extractor.utils.a.a;
        if (e0Var != e0Var2) {
            androidx.constraintlayout.core.g.e(1);
        }
        org.schabi.newpipe.extractor.localization.c cVar = org.schabi.newpipe.extractor.localization.c.z;
        if (e0Var != e0Var2) {
            androidx.constraintlayout.core.g.e(1);
        }
        org.schabi.newpipe.extractor.localization.a aVar = cVar.a().isEmpty() ? org.schabi.newpipe.extractor.localization.a.y : new org.schabi.newpipe.extractor.localization.a(cVar.a());
        org.schabi.newpipe.extractor.utils.a.b("Initializing with downloader={}, localization={}, country={}", eVar, cVar, aVar);
        a = eVar;
        b = cVar;
        c = aVar;
    }

    public static int q(int i) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i <= 0) {
            net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.p("x (", i, ") must be > 0"));
            return 0;
        }
        switch (com.google.common.math.d.a[roundingMode.ordinal()]) {
            case 1:
                com.google.common.base.c.f((i > 0) & (((i + (-1)) & i) == 0));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static int r(ByteBuffer byteBuffer) {
        long jS = s(byteBuffer);
        if (jS <= 2147483647L) {
            return (int) jS;
        }
        net.luminis.tls.engine.impl.c.o("value to large for Java int");
        return 0;
    }

    public static long s(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 1) {
            throw new net.luminis.quic.generic.a();
        }
        byte b2 = byteBuffer.get();
        int i = (b2 & 192) >> 6;
        if (i == 0) {
            return b2;
        }
        if (i == 1) {
            if (byteBuffer.remaining() < 1) {
                throw new net.luminis.quic.generic.a();
            }
            return byteBuffer.getShort() & 16383;
        }
        if (i == 2) {
            if (byteBuffer.remaining() < 3) {
                throw new net.luminis.quic.generic.a();
            }
            return byteBuffer.getInt() & LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
        }
        if (i != 3) {
            com.google.gson.b.l();
            return 0L;
        }
        if (byteBuffer.remaining() < 7) {
            throw new net.luminis.quic.generic.a();
        }
        return byteBuffer.getLong() & 4611686018427387903L;
    }

    public static final byte[] t(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        h(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static void u(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static void v(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public static final kotlin.r w(String str) {
        int i;
        com.google.android.material.shape.e.a(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (kotlin.jvm.internal.l.b(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int i3 = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            int i4 = i2 ^ Integer.MIN_VALUE;
            if (Integer.compare(i4, i3 ^ Integer.MIN_VALUE) > 0) {
                if (i3 != 119304647) {
                    return null;
                }
                i3 = (int) ((((long) (-1)) & 4294967295L) / (4294967295L & ((long) 10)));
                if (Integer.compare(i4, i3 ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i5 = i2 * 10;
            int i6 = iDigit + i5;
            if (Integer.compare(i6 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i++;
            i2 = i6;
        }
        return new kotlin.r(i2);
    }

    public static final kotlin.t x(String str) {
        int i;
        str.getClass();
        int i2 = 10;
        com.google.android.material.shape.e.a(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char cCharAt = str.charAt(0);
        int i3 = 1;
        if (kotlin.jvm.internal.l.b(cCharAt, 48) >= 0) {
            i = 0;
        } else {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i = 1;
        }
        long j = 10;
        long j2 = 0;
        long j3 = 512409557603043100L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), i2);
            if (iDigit < 0) {
                return null;
            }
            int i4 = length;
            long j4 = j2 ^ Long.MIN_VALUE;
            int i5 = i;
            if (Long.compare(j4, j3 ^ Long.MIN_VALUE) <= 0) {
                j = j;
            } else {
                if (j3 != 512409557603043100L) {
                    return null;
                }
                if (j < 0) {
                    j3 = Long.MAX_VALUE < (j ^ Long.MIN_VALUE) ? 0L : 1L;
                } else {
                    long j5 = (Long.MAX_VALUE / j) << i3;
                    j3 = j5 + ((long) ((((-1) - (j5 * j)) ^ Long.MIN_VALUE) >= (j ^ Long.MIN_VALUE) ? i3 : 0));
                }
                if (Long.compare(j4, j3 ^ Long.MIN_VALUE) > 0) {
                    return null;
                }
            }
            long j6 = j2 * j;
            long j7 = (((long) iDigit) & 4294967295L) + j6;
            if (Long.compare(j7 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i = i5 + 1;
            j2 = j7;
            length = i4;
            j = j;
            i2 = 10;
            i3 = 1;
        }
        return new kotlin.t(j2);
    }
}
