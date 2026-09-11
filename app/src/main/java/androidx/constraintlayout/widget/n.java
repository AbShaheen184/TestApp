package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final int[] d = {0, 4, 8};
    public static final SparseIntArray e;
    public static final SparseIntArray f;
    public final HashMap a = new HashMap();
    public final boolean b = true;
    public final HashMap c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f = sparseIntArray2;
        sparseIntArray.append(81, 25);
        sparseIntArray.append(82, 26);
        sparseIntArray.append(84, 29);
        sparseIntArray.append(85, 30);
        sparseIntArray.append(91, 36);
        sparseIntArray.append(90, 35);
        sparseIntArray.append(62, 4);
        sparseIntArray.append(61, 3);
        sparseIntArray.append(57, 1);
        sparseIntArray.append(59, 91);
        sparseIntArray.append(58, 92);
        sparseIntArray.append(100, 6);
        sparseIntArray.append(Token.ASSIGN_LOGICAL_OR, 7);
        sparseIntArray.append(69, 17);
        sparseIntArray.append(70, 18);
        sparseIntArray.append(71, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(86, 32);
        sparseIntArray.append(87, 33);
        sparseIntArray.append(68, 10);
        sparseIntArray.append(67, 9);
        sparseIntArray.append(Token.ASSIGN_LSH, 13);
        sparseIntArray.append(Token.ASSIGN_ADD, 16);
        sparseIntArray.append(Token.ASSIGN_RSH, 14);
        sparseIntArray.append(Token.ASSIGN_BITAND, 11);
        sparseIntArray.append(Token.ASSIGN_URSH, 15);
        sparseIntArray.append(Token.ASSIGN_LOGICAL_AND, 12);
        sparseIntArray.append(94, 40);
        sparseIntArray.append(79, 39);
        sparseIntArray.append(78, 41);
        sparseIntArray.append(93, 42);
        sparseIntArray.append(77, 20);
        sparseIntArray.append(92, 37);
        sparseIntArray.append(66, 5);
        sparseIntArray.append(80, 87);
        sparseIntArray.append(89, 87);
        sparseIntArray.append(83, 87);
        sparseIntArray.append(60, 87);
        sparseIntArray.append(56, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(95, 95);
        sparseIntArray.append(72, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(96, 54);
        sparseIntArray.append(73, 55);
        sparseIntArray.append(97, 56);
        sparseIntArray.append(74, 57);
        sparseIntArray.append(98, 58);
        sparseIntArray.append(75, 59);
        sparseIntArray.append(63, 61);
        sparseIntArray.append(65, 62);
        sparseIntArray.append(64, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(120, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(Token.DOT, 67);
        sparseIntArray.append(Token.ASSIGN_MOD, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(Token.ASSIGN_DIV, 68);
        sparseIntArray.append(99, 69);
        sparseIntArray.append(76, 70);
        sparseIntArray.append(110, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(Token.ASSIGN_EXP, 76);
        sparseIntArray.append(88, 77);
        sparseIntArray.append(Token.FUNCTION, 78);
        sparseIntArray.append(55, 80);
        sparseIntArray.append(54, 81);
        sparseIntArray.append(Token.HOOK, 82);
        sparseIntArray.append(Token.INC, 83);
        sparseIntArray.append(Token.AND, 84);
        sparseIntArray.append(Token.OR, 85);
        sparseIntArray.append(Token.COLON, 86);
        sparseIntArray2.append(84, 6);
        sparseIntArray2.append(84, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(88, 13);
        sparseIntArray2.append(91, 16);
        sparseIntArray2.append(89, 14);
        sparseIntArray2.append(86, 11);
        sparseIntArray2.append(90, 15);
        sparseIntArray2.append(87, 12);
        sparseIntArray2.append(77, 40);
        sparseIntArray2.append(70, 39);
        sparseIntArray2.append(69, 41);
        sparseIntArray2.append(76, 42);
        sparseIntArray2.append(68, 20);
        sparseIntArray2.append(75, 37);
        sparseIntArray2.append(59, 5);
        sparseIntArray2.append(71, 87);
        sparseIntArray2.append(74, 87);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(55, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(78, 95);
        sparseIntArray2.append(63, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(79, 54);
        sparseIntArray2.append(64, 55);
        sparseIntArray2.append(80, 56);
        sparseIntArray2.append(65, 57);
        sparseIntArray2.append(81, 58);
        sparseIntArray2.append(66, 59);
        sparseIntArray2.append(58, 62);
        sparseIntArray2.append(57, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(Token.ASSIGN_LOGICAL_AND, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(Token.ASSIGN_LSH, 67);
        sparseIntArray2.append(95, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(96, 98);
        sparseIntArray2.append(94, 68);
        sparseIntArray2.append(82, 69);
        sparseIntArray2.append(67, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(97, 76);
        sparseIntArray2.append(73, 77);
        sparseIntArray2.append(Token.ASSIGN_RSH, 78);
        sparseIntArray2.append(54, 80);
        sparseIntArray2.append(53, 81);
        sparseIntArray2.append(99, 82);
        sparseIntArray2.append(Token.ASSIGN_BITAND, 83);
        sparseIntArray2.append(Token.ASSIGN_BITXOR, 84);
        sparseIntArray2.append(Token.ASSIGN_LOGICAL_OR, 85);
        sparseIntArray2.append(100, 86);
        sparseIntArray2.append(93, 97);
    }

    public static int[] c(a aVar, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = aVar.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = q.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) aVar.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.J;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.J.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public static i d(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        int i2;
        i iVar = new i();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? r.c : r.a);
        l lVar = iVar.b;
        m mVar = iVar.e;
        k kVar = iVar.c;
        j jVar = iVar.d;
        int[] iArr = d;
        String[] strArr = androidx.constraintlayout.core.motion.utils.a.a;
        SparseIntArray sparseIntArray = e;
        if (z) {
            h hVar = new h();
            hVar.a = new int[10];
            hVar.b = new int[10];
            hVar.c = 0;
            hVar.d = new int[10];
            hVar.e = new float[10];
            hVar.f = 0;
            hVar.g = new int[5];
            hVar.h = new String[5];
            hVar.i = 0;
            hVar.j = new int[4];
            hVar.k = new boolean[4];
            hVar.l = 0;
            kVar.getClass();
            jVar.getClass();
            mVar.getClass();
            int i3 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i3 < indexCount; indexCount = i2) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                int i4 = i3;
                switch (f.get(index)) {
                    case 2:
                        i2 = indexCount;
                        hVar.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.H));
                        continue;
                        i3 = i4 + 1;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case Token.GETPROP /* 33 */:
                    case 35:
                    case Token.GETPROPNOWARN_SUPER /* 36 */:
                    case 61:
                    case Token.REF_NS_NAME /* 88 */:
                    case 89:
                    case Token.TRY /* 90 */:
                    case Token.SEMI /* 91 */:
                    case Token.LB /* 92 */:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i2 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i2 = indexCount;
                        hVar.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i3 = i4 + 1;
                        break;
                    case 6:
                        i2 = indexCount;
                        hVar.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jVar.B));
                        break;
                    case 7:
                        i2 = indexCount;
                        hVar.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jVar.C));
                        break;
                    case 8:
                        i2 = indexCount;
                        hVar.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.I));
                        break;
                    case 11:
                        i2 = indexCount;
                        hVar.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.O));
                        break;
                    case 12:
                        i2 = indexCount;
                        hVar.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.P));
                        break;
                    case 13:
                        i2 = indexCount;
                        hVar.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.L));
                        break;
                    case 14:
                        i2 = indexCount;
                        hVar.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.N));
                        break;
                    case 15:
                        i2 = indexCount;
                        hVar.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.Q));
                        break;
                    case 16:
                        i2 = indexCount;
                        hVar.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.M));
                        break;
                    case 17:
                        i2 = indexCount;
                        hVar.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jVar.d));
                        break;
                    case 18:
                        i2 = indexCount;
                        hVar.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jVar.e));
                        break;
                    case 19:
                        i2 = indexCount;
                        hVar.a(19, typedArrayObtainStyledAttributes.getFloat(index, jVar.f));
                        break;
                    case 20:
                        i2 = indexCount;
                        hVar.a(20, typedArrayObtainStyledAttributes.getFloat(index, jVar.v));
                        break;
                    case 21:
                        i2 = indexCount;
                        hVar.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, jVar.c));
                        break;
                    case 22:
                        i2 = indexCount;
                        hVar.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, lVar.a)]);
                        break;
                    case 23:
                        i2 = indexCount;
                        hVar.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, jVar.b));
                        break;
                    case 24:
                        i2 = indexCount;
                        hVar.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.E));
                        break;
                    case 27:
                        i2 = indexCount;
                        hVar.b(27, typedArrayObtainStyledAttributes.getInt(index, jVar.D));
                        break;
                    case 28:
                        i2 = indexCount;
                        hVar.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.F));
                        break;
                    case 31:
                        i2 = indexCount;
                        hVar.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.J));
                        break;
                    case Token.GETPROPNOWARN /* 34 */:
                        i2 = indexCount;
                        hVar.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.G));
                        break;
                    case Token.SETPROP /* 37 */:
                        i2 = indexCount;
                        hVar.a(37, typedArrayObtainStyledAttributes.getFloat(index, jVar.w));
                        break;
                    case Token.SETPROP_SUPER /* 38 */:
                        i2 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, iVar.a);
                        iVar.a = resourceId;
                        hVar.b(38, resourceId);
                        break;
                    case Token.GETELEM /* 39 */:
                        i2 = indexCount;
                        hVar.a(39, typedArrayObtainStyledAttributes.getFloat(index, jVar.T));
                        break;
                    case Token.GETELEM_SUPER /* 40 */:
                        i2 = indexCount;
                        hVar.a(40, typedArrayObtainStyledAttributes.getFloat(index, jVar.S));
                        break;
                    case Token.SETELEM /* 41 */:
                        i2 = indexCount;
                        hVar.b(41, typedArrayObtainStyledAttributes.getInt(index, jVar.U));
                        break;
                    case Token.SETELEM_SUPER /* 42 */:
                        i2 = indexCount;
                        hVar.b(42, typedArrayObtainStyledAttributes.getInt(index, jVar.V));
                        break;
                    case Token.CALL /* 43 */:
                        i2 = indexCount;
                        hVar.a(43, typedArrayObtainStyledAttributes.getFloat(index, lVar.c));
                        break;
                    case Token.NAME /* 44 */:
                        i2 = indexCount;
                        hVar.d(44, true);
                        hVar.a(44, typedArrayObtainStyledAttributes.getDimension(index, mVar.m));
                        break;
                    case Token.NUMBER /* 45 */:
                        i2 = indexCount;
                        hVar.a(45, typedArrayObtainStyledAttributes.getFloat(index, mVar.b));
                        break;
                    case Token.STRING /* 46 */:
                        i2 = indexCount;
                        hVar.a(46, typedArrayObtainStyledAttributes.getFloat(index, mVar.c));
                        break;
                    case Token.NULL /* 47 */:
                        i2 = indexCount;
                        hVar.a(47, typedArrayObtainStyledAttributes.getFloat(index, mVar.d));
                        break;
                    case Token.THIS /* 48 */:
                        i2 = indexCount;
                        hVar.a(48, typedArrayObtainStyledAttributes.getFloat(index, mVar.e));
                        break;
                    case Token.FALSE /* 49 */:
                        i2 = indexCount;
                        hVar.a(49, typedArrayObtainStyledAttributes.getDimension(index, mVar.f));
                        break;
                    case Token.TRUE /* 50 */:
                        i2 = indexCount;
                        hVar.a(50, typedArrayObtainStyledAttributes.getDimension(index, mVar.g));
                        break;
                    case Token.SHEQ /* 51 */:
                        i2 = indexCount;
                        hVar.a(51, typedArrayObtainStyledAttributes.getDimension(index, mVar.i));
                        break;
                    case Token.SHNE /* 52 */:
                        i2 = indexCount;
                        hVar.a(52, typedArrayObtainStyledAttributes.getDimension(index, mVar.j));
                        break;
                    case Token.REGEXP /* 53 */:
                        i2 = indexCount;
                        hVar.a(53, typedArrayObtainStyledAttributes.getDimension(index, mVar.k));
                        break;
                    case Token.BINDNAME /* 54 */:
                        i2 = indexCount;
                        hVar.b(54, typedArrayObtainStyledAttributes.getInt(index, jVar.W));
                        break;
                    case Token.THROW /* 55 */:
                        i2 = indexCount;
                        hVar.b(55, typedArrayObtainStyledAttributes.getInt(index, jVar.X));
                        break;
                    case Token.RETHROW /* 56 */:
                        i2 = indexCount;
                        hVar.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.Y));
                        break;
                    case Token.IN /* 57 */:
                        i2 = indexCount;
                        hVar.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.Z));
                        break;
                    case Token.INSTANCEOF /* 58 */:
                        i2 = indexCount;
                        hVar.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.a0));
                        break;
                    case Token.LOCAL_LOAD /* 59 */:
                        i2 = indexCount;
                        hVar.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.b0));
                        break;
                    case 60:
                        i2 = indexCount;
                        hVar.a(60, typedArrayObtainStyledAttributes.getFloat(index, mVar.a));
                        break;
                    case Token.CATCH_SCOPE /* 62 */:
                        i2 = indexCount;
                        hVar.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.z));
                        break;
                    case Token.ENUM_INIT_KEYS /* 63 */:
                        i2 = indexCount;
                        hVar.a(63, typedArrayObtainStyledAttributes.getFloat(index, jVar.A));
                        break;
                    case Token.ENUM_INIT_VALUES /* 64 */:
                        i2 = indexCount;
                        hVar.b(64, f(typedArrayObtainStyledAttributes, index, kVar.a));
                        break;
                    case Token.ENUM_INIT_ARRAY /* 65 */:
                        i2 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            hVar.c(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            hVar.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                        i2 = indexCount;
                        hVar.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case Token.ENUM_NEXT /* 67 */:
                        i2 = indexCount;
                        hVar.a(67, typedArrayObtainStyledAttributes.getFloat(index, kVar.e));
                        break;
                    case Token.ENUM_ID /* 68 */:
                        i2 = indexCount;
                        hVar.a(68, typedArrayObtainStyledAttributes.getFloat(index, lVar.d));
                        break;
                    case Token.THISFN /* 69 */:
                        i2 = indexCount;
                        hVar.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case Token.RETURN_RESULT /* 70 */:
                        i2 = indexCount;
                        hVar.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case Token.ARRAYLIT /* 71 */:
                        i2 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case Token.OBJECTLIT /* 72 */:
                        i2 = indexCount;
                        hVar.b(72, typedArrayObtainStyledAttributes.getInt(index, jVar.e0));
                        break;
                    case Token.GET_REF /* 73 */:
                        i2 = indexCount;
                        hVar.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.f0));
                        break;
                    case Token.SET_REF /* 74 */:
                        i2 = indexCount;
                        hVar.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case Token.DEL_REF /* 75 */:
                        i2 = indexCount;
                        hVar.d(75, typedArrayObtainStyledAttributes.getBoolean(index, jVar.m0));
                        break;
                    case Token.REF_CALL /* 76 */:
                        i2 = indexCount;
                        hVar.b(76, typedArrayObtainStyledAttributes.getInt(index, kVar.c));
                        break;
                    case Token.REF_SPECIAL /* 77 */:
                        i2 = indexCount;
                        hVar.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case Token.YIELD /* 78 */:
                        i2 = indexCount;
                        hVar.b(78, typedArrayObtainStyledAttributes.getInt(index, lVar.b));
                        break;
                    case Token.SUPER /* 79 */:
                        i2 = indexCount;
                        hVar.a(79, typedArrayObtainStyledAttributes.getFloat(index, kVar.d));
                        break;
                    case Token.STRICT_SETNAME /* 80 */:
                        i2 = indexCount;
                        hVar.d(80, typedArrayObtainStyledAttributes.getBoolean(index, jVar.k0));
                        break;
                    case Token.EXP /* 81 */:
                        i2 = indexCount;
                        hVar.d(81, typedArrayObtainStyledAttributes.getBoolean(index, jVar.l0));
                        break;
                    case Token.DEFAULTNAMESPACE /* 82 */:
                        i2 = indexCount;
                        hVar.b(82, typedArrayObtainStyledAttributes.getInteger(index, kVar.b));
                        break;
                    case Token.ESCXMLATTR /* 83 */:
                        i2 = indexCount;
                        hVar.b(83, f(typedArrayObtainStyledAttributes, index, mVar.h));
                        break;
                    case Token.ESCXMLTEXT /* 84 */:
                        i2 = indexCount;
                        hVar.b(84, typedArrayObtainStyledAttributes.getInteger(index, kVar.g));
                        break;
                    case Token.REF_MEMBER /* 85 */:
                        i2 = indexCount;
                        hVar.a(85, typedArrayObtainStyledAttributes.getFloat(index, kVar.f));
                        break;
                    case Token.REF_NS_MEMBER /* 86 */:
                        i2 = indexCount;
                        int i5 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            kVar.i = resourceId2;
                            hVar.b(89, resourceId2);
                            if (kVar.i != -1) {
                                hVar.b(88, -2);
                            }
                        } else if (i5 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            kVar.h = string;
                            hVar.c(90, string);
                            if (kVar.h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                kVar.i = resourceId3;
                                hVar.b(89, resourceId3);
                                hVar.b(88, -2);
                            } else {
                                hVar.b(88, -1);
                            }
                        } else {
                            hVar.b(88, typedArrayObtainStyledAttributes.getInteger(index, kVar.i));
                        }
                        break;
                    case Token.REF_NAME /* 87 */:
                        i2 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case Token.RB /* 93 */:
                        i2 = indexCount;
                        hVar.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.K));
                        break;
                    case Token.LC /* 94 */:
                        i2 = indexCount;
                        hVar.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.R));
                        break;
                    case Token.RC /* 95 */:
                        i2 = indexCount;
                        g(hVar, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case Token.LP /* 96 */:
                        i2 = indexCount;
                        g(hVar, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case Token.RP /* 97 */:
                        i2 = indexCount;
                        hVar.b(97, typedArrayObtainStyledAttributes.getInt(index, jVar.n0));
                        break;
                    case Token.COMMA /* 98 */:
                        i2 = indexCount;
                        int i6 = androidx.constraintlayout.motion.widget.a.P;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            iVar.a = typedArrayObtainStyledAttributes.getResourceId(index, iVar.a);
                        }
                        break;
                }
                i3 = i4 + 1;
            }
        } else {
            int i7 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i7 < indexCount2; indexCount2 = i) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        kVar.getClass();
                        jVar.getClass();
                        mVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        jVar.o = f(typedArrayObtainStyledAttributes, index2, jVar.o);
                        continue;
                        i7++;
                        break;
                    case 2:
                        i = indexCount2;
                        jVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.H);
                        continue;
                        i7++;
                        break;
                    case 3:
                        i = indexCount2;
                        jVar.n = f(typedArrayObtainStyledAttributes, index2, jVar.n);
                        continue;
                        i7++;
                        break;
                    case 4:
                        i = indexCount2;
                        jVar.m = f(typedArrayObtainStyledAttributes, index2, jVar.m);
                        continue;
                        i7++;
                        break;
                    case 5:
                        i = indexCount2;
                        jVar.x = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i7++;
                        break;
                    case 6:
                        i = indexCount2;
                        jVar.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, jVar.B);
                        continue;
                        i7++;
                        break;
                    case 7:
                        i = indexCount2;
                        jVar.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, jVar.C);
                        continue;
                        i7++;
                        break;
                    case 8:
                        i = indexCount2;
                        jVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.I);
                        continue;
                        i7++;
                        break;
                    case 9:
                        i = indexCount2;
                        jVar.u = f(typedArrayObtainStyledAttributes, index2, jVar.u);
                        continue;
                        i7++;
                        break;
                    case 10:
                        i = indexCount2;
                        jVar.t = f(typedArrayObtainStyledAttributes, index2, jVar.t);
                        continue;
                        i7++;
                        break;
                    case 11:
                        i = indexCount2;
                        jVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.O);
                        continue;
                        i7++;
                        break;
                    case 12:
                        i = indexCount2;
                        jVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.P);
                        continue;
                        i7++;
                        break;
                    case 13:
                        i = indexCount2;
                        jVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.L);
                        continue;
                        i7++;
                        break;
                    case 14:
                        i = indexCount2;
                        jVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.N);
                        continue;
                        i7++;
                        break;
                    case 15:
                        i = indexCount2;
                        jVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.Q);
                        continue;
                        i7++;
                        break;
                    case 16:
                        i = indexCount2;
                        jVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.M);
                        continue;
                        i7++;
                        break;
                    case 17:
                        i = indexCount2;
                        jVar.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, jVar.d);
                        continue;
                        i7++;
                        break;
                    case 18:
                        i = indexCount2;
                        jVar.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, jVar.e);
                        continue;
                        i7++;
                        break;
                    case 19:
                        i = indexCount2;
                        jVar.f = typedArrayObtainStyledAttributes.getFloat(index2, jVar.f);
                        continue;
                        i7++;
                        break;
                    case 20:
                        i = indexCount2;
                        jVar.v = typedArrayObtainStyledAttributes.getFloat(index2, jVar.v);
                        continue;
                        i7++;
                        break;
                    case 21:
                        i = indexCount2;
                        jVar.c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, jVar.c);
                        continue;
                        i7++;
                        break;
                    case 22:
                        i = indexCount2;
                        int i8 = typedArrayObtainStyledAttributes.getInt(index2, lVar.a);
                        lVar.a = i8;
                        lVar.a = iArr[i8];
                        continue;
                        i7++;
                        break;
                    case 23:
                        i = indexCount2;
                        jVar.b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, jVar.b);
                        continue;
                        i7++;
                        break;
                    case 24:
                        i = indexCount2;
                        jVar.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.E);
                        continue;
                        i7++;
                        break;
                    case 25:
                        i = indexCount2;
                        jVar.g = f(typedArrayObtainStyledAttributes, index2, jVar.g);
                        continue;
                        i7++;
                        break;
                    case 26:
                        i = indexCount2;
                        jVar.h = f(typedArrayObtainStyledAttributes, index2, jVar.h);
                        continue;
                        i7++;
                        break;
                    case 27:
                        i = indexCount2;
                        jVar.D = typedArrayObtainStyledAttributes.getInt(index2, jVar.D);
                        continue;
                        i7++;
                        break;
                    case 28:
                        i = indexCount2;
                        jVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.F);
                        continue;
                        i7++;
                        break;
                    case 29:
                        i = indexCount2;
                        jVar.i = f(typedArrayObtainStyledAttributes, index2, jVar.i);
                        continue;
                        i7++;
                        break;
                    case 30:
                        i = indexCount2;
                        jVar.j = f(typedArrayObtainStyledAttributes, index2, jVar.j);
                        continue;
                        i7++;
                        break;
                    case 31:
                        i = indexCount2;
                        jVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.J);
                        continue;
                        i7++;
                        break;
                    case 32:
                        i = indexCount2;
                        jVar.r = f(typedArrayObtainStyledAttributes, index2, jVar.r);
                        continue;
                        i7++;
                        break;
                    case Token.GETPROP /* 33 */:
                        i = indexCount2;
                        jVar.s = f(typedArrayObtainStyledAttributes, index2, jVar.s);
                        continue;
                        i7++;
                        break;
                    case Token.GETPROPNOWARN /* 34 */:
                        i = indexCount2;
                        jVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.G);
                        continue;
                        i7++;
                        break;
                    case 35:
                        i = indexCount2;
                        jVar.l = f(typedArrayObtainStyledAttributes, index2, jVar.l);
                        continue;
                        i7++;
                        break;
                    case Token.GETPROPNOWARN_SUPER /* 36 */:
                        i = indexCount2;
                        jVar.k = f(typedArrayObtainStyledAttributes, index2, jVar.k);
                        continue;
                        i7++;
                        break;
                    case Token.SETPROP /* 37 */:
                        i = indexCount2;
                        jVar.w = typedArrayObtainStyledAttributes.getFloat(index2, jVar.w);
                        continue;
                        i7++;
                        break;
                    case Token.SETPROP_SUPER /* 38 */:
                        i = indexCount2;
                        iVar.a = typedArrayObtainStyledAttributes.getResourceId(index2, iVar.a);
                        continue;
                        i7++;
                        break;
                    case Token.GETELEM /* 39 */:
                        i = indexCount2;
                        jVar.T = typedArrayObtainStyledAttributes.getFloat(index2, jVar.T);
                        continue;
                        i7++;
                        break;
                    case Token.GETELEM_SUPER /* 40 */:
                        i = indexCount2;
                        jVar.S = typedArrayObtainStyledAttributes.getFloat(index2, jVar.S);
                        continue;
                        i7++;
                        break;
                    case Token.SETELEM /* 41 */:
                        i = indexCount2;
                        jVar.U = typedArrayObtainStyledAttributes.getInt(index2, jVar.U);
                        continue;
                        i7++;
                        break;
                    case Token.SETELEM_SUPER /* 42 */:
                        i = indexCount2;
                        jVar.V = typedArrayObtainStyledAttributes.getInt(index2, jVar.V);
                        continue;
                        i7++;
                        break;
                    case Token.CALL /* 43 */:
                        i = indexCount2;
                        lVar.c = typedArrayObtainStyledAttributes.getFloat(index2, lVar.c);
                        continue;
                        i7++;
                        break;
                    case Token.NAME /* 44 */:
                        i = indexCount2;
                        mVar.l = true;
                        mVar.m = typedArrayObtainStyledAttributes.getDimension(index2, mVar.m);
                        continue;
                        i7++;
                        break;
                    case Token.NUMBER /* 45 */:
                        i = indexCount2;
                        mVar.b = typedArrayObtainStyledAttributes.getFloat(index2, mVar.b);
                        continue;
                        i7++;
                        break;
                    case Token.STRING /* 46 */:
                        i = indexCount2;
                        mVar.c = typedArrayObtainStyledAttributes.getFloat(index2, mVar.c);
                        continue;
                        i7++;
                        break;
                    case Token.NULL /* 47 */:
                        i = indexCount2;
                        mVar.d = typedArrayObtainStyledAttributes.getFloat(index2, mVar.d);
                        continue;
                        i7++;
                        break;
                    case Token.THIS /* 48 */:
                        i = indexCount2;
                        mVar.e = typedArrayObtainStyledAttributes.getFloat(index2, mVar.e);
                        continue;
                        i7++;
                        break;
                    case Token.FALSE /* 49 */:
                        i = indexCount2;
                        mVar.f = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f);
                        continue;
                        i7++;
                        break;
                    case Token.TRUE /* 50 */:
                        i = indexCount2;
                        mVar.g = typedArrayObtainStyledAttributes.getDimension(index2, mVar.g);
                        continue;
                        i7++;
                        break;
                    case Token.SHEQ /* 51 */:
                        i = indexCount2;
                        mVar.i = typedArrayObtainStyledAttributes.getDimension(index2, mVar.i);
                        continue;
                        i7++;
                        break;
                    case Token.SHNE /* 52 */:
                        i = indexCount2;
                        mVar.j = typedArrayObtainStyledAttributes.getDimension(index2, mVar.j);
                        continue;
                        i7++;
                        break;
                    case Token.REGEXP /* 53 */:
                        i = indexCount2;
                        mVar.k = typedArrayObtainStyledAttributes.getDimension(index2, mVar.k);
                        continue;
                        i7++;
                        break;
                    case Token.BINDNAME /* 54 */:
                        i = indexCount2;
                        jVar.W = typedArrayObtainStyledAttributes.getInt(index2, jVar.W);
                        continue;
                        i7++;
                        break;
                    case Token.THROW /* 55 */:
                        i = indexCount2;
                        jVar.X = typedArrayObtainStyledAttributes.getInt(index2, jVar.X);
                        continue;
                        i7++;
                        break;
                    case Token.RETHROW /* 56 */:
                        i = indexCount2;
                        jVar.Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.Y);
                        continue;
                        i7++;
                        break;
                    case Token.IN /* 57 */:
                        i = indexCount2;
                        jVar.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.Z);
                        continue;
                        i7++;
                        break;
                    case Token.INSTANCEOF /* 58 */:
                        i = indexCount2;
                        jVar.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.a0);
                        continue;
                        i7++;
                        break;
                    case Token.LOCAL_LOAD /* 59 */:
                        i = indexCount2;
                        jVar.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.b0);
                        continue;
                        i7++;
                        break;
                    case 60:
                        i = indexCount2;
                        mVar.a = typedArrayObtainStyledAttributes.getFloat(index2, mVar.a);
                        continue;
                        i7++;
                        break;
                    case 61:
                        i = indexCount2;
                        jVar.y = f(typedArrayObtainStyledAttributes, index2, jVar.y);
                        continue;
                        i7++;
                        break;
                    case Token.CATCH_SCOPE /* 62 */:
                        i = indexCount2;
                        jVar.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.z);
                        continue;
                        i7++;
                        break;
                    case Token.ENUM_INIT_KEYS /* 63 */:
                        i = indexCount2;
                        jVar.A = typedArrayObtainStyledAttributes.getFloat(index2, jVar.A);
                        continue;
                        i7++;
                        break;
                    case Token.ENUM_INIT_VALUES /* 64 */:
                        i = indexCount2;
                        kVar.a = f(typedArrayObtainStyledAttributes, index2, kVar.a);
                        continue;
                        i7++;
                        break;
                    case Token.ENUM_INIT_ARRAY /* 65 */:
                        i = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            kVar.getClass();
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            kVar.getClass();
                        }
                        i7++;
                        break;
                    case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                        i = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        kVar.getClass();
                        continue;
                        i7++;
                        break;
                    case Token.ENUM_NEXT /* 67 */:
                        i = indexCount2;
                        kVar.e = typedArrayObtainStyledAttributes.getFloat(index2, kVar.e);
                        break;
                    case Token.ENUM_ID /* 68 */:
                        i = indexCount2;
                        lVar.d = typedArrayObtainStyledAttributes.getFloat(index2, lVar.d);
                        break;
                    case Token.THISFN /* 69 */:
                        i = indexCount2;
                        jVar.c0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case Token.RETURN_RESULT /* 70 */:
                        i = indexCount2;
                        jVar.d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case Token.ARRAYLIT /* 71 */:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case Token.OBJECTLIT /* 72 */:
                        i = indexCount2;
                        jVar.e0 = typedArrayObtainStyledAttributes.getInt(index2, jVar.e0);
                        break;
                    case Token.GET_REF /* 73 */:
                        i = indexCount2;
                        jVar.f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.f0);
                        break;
                    case Token.SET_REF /* 74 */:
                        i = indexCount2;
                        jVar.i0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case Token.DEL_REF /* 75 */:
                        i = indexCount2;
                        jVar.m0 = typedArrayObtainStyledAttributes.getBoolean(index2, jVar.m0);
                        break;
                    case Token.REF_CALL /* 76 */:
                        i = indexCount2;
                        kVar.c = typedArrayObtainStyledAttributes.getInt(index2, kVar.c);
                        break;
                    case Token.REF_SPECIAL /* 77 */:
                        i = indexCount2;
                        jVar.j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case Token.YIELD /* 78 */:
                        i = indexCount2;
                        lVar.b = typedArrayObtainStyledAttributes.getInt(index2, lVar.b);
                        break;
                    case Token.SUPER /* 79 */:
                        i = indexCount2;
                        kVar.d = typedArrayObtainStyledAttributes.getFloat(index2, kVar.d);
                        break;
                    case Token.STRICT_SETNAME /* 80 */:
                        i = indexCount2;
                        jVar.k0 = typedArrayObtainStyledAttributes.getBoolean(index2, jVar.k0);
                        break;
                    case Token.EXP /* 81 */:
                        i = indexCount2;
                        jVar.l0 = typedArrayObtainStyledAttributes.getBoolean(index2, jVar.l0);
                        break;
                    case Token.DEFAULTNAMESPACE /* 82 */:
                        i = indexCount2;
                        kVar.b = typedArrayObtainStyledAttributes.getInteger(index2, kVar.b);
                        break;
                    case Token.ESCXMLATTR /* 83 */:
                        i = indexCount2;
                        mVar.h = f(typedArrayObtainStyledAttributes, index2, mVar.h);
                        break;
                    case Token.ESCXMLTEXT /* 84 */:
                        i = indexCount2;
                        kVar.g = typedArrayObtainStyledAttributes.getInteger(index2, kVar.g);
                        break;
                    case Token.REF_MEMBER /* 85 */:
                        i = indexCount2;
                        kVar.f = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f);
                        break;
                    case Token.REF_NS_MEMBER /* 86 */:
                        i = indexCount2;
                        int i9 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            kVar.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i9 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            kVar.h = string2;
                            if (string2.indexOf("/") > 0) {
                                kVar.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, kVar.i);
                        }
                        break;
                    case Token.REF_NAME /* 87 */:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case Token.REF_NS_NAME /* 88 */:
                    case 89:
                    case Token.TRY /* 90 */:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case Token.SEMI /* 91 */:
                        i = indexCount2;
                        jVar.p = f(typedArrayObtainStyledAttributes, index2, jVar.p);
                        break;
                    case Token.LB /* 92 */:
                        i = indexCount2;
                        jVar.q = f(typedArrayObtainStyledAttributes, index2, jVar.q);
                        break;
                    case Token.RB /* 93 */:
                        i = indexCount2;
                        jVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.K);
                        break;
                    case Token.LC /* 94 */:
                        i = indexCount2;
                        jVar.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.R);
                        break;
                    case Token.RC /* 95 */:
                        i = indexCount2;
                        g(jVar, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i7++;
                        break;
                    case Token.LP /* 96 */:
                        i = indexCount2;
                        g(jVar, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case Token.RP /* 97 */:
                        i = indexCount2;
                        jVar.n0 = typedArrayObtainStyledAttributes.getInt(index2, jVar.n0);
                        break;
                }
                i7++;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return iVar;
    }

    public static int f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    public static void g(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        h hVar;
        j jVar;
        e eVar;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 != 3) {
            if (i3 != 5) {
                dimensionPixelSize = typedArray.getInt(i, 0);
                if (dimensionPixelSize == -4) {
                    i4 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z = false;
                }
                if (obj instanceof e) {
                    eVar = (e) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) eVar).width = i4;
                        eVar.V = z;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) eVar).height = i4;
                        eVar.W = z;
                        return;
                    }
                }
                if (obj instanceof j) {
                    jVar = (j) obj;
                    if (i2 == 0) {
                        jVar.b = i4;
                        jVar.k0 = z;
                        return;
                    } else {
                        jVar.c = i4;
                        jVar.l0 = z;
                        return;
                    }
                }
                if (obj instanceof h) {
                    hVar = (h) obj;
                    if (i2 == 0) {
                        hVar.b(23, i4);
                        hVar.d(80, z);
                        return;
                    } else {
                        hVar.b(21, i4);
                        hVar.d(81, z);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
            z = false;
            i4 = dimensionPixelSize;
            if (obj instanceof e) {
                eVar = (e) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) eVar).width = i4;
                    eVar.V = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) eVar).height = i4;
                    eVar.W = z;
                    return;
                }
            }
            if (obj instanceof j) {
                jVar = (j) obj;
                if (i2 == 0) {
                    jVar.b = i4;
                    jVar.k0 = z;
                    return;
                } else {
                    jVar.c = i4;
                    jVar.l0 = z;
                    return;
                }
            }
            if (obj instanceof h) {
                hVar = (h) obj;
                if (i2 == 0) {
                    hVar.b(23, i4);
                    hVar.d(80, z);
                    return;
                } else {
                    hVar.b(21, i4);
                    hVar.d(81, z);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof e) {
                    e eVar2 = (e) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) eVar2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) eVar2).height = 0;
                    }
                    h(eVar2, strTrim2);
                    return;
                }
                if (obj instanceof j) {
                    ((j) obj).x = strTrim2;
                    return;
                } else {
                    if (obj instanceof h) {
                        ((h) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f2 = Float.parseFloat(strTrim2);
                    if (obj instanceof e) {
                        e eVar3 = (e) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) eVar3).width = 0;
                            eVar3.G = f2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) eVar3).height = 0;
                            eVar3.H = f2;
                            return;
                        }
                    }
                    if (obj instanceof j) {
                        j jVar2 = (j) obj;
                        if (i2 == 0) {
                            jVar2.b = 0;
                            jVar2.T = f2;
                            return;
                        } else {
                            jVar2.c = 0;
                            jVar2.S = f2;
                            return;
                        }
                    }
                    if (obj instanceof h) {
                        h hVar2 = (h) obj;
                        if (i2 == 0) {
                            hVar2.b(23, 0);
                            hVar2.a(39, f2);
                            return;
                        } else {
                            hVar2.b(21, 0);
                            hVar2.a(40, f2);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof e) {
                        e eVar4 = (e) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) eVar4).width = 0;
                            eVar4.Q = fMax;
                            eVar4.K = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) eVar4).height = 0;
                            eVar4.R = fMax;
                            eVar4.L = 2;
                            return;
                        }
                    }
                    if (obj instanceof j) {
                        j jVar3 = (j) obj;
                        if (i2 == 0) {
                            jVar3.b = 0;
                            jVar3.c0 = fMax;
                            jVar3.W = 2;
                            return;
                        } else {
                            jVar3.c = 0;
                            jVar3.d0 = fMax;
                            jVar3.X = 2;
                            return;
                        }
                    }
                    if (obj instanceof h) {
                        h hVar3 = (h) obj;
                        if (i2 == 0) {
                            hVar3.b(23, 0);
                            hVar3.b(54, 2);
                        } else {
                            hVar3.b(21, 0);
                            hVar3.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void h(e eVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i2 = i;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f2 = Float.parseFloat(strSubstring3);
                        float f3 = Float.parseFloat(strSubstring4);
                        if (f2 > 0.0f && f3 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(f3 / f2);
                            } else {
                                Math.abs(f2 / f3);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        eVar.F = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        HashMap map;
        String resourceEntryName;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = nVar.c;
        HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (nVar.b && id == -1) {
                    org.mozilla.javascript.c.b("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (id != -1) {
                    if (map2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        i iVar = (i) map2.get(Integer.valueOf(id));
                        if (iVar != null) {
                            l lVar = iVar.b;
                            j jVar = iVar.d;
                            m mVar = iVar.e;
                            if (childAt instanceof a) {
                                jVar.g0 = 1;
                                a aVar = (a) childAt;
                                aVar.setId(id);
                                aVar.setType(jVar.e0);
                                aVar.setMargin(jVar.f0);
                                aVar.setAllowsGoneWidget(jVar.m0);
                                int[] iArr = jVar.h0;
                                if (iArr != null) {
                                    aVar.setReferencedIds(iArr);
                                } else {
                                    String str = jVar.i0;
                                    if (str != null) {
                                        int[] iArrC = c(aVar, str);
                                        jVar.h0 = iArrC;
                                        aVar.setReferencedIds(iArrC);
                                    }
                                }
                            }
                            e eVar = (e) childAt.getLayoutParams();
                            eVar.a();
                            iVar.a(eVar);
                            HashMap map3 = iVar.f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map3.keySet()) {
                                b bVar = (b) map3.get(str2);
                                HashSet hashSet3 = hashSet2;
                                String strH = !bVar.a ? androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("set", str2) : str2;
                                int i3 = i2;
                                try {
                                    int iE = androidx.constraintlayout.core.g.e(bVar.b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (iE) {
                                        case 0:
                                            map = map3;
                                            cls.getMethod(strH, cls3).invoke(childAt, Integer.valueOf(bVar.c));
                                            break;
                                        case 1:
                                            map = map3;
                                            cls.getMethod(strH, cls2).invoke(childAt, Float.valueOf(bVar.d));
                                            break;
                                        case 2:
                                            map = map3;
                                            cls.getMethod(strH, cls3).invoke(childAt, Integer.valueOf(bVar.g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(strH, Drawable.class);
                                            map = map3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(bVar.g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x(" Custom Attribute \"", str2, "\" not found on ");
                                                sbX.append(cls.getName());
                                                Log.e("TransitionLayout", sbX.toString());
                                                e.printStackTrace();
                                            } catch (NoSuchMethodException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strH);
                                            } catch (InvocationTargetException e4) {
                                                e = e4;
                                                StringBuilder sbX2 = androidx.privacysandbox.ads.adservices.java.internal.a.x(" Custom Attribute \"", str2, "\" not found on ");
                                                sbX2.append(cls.getName());
                                                Log.e("TransitionLayout", sbX2.toString());
                                                e.printStackTrace();
                                            }
                                            break;
                                        case 4:
                                            cls.getMethod(strH, CharSequence.class).invoke(childAt, bVar.e);
                                            map = map3;
                                            break;
                                        case 5:
                                            cls.getMethod(strH, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar.f));
                                            map = map3;
                                            break;
                                        case 6:
                                            cls.getMethod(strH, cls2).invoke(childAt, Float.valueOf(bVar.d));
                                            map = map3;
                                            break;
                                        case 7:
                                            cls.getMethod(strH, cls3).invoke(childAt, Integer.valueOf(bVar.c));
                                            map = map3;
                                            break;
                                        default:
                                            map = map3;
                                            break;
                                    }
                                } catch (IllegalAccessException e5) {
                                    e = e5;
                                    map = map3;
                                } catch (NoSuchMethodException e6) {
                                    e = e6;
                                    map = map3;
                                } catch (InvocationTargetException e7) {
                                    e = e7;
                                    map = map3;
                                }
                                hashSet2 = hashSet3;
                                i2 = i3;
                                map3 = map;
                            }
                            hashSet = hashSet2;
                            i = i2;
                            childAt.setLayoutParams(eVar);
                            if (lVar.b == 0) {
                                childAt.setVisibility(lVar.a);
                            }
                            childAt.setAlpha(lVar.c);
                            childAt.setRotation(mVar.a);
                            childAt.setRotationX(mVar.b);
                            childAt.setRotationY(mVar.c);
                            childAt.setScaleX(mVar.d);
                            childAt.setScaleY(mVar.e);
                            if (mVar.h != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(mVar.h);
                                if (viewFindViewById != null) {
                                    float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                    float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left = right - childAt.getLeft();
                                        float top = bottom - childAt.getTop();
                                        childAt.setPivotX(left);
                                        childAt.setPivotY(top);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(mVar.f)) {
                                    childAt.setPivotX(mVar.f);
                                }
                                if (!Float.isNaN(mVar.g)) {
                                    childAt.setPivotY(mVar.g);
                                }
                            }
                            childAt.setTranslationX(mVar.i);
                            childAt.setTranslationY(mVar.j);
                            childAt.setTranslationZ(mVar.k);
                            if (mVar.l) {
                                childAt.setElevation(mVar.m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i2;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i2 = i + 1;
                nVar = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i = i2;
            i2 = i + 1;
            nVar = this;
            hashSet2 = hashSet;
        }
        for (Integer num : hashSet2) {
            i iVar2 = (i) map2.get(num);
            if (iVar2 != null) {
                j jVar2 = iVar2.d;
                if (jVar2.g0 == 1) {
                    Context context = constraintLayout.getContext();
                    a aVar2 = new a(context);
                    aVar2.e = new int[32];
                    aVar2.D = new HashMap();
                    aVar2.z = context;
                    androidx.constraintlayout.core.widgets.a aVar3 = new androidx.constraintlayout.core.widgets.a();
                    aVar3.r0 = 0;
                    aVar3.s0 = true;
                    aVar3.t0 = 0;
                    aVar3.u0 = false;
                    aVar2.G = aVar3;
                    aVar2.A = aVar3;
                    aVar2.i();
                    aVar2.setVisibility(8);
                    aVar2.setId(num.intValue());
                    int[] iArr2 = jVar2.h0;
                    if (iArr2 != null) {
                        aVar2.setReferencedIds(iArr2);
                    } else {
                        String str3 = jVar2.i0;
                        if (str3 != null) {
                            int[] iArrC2 = c(aVar2, str3);
                            jVar2.h0 = iArrC2;
                            aVar2.setReferencedIds(iArrC2);
                        }
                    }
                    aVar2.setType(jVar2.e0);
                    aVar2.setMargin(jVar2.f0);
                    e eVarA = ConstraintLayout.a();
                    aVar2.i();
                    iVar2.a(eVarA);
                    constraintLayout.addView(aVar2, eVarA);
                }
                if (jVar2.a) {
                    View pVar = new p(constraintLayout.getContext());
                    pVar.setId(num.intValue());
                    e eVarA2 = ConstraintLayout.a();
                    iVar2.a(eVarA2);
                    constraintLayout.addView(pVar, eVarA2);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = constraintLayout.getChildAt(i4);
            if (childAt2 instanceof c) {
                ((c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        HashMap map2;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = nVar.c;
        map3.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            e eVar = (e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.b && id == -1) {
                org.mozilla.javascript.c.b("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!map3.containsKey(Integer.valueOf(id))) {
                map3.put(Integer.valueOf(id), new i());
            }
            i iVar = (i) map3.get(Integer.valueOf(id));
            if (iVar == null) {
                i = childCount;
                map = map3;
            } else {
                l lVar = iVar.b;
                j jVar = iVar.d;
                m mVar = iVar.e;
                HashMap map4 = new HashMap();
                Class<?> cls = childAt.getClass();
                HashMap map5 = nVar.a;
                for (String str : map5.keySet()) {
                    b bVar = (b) map5.get(str);
                    int i3 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2 = map3;
                            try {
                                map4.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                e.printStackTrace();
                            } catch (NoSuchMethodException e3) {
                                e = e3;
                                e.printStackTrace();
                            } catch (InvocationTargetException e4) {
                                e = e4;
                                e.printStackTrace();
                            }
                        } else {
                            map2 = map3;
                            map4.put(str, new b(bVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e5) {
                        e = e5;
                        map2 = map3;
                    } catch (NoSuchMethodException e6) {
                        e = e6;
                        map2 = map3;
                    } catch (InvocationTargetException e7) {
                        e = e7;
                        map2 = map3;
                    }
                    childCount = i3;
                    map3 = map2;
                }
                i = childCount;
                map = map3;
                iVar.f = map4;
                iVar.a = id;
                jVar.g = eVar.d;
                jVar.h = eVar.e;
                jVar.i = eVar.f;
                jVar.j = eVar.g;
                jVar.k = eVar.h;
                jVar.l = eVar.i;
                jVar.m = eVar.j;
                jVar.n = eVar.k;
                jVar.o = eVar.l;
                jVar.p = eVar.m;
                jVar.q = eVar.n;
                jVar.r = eVar.r;
                jVar.s = eVar.s;
                jVar.t = eVar.t;
                jVar.u = eVar.u;
                jVar.v = eVar.D;
                jVar.w = eVar.E;
                jVar.x = eVar.F;
                jVar.y = eVar.o;
                jVar.z = eVar.p;
                jVar.A = eVar.q;
                jVar.B = eVar.S;
                jVar.C = eVar.T;
                jVar.D = eVar.U;
                jVar.f = eVar.c;
                jVar.d = eVar.a;
                jVar.e = eVar.b;
                jVar.b = ((ViewGroup.MarginLayoutParams) eVar).width;
                jVar.c = ((ViewGroup.MarginLayoutParams) eVar).height;
                jVar.E = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                jVar.F = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                jVar.G = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                jVar.H = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                jVar.K = eVar.C;
                jVar.S = eVar.H;
                jVar.T = eVar.G;
                jVar.V = eVar.J;
                jVar.U = eVar.I;
                jVar.k0 = eVar.V;
                jVar.l0 = eVar.W;
                jVar.W = eVar.K;
                jVar.X = eVar.L;
                jVar.Y = eVar.O;
                jVar.Z = eVar.P;
                jVar.a0 = eVar.M;
                jVar.b0 = eVar.N;
                jVar.c0 = eVar.Q;
                jVar.d0 = eVar.R;
                jVar.j0 = eVar.X;
                jVar.M = eVar.w;
                jVar.O = eVar.y;
                jVar.L = eVar.v;
                jVar.N = eVar.x;
                jVar.Q = eVar.z;
                jVar.P = eVar.A;
                jVar.R = eVar.B;
                jVar.n0 = eVar.Y;
                jVar.I = eVar.getMarginEnd();
                jVar.J = eVar.getMarginStart();
                lVar.a = childAt.getVisibility();
                lVar.c = childAt.getAlpha();
                mVar.a = childAt.getRotation();
                mVar.b = childAt.getRotationX();
                mVar.c = childAt.getRotationY();
                mVar.d = childAt.getScaleX();
                mVar.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f = pivotX;
                    mVar.g = pivotY;
                }
                mVar.i = childAt.getTranslationX();
                mVar.j = childAt.getTranslationY();
                mVar.k = childAt.getTranslationZ();
                if (mVar.l) {
                    mVar.m = childAt.getElevation();
                }
                if (childAt instanceof a) {
                    a aVar = (a) childAt;
                    jVar.m0 = aVar.getAllowsGoneWidget();
                    jVar.h0 = aVar.getReferencedIds();
                    jVar.e0 = aVar.getType();
                    jVar.f0 = aVar.getMargin();
                }
            }
            i2++;
            nVar = this;
            childCount = i;
            map3 = map;
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    i iVarD = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        iVarD.d.a = true;
                    }
                    this.c.put(Integer.valueOf(iVarD.a), iVarD);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
