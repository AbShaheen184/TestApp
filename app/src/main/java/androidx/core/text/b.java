package androidx.core.text;

import android.text.SpannableStringBuilder;
import androidx.compose.foundation.gestures.z1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final String b;
    public static final String c;
    public static final b d;
    public static final b e;
    public final boolean a;

    static {
        z1 z1Var = f.c;
        b = Character.toString((char) 8206);
        c = Character.toString((char) 8207);
        d = new b(false);
        e = new b(true);
    }

    public b(boolean z) {
        z1 z1Var = f.a;
        this.a = z;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        a aVar = new a(charSequence);
        aVar.c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = aVar.c;
            if (i4 < aVar.b && i == 0) {
                CharSequence charSequence2 = aVar.a;
                char cCharAt = charSequence2.charAt(i4);
                aVar.d = cCharAt;
                boolean zIsHighSurrogate = Character.isHighSurrogate(cCharAt);
                int i5 = aVar.c;
                if (zIsHighSurrogate) {
                    int iCodePointAt = Character.codePointAt(charSequence2, i5);
                    aVar.c = Character.charCount(iCodePointAt) + aVar.c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    aVar.c = i5 + 1;
                    char c2 = aVar.d;
                    directionality = c2 < 1792 ? a.e[c2] : Character.getDirectionality(c2);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i != 0) {
            if (i2 == 0) {
                while (aVar.c > 0) {
                    switch (aVar.a()) {
                        case 14:
                        case 15:
                            if (i == i3) {
                                return -1;
                            }
                            i3--;
                            break;
                        case 16:
                        case 17:
                            if (i == i3) {
                                return 1;
                            }
                            i3--;
                            break;
                        case 18:
                            i3++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i2;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.c = aVar.b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (aVar.c > 0) {
                byte bA = aVar.a();
                if (bA == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        String str;
        z1 z1Var = f.c;
        if (charSequence == null) {
            return null;
        }
        boolean zE = z1Var.e(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zE2 = (zE ? f.b : f.a).e(charSequence, charSequence.length());
        String str2 = "";
        String str3 = c;
        String str4 = b;
        boolean z = this.a;
        if (z || !(zE2 || a(charSequence) == 1)) {
            str = (!z || (zE2 && a(charSequence) != -1)) ? "" : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zE != z) {
            spannableStringBuilder.append(zE ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zE3 = (zE ? f.b : f.a).e(charSequence, charSequence.length());
        if (!z && (zE3 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z && (!zE3 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
