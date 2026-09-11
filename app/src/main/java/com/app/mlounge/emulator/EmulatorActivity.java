package com.app.mlounge.emulator;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.p;
import androidx.compose.animation.core.g0;
import com.app.mlounge.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.o;
import kotlin.text.r;
import kotlin.y;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class EmulatorActivity extends p {
    public static final int $stable = 8;
    public static final k Companion = new k();
    private static final String DEFAULT_CORE = "libsnes9x_libretro_android.so";
    private static final String EXTRA_CORE_NAME = "core_name";
    private static final String EXTRA_GAME_TITLE = "game_title";
    private static final String EXTRA_ROM_PATH = "rom_path";
    private static final String TAG = "EmulatorActivity";
    private boolean autoLoadSave;
    private boolean autoSaveEnabled;
    private Thread autoSaveThread;
    private b controlsOverlay;
    private LibretroCore core;
    private GLSurfaceView glSurfaceView;
    private ImageButton menuButtonView;
    private volatile boolean pendingAutoSave;
    private EmulatorRenderer renderer;
    private boolean running;
    private boolean vibrationEnabled;
    private Vibrator vibrator;
    private final boolean[] buttonState = new boolean[12];
    private final Map<Integer, Integer> keyMapping = new LinkedHashMap();
    private String aspectRatio = "fit";
    private boolean showTouchControls = true;
    private float controlsOpacity = 0.5f;

    private final void checkSelectStartCombo() {
        boolean[] zArr = this.buttonState;
        if (zArr[2] && zArr[3]) {
            zArr[2] = false;
            zArr[3] = false;
            runOnUiThread(new e(this, 0));
        }
    }

    private final String getRomName() {
        String stringExtra = getIntent().getStringExtra(EXTRA_ROM_PATH);
        if (stringExtra != null) {
            return kotlin.io.j.z(new File(stringExtra));
        }
        return null;
    }

    private final boolean isFromGamepad(KeyEvent keyEvent) {
        int source = keyEvent.getSource();
        return (source & 1025) == 1025 || (source & 16777232) == 16777232;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void loadKeyMapping(String str) {
        int i;
        this.keyMapping.clear();
        if (kotlin.text.k.d0(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            itKeys.getClass();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                int i2 = jSONObject.getInt(next);
                if (next != null) {
                    switch (next.hashCode()) {
                        case -1496764728:
                            if (next.equals("BUTTON_UP")) {
                                i = 4;
                            }
                            break;
                        case -1448907095:
                            if (next.equals("BUTTON_SELECT")) {
                                i = 2;
                            }
                            break;
                        case -325377420:
                            if (next.equals("BUTTON_A")) {
                                i = 8;
                            }
                            break;
                        case -325377419:
                            if (next.equals("BUTTON_B")) {
                                i = 0;
                            }
                            break;
                        case -325377409:
                            if (next.equals("BUTTON_L")) {
                                i = 10;
                            }
                            break;
                        case -325377403:
                            if (next.equals("BUTTON_R")) {
                                i = 11;
                            }
                            break;
                        case -325377397:
                            if (next.equals("BUTTON_X")) {
                                i = 9;
                            }
                            break;
                        case -325377396:
                            if (next.equals("BUTTON_Y")) {
                                i = 1;
                            }
                            break;
                        case 229546671:
                            if (next.equals("BUTTON_RIGHT")) {
                                i = 7;
                            }
                            break;
                        case 230792437:
                            if (next.equals("BUTTON_START")) {
                                i = 3;
                            }
                            break;
                        case 422635919:
                            if (next.equals("BUTTON_DOWN")) {
                                i = 5;
                            }
                            break;
                        case 422864116:
                            if (next.equals("BUTTON_LEFT")) {
                                i = 6;
                            }
                            break;
                        default:
                            continue;
                    }
                    this.keyMapping.put(Integer.valueOf(i2), Integer.valueOf(i));
                }
            }
        } catch (Exception unused) {
        }
    }

    private final void loadSettings() {
        SharedPreferences sharedPreferences = getSharedPreferences("emu_prefs", 0);
        String string = sharedPreferences.getString("emu_aspect_ratio", "fit");
        this.aspectRatio = string != null ? string : "fit";
        this.showTouchControls = sharedPreferences.getBoolean("emu_show_touch_controls", true);
        this.controlsOpacity = sharedPreferences.getFloat("emu_controls_opacity", 0.5f);
        this.autoSaveEnabled = sharedPreferences.getBoolean("emu_auto_save", false);
        this.vibrationEnabled = false;
        this.autoLoadSave = sharedPreferences.getBoolean("emu_auto_load_save", false);
        String string2 = sharedPreferences.getString("emu_key_mapping", "");
        loadKeyMapping(string2 != null ? string2 : "");
    }

    private final void loadStateFromFile() {
        String romName = getRomName();
        if (romName == null) {
            return;
        }
        File file = new File(getFilesDir(), androidx.privacysandbox.ads.adservices.java.internal.a.q("saves/", romName, ".state"));
        if (file.exists()) {
            LibretroCore libretroCore = this.core;
            if (libretroCore != null) {
                libretroCore.loadState(kotlin.io.j.A(file));
            } else {
                kotlin.jvm.internal.l.f("core");
                throw null;
            }
        }
    }

    private final Integer mapKeyToButton(int i) {
        Integer num = this.keyMapping.get(Integer.valueOf(i));
        if (num != null) {
            return Integer.valueOf(num.intValue());
        }
        if (i != 29) {
            if (i != 30) {
                if (i != 52) {
                    if (i != 53) {
                        if (i != 62) {
                            if (i != 66) {
                                if (i != 96) {
                                    if (i != 97) {
                                        if (i != 99) {
                                            if (i != 100) {
                                                if (i == 102) {
                                                    return 10;
                                                }
                                                if (i == 103) {
                                                    return 11;
                                                }
                                                if (i != 108) {
                                                    if (i != 109) {
                                                        switch (i) {
                                                            case 19:
                                                                return 4;
                                                            case 20:
                                                                return 5;
                                                            case 21:
                                                                return 6;
                                                            case 22:
                                                                return 7;
                                                            default:
                                                                return null;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return 3;
                        }
                        return 2;
                    }
                    return 1;
                }
                return 9;
            }
            return 0;
        }
        return 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onCreate$lambda$0(EmulatorActivity emulatorActivity) {
        int length = emulatorActivity.buttonState.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (emulatorActivity.buttonState[i2]) {
                i |= 1 << i2;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y onCreate$lambda$1(EmulatorActivity emulatorActivity) throws IOException {
        if (emulatorActivity.pendingAutoSave) {
            emulatorActivity.pendingAutoSave = false;
            emulatorActivity.saveStateToFile();
        }
        return y.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y onCreate$lambda$3(EmulatorActivity emulatorActivity, int i, boolean z) {
        if (i >= 0) {
            boolean[] zArr = emulatorActivity.buttonState;
            if (i < zArr.length) {
                zArr[i] = z;
                if (z && emulatorActivity.vibrationEnabled) {
                    emulatorActivity.vibrate();
                }
            }
        }
        return y.a;
    }

    private final void saveStateToFile() throws IOException {
        String romName;
        LibretroCore libretroCore = this.core;
        if (libretroCore == null) {
            kotlin.jvm.internal.l.f("core");
            throw null;
        }
        byte[] bArrSaveState = libretroCore.saveState();
        if (bArrSaveState == null || (romName = getRomName()) == null) {
            return;
        }
        new File(getFilesDir(), "saves").mkdirs();
        FileOutputStream fileOutputStream = new FileOutputStream(new File(getFilesDir(), androidx.privacysandbox.ads.adservices.java.internal.a.q("saves/", romName, ".state")));
        try {
            fileOutputStream.write(bArrSaveState);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                com.google.common.base.b.d(fileOutputStream, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMenu() {
        float f = getResources().getDisplayMetrics().density;
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        int i = (int) (24 * f);
        float f2 = 16 * f;
        int i2 = (int) f2;
        linearLayout.setPadding(i, i, i, i2);
        linearLayout.setMinimumWidth((int) (280 * f));
        TextView textView = new TextView(this);
        textView.setText(textView.getContext().getString(R.string.emulator_menu));
        textView.setTextColor(-1);
        textView.setTextSize(18.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = (int) (20 * f);
        linearLayout.addView(textView, layoutParams);
        List<kotlin.k> listQ = com.google.common.base.c.q(new kotlin.k("Save State", new f(this, 2)), new kotlin.k("Load State", new f(this, 3)), new kotlin.k("Reset", new f(this, 4)), new kotlin.k("Quit", new f(this, 5)));
        final AlertDialog alertDialogCreate = new AlertDialog.Builder(this).create();
        ArrayList arrayList = new ArrayList();
        for (kotlin.k kVar : listQ) {
            String str = (String) kVar.e;
            final kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) kVar.y;
            final GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Color.argb(255, 40, 40, 45));
            float f3 = 12 * f;
            gradientDrawable.setCornerRadius(f3);
            final GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(Color.argb(255, 60, 60, 70));
            gradientDrawable2.setCornerRadius(f3);
            gradientDrawable2.setStroke((int) (2 * f), Color.argb(255, 100, 140, 255));
            final LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(16);
            linearLayout2.setBackground(gradientDrawable);
            int i3 = (int) (14 * f);
            linearLayout2.setPadding(i2, i3, i2, i3);
            linearLayout2.setClickable(true);
            linearLayout2.setFocusable(true);
            linearLayout2.setFocusableInTouchMode(true);
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.app.mlounge.emulator.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EmulatorActivity.showMenu$lambda$9$0(alertDialogCreate, aVar, view);
                }
            });
            linearLayout2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.app.mlounge.emulator.i
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    EmulatorActivity.showMenu$lambda$9$1(linearLayout2, gradientDrawable2, gradientDrawable, view, z);
                }
            });
            linearLayout2.setOnKeyListener(new View.OnKeyListener() { // from class: com.app.mlounge.emulator.j
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
                    return EmulatorActivity.showMenu$lambda$9$2(alertDialogCreate, aVar, view, i4, keyEvent);
                }
            });
            TextView textView2 = new TextView(this);
            textView2.setText(str);
            textView2.setTextColor(-1);
            textView2.setTextSize(16.0f);
            linearLayout2.addView(textView2, new LinearLayout.LayoutParams(0, -2, 1.0f));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.bottomMargin = (int) (8 * f);
            linearLayout.addView(linearLayout2, layoutParams2);
            arrayList.add(linearLayout2);
        }
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(Color.argb(255, 50, 50, 55));
        float f4 = 12 * f;
        gradientDrawable3.setCornerRadius(f4);
        gradientDrawable3.setStroke((int) (2 * f), Color.argb(255, 100, 140, 255));
        TextView textView3 = new TextView(this);
        textView3.setText(textView3.getContext().getString(R.string.cancel));
        textView3.setTextColor(Color.argb(180, 180, 180, 180));
        textView3.setTextSize(14.0f);
        textView3.setGravity(17);
        textView3.setPadding(0, (int) f4, 0, (int) (4 * f));
        textView3.setFocusable(true);
        textView3.setFocusableInTouchMode(true);
        textView3.setOnClickListener(new androidx.media3.ui.h(alertDialogCreate, 6));
        textView3.setOnFocusChangeListener(new c(gradientDrawable3, 0));
        textView3.setOnKeyListener(new View.OnKeyListener() { // from class: com.app.mlounge.emulator.d
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
                return EmulatorActivity.showMenu$lambda$13$2(alertDialogCreate, view, i4, keyEvent);
            }
        });
        linearLayout.addView(textView3, new LinearLayout.LayoutParams(-1, -2));
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setColor(Color.argb(255, 30, 30, 35));
        gradientDrawable4.setCornerRadius(f2);
        alertDialogCreate.setView(linearLayout);
        Window window = alertDialogCreate.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new InsetDrawable((Drawable) gradientDrawable4, i2));
        }
        alertDialogCreate.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.app.mlounge.emulator.g
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
                return EmulatorActivity.showMenu$lambda$15(alertDialogCreate, dialogInterface, i4, keyEvent);
            }
        });
        alertDialogCreate.show();
        LinearLayout linearLayout3 = (LinearLayout) o.M(arrayList);
        if (linearLayout3 != null) {
            linearLayout3.requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showMenu$lambda$13$1(GradientDrawable gradientDrawable, View view, boolean z) {
        view.setBackgroundColor(0);
        if (!z) {
            gradientDrawable = null;
        }
        view.setBackground(gradientDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showMenu$lambda$13$2(AlertDialog alertDialog, View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        if (i != 4) {
            if (i == 23 || i == 96) {
                alertDialog.dismiss();
                return true;
            }
            if (i != 97) {
                return false;
            }
        }
        alertDialog.dismiss();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showMenu$lambda$15(AlertDialog alertDialog, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        if (i != 97 && i != 4) {
            return false;
        }
        alertDialog.dismiss();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y showMenu$lambda$3(EmulatorActivity emulatorActivity) throws IOException {
        emulatorActivity.saveStateToFile();
        return y.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y showMenu$lambda$4(EmulatorActivity emulatorActivity) {
        emulatorActivity.loadStateFromFile();
        return y.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y showMenu$lambda$5(EmulatorActivity emulatorActivity) {
        LibretroCore libretroCore = emulatorActivity.core;
        if (libretroCore != null) {
            libretroCore.reset();
            return y.a;
        }
        kotlin.jvm.internal.l.f("core");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y showMenu$lambda$6(EmulatorActivity emulatorActivity) {
        emulatorActivity.finish();
        return y.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showMenu$lambda$9$0(AlertDialog alertDialog, kotlin.jvm.functions.a aVar, View view) {
        alertDialog.dismiss();
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showMenu$lambda$9$1(LinearLayout linearLayout, GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2, View view, boolean z) {
        if (!z) {
            gradientDrawable = gradientDrawable2;
        }
        linearLayout.setBackground(gradientDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showMenu$lambda$9$2(AlertDialog alertDialog, kotlin.jvm.functions.a aVar, View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        if (i != 4) {
            if (i == 23 || i == 96) {
                alertDialog.dismiss();
                aVar.invoke();
                return true;
            }
            if (i != 97) {
                return false;
            }
        }
        alertDialog.dismiss();
        return true;
    }

    private final void startAutoSave() {
        Thread thread = new Thread(new e(this, 1), "AutoSaveThread");
        thread.setDaemon(true);
        thread.start();
        this.autoSaveThread = thread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAutoSave$lambda$0(EmulatorActivity emulatorActivity) {
        while (emulatorActivity.running) {
            try {
                Thread.sleep(60000L);
                if (emulatorActivity.running) {
                    emulatorActivity.pendingAutoSave = true;
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    private final void verifyRomFile(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                kotlin.o oVar = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.a(TAG, "ROM file does not exist: " + str);
                return;
            }
            long length = file.length();
            long j = length / ((long) 1048576);
            kotlin.o oVar2 = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.d(TAG, "ROM file verified: " + str);
            com.app.mlounge.util.a.d(TAG, "  Size: " + length + " bytes (" + j + " MB)");
            boolean zCanRead = file.canRead();
            StringBuilder sb = new StringBuilder("  Readable: ");
            sb.append(zCanRead);
            com.app.mlounge.util.a.d(TAG, sb.toString());
            com.app.mlounge.util.a.d(TAG, "  Absolute path: " + file.getAbsolutePath());
            if (length == 0) {
                com.app.mlounge.util.a.f(TAG, "WARNING: ROM file is empty (0 bytes)");
            }
            if (length < 1048576) {
                com.app.mlounge.util.a.f(TAG, "WARNING: ROM file is very small (" + j + " MB), may be corrupted or incomplete");
            }
            if (!r.H(str, ".iso", true) || length >= 734003200) {
                return;
            }
            com.app.mlounge.util.a.f(TAG, "WARNING: PSP ISO is smaller than typical (" + j + " MB), may be incomplete");
        } catch (Exception e) {
            kotlin.o oVar3 = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.b(TAG, "Error verifying ROM: " + e.getMessage(), e);
        }
    }

    private final void vibrate() {
        int i = Build.VERSION.SDK_INT;
        Vibrator vibrator = this.vibrator;
        if (i >= 26) {
            if (vibrator != null) {
                vibrator.vibrate(VibrationEffect.createOneShot(20L, -1));
            }
        } else if (vibrator != null) {
            vibrator.vibrate(20L);
        }
    }

    @Override // androidx.activity.p, androidx.core.app.b, android.app.Activity
    public void onCreate(Bundle bundle) {
        Vibrator defaultVibrator;
        super.onCreate(bundle);
        getWindow().addFlags(128);
        getWindow().getDecorView().setSystemUiVisibility(4102);
        int i = 1;
        getOnBackPressedDispatcher().a(new l(true), this);
        loadSettings();
        if (Build.VERSION.SDK_INT >= 31) {
            Object systemService = getSystemService("vibrator_manager");
            systemService.getClass();
            defaultVibrator = ((VibratorManager) systemService).getDefaultVibrator();
        } else {
            Object systemService2 = getSystemService("vibrator");
            systemService2.getClass();
            defaultVibrator = (Vibrator) systemService2;
        }
        this.vibrator = defaultVibrator;
        String stringExtra = getIntent().getStringExtra(EXTRA_ROM_PATH);
        String stringExtra2 = getIntent().getStringExtra(EXTRA_GAME_TITLE);
        if (stringExtra2 == null) {
            stringExtra2 = "Game";
        }
        if (stringExtra == null || kotlin.text.k.d0(stringExtra) || !new File(stringExtra).exists()) {
            kotlin.o oVar = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a(TAG, "ROM not found: " + stringExtra);
            finish();
            return;
        }
        verifyRomFile(stringExtra);
        String stringExtra3 = getIntent().getStringExtra(EXTRA_CORE_NAME);
        if (stringExtra3 == null) {
            stringExtra3 = DEFAULT_CORE;
        }
        int i2 = 0;
        if (kotlin.text.k.T(stringExtra3, "ppsspp", true)) {
            SharedPreferences sharedPreferences = getSharedPreferences("ppsspp_prefs", 0);
            if (sharedPreferences.getBoolean("ppsspp_assets_bootstrapped", false)) {
                kotlin.o oVar2 = com.app.mlounge.util.a.a;
            } else {
                kotlin.o oVar3 = com.app.mlounge.util.a.a;
                try {
                    File file = new File(getFilesDir(), "system/PPSSPP");
                    file.mkdirs();
                    File file2 = new File(file, "lang");
                    file2.mkdirs();
                    org.jsoup.helper.n.j(this, "ppsspp/lang/en_US.ini", new File(file2, "en_US.ini"));
                    org.jsoup.helper.n.j(this, "ppsspp/ppge_atlas.zim", new File(file, "ppge_atlas.zim"));
                    File file3 = new File(file, "vfpu");
                    file3.mkdirs();
                    org.jsoup.helper.n.j(this, "ppsspp/vfpu/vfpu_sin_lut8192.dat", new File(file3, "vfpu_sin_lut8192.dat"));
                    org.jsoup.helper.n.j(this, "ppsspp/compat.ini", new File(file, "compat.ini"));
                    sharedPreferences.edit().putBoolean("ppsspp_assets_bootstrapped", true).apply();
                    com.app.mlounge.util.a.d("PPSSPPAssets", "PPSSPP assets bootstrapped successfully");
                } catch (Exception e) {
                    kotlin.o oVar4 = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.b("PPSSPPAssets", "Failed to bootstrap PPSSPP assets: " + e.getMessage(), e);
                }
            }
        }
        this.core = new LibretroCore(this);
        String absolutePath = new File(getApplicationInfo().nativeLibraryDir, stringExtra3).getAbsolutePath();
        LibretroCore libretroCore = this.core;
        if (libretroCore == null) {
            kotlin.jvm.internal.l.f("core");
            throw null;
        }
        absolutePath.getClass();
        if (!libretroCore.initCore(absolutePath)) {
            com.app.mlounge.util.a.a(TAG, "Failed to init core");
            finish();
            return;
        }
        LibretroCore libretroCore2 = this.core;
        if (libretroCore2 == null) {
            kotlin.jvm.internal.l.f("core");
            throw null;
        }
        if (!libretroCore2.loadGame(stringExtra)) {
            com.app.mlounge.util.a.a(TAG, "Failed to load game");
            LibretroCore libretroCore3 = this.core;
            if (libretroCore3 == null) {
                kotlin.jvm.internal.l.f("core");
                throw null;
            }
            libretroCore3.shutdown();
            finish();
            return;
        }
        String strZ = kotlin.io.j.z(new File(stringExtra));
        File file4 = new File(getFilesDir(), androidx.privacysandbox.ads.adservices.java.internal.a.q("saves/", strZ, ".srm"));
        if (file4.exists()) {
            LibretroCore libretroCore4 = this.core;
            if (libretroCore4 == null) {
                kotlin.jvm.internal.l.f("core");
                throw null;
            }
            libretroCore4.setSRAM(kotlin.io.j.A(file4));
        }
        if (this.autoLoadSave) {
            File file5 = new File(getFilesDir(), androidx.privacysandbox.ads.adservices.java.internal.a.q("saves/", strZ, ".state"));
            if (file5.exists()) {
                LibretroCore libretroCore5 = this.core;
                if (libretroCore5 == null) {
                    kotlin.jvm.internal.l.f("core");
                    throw null;
                }
                libretroCore5.loadState(kotlin.io.j.A(file5));
            }
        }
        LibretroCore libretroCore6 = this.core;
        if (libretroCore6 == null) {
            kotlin.jvm.internal.l.f("core");
            throw null;
        }
        EmulatorRenderer emulatorRenderer = new EmulatorRenderer(libretroCore6, new f(this, i2), new f(this, i));
        this.renderer = emulatorRenderer;
        emulatorRenderer.setAspectRatioMode(this.aspectRatio);
        GLSurfaceView gLSurfaceView = new GLSurfaceView(this);
        gLSurfaceView.setEGLContextClientVersion(2);
        EmulatorRenderer emulatorRenderer2 = this.renderer;
        if (emulatorRenderer2 == null) {
            kotlin.jvm.internal.l.f("renderer");
            throw null;
        }
        gLSurfaceView.setRenderer(emulatorRenderer2);
        gLSurfaceView.setRenderMode(1);
        this.glSurfaceView = gLSurfaceView;
        FrameLayout frameLayout = new FrameLayout(this);
        GLSurfaceView gLSurfaceView2 = this.glSurfaceView;
        if (gLSurfaceView2 == null) {
            kotlin.jvm.internal.l.f("glSurfaceView");
            throw null;
        }
        frameLayout.addView(gLSurfaceView2, new FrameLayout.LayoutParams(-1, -1));
        if (this.showTouchControls) {
            b bVar = new b(this, this.controlsOpacity, new g0(this, 16));
            this.controlsOverlay = bVar;
            frameLayout.addView(bVar, new FrameLayout.LayoutParams(-1, -1));
        }
        int i3 = (int) (getResources().getDisplayMetrics().density * 36);
        ImageButton imageButton = new ImageButton(this);
        imageButton.setImageResource(R.drawable.menu_glyph);
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setBackgroundColor(0);
        imageButton.setPadding(8, 8, 8, 8);
        imageButton.setAlpha(this.controlsOpacity);
        imageButton.setOnClickListener(new androidx.media3.ui.h(this, 5));
        this.menuButtonView = imageButton;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i3, 81);
        layoutParams.bottomMargin = (int) (getResources().getDisplayMetrics().heightPixels * 0.04f);
        frameLayout.addView(imageButton, layoutParams);
        setContentView(frameLayout);
        setTitle(stringExtra2);
        if (this.autoSaveEnabled) {
            startAutoSave();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() throws IOException {
        super.onDestroy();
        this.running = false;
        Thread thread = this.autoSaveThread;
        if (thread != null) {
            thread.interrupt();
        }
        String stringExtra = getIntent().getStringExtra(EXTRA_ROM_PATH);
        if (stringExtra != null) {
            String strZ = kotlin.io.j.z(new File(stringExtra));
            LibretroCore libretroCore = this.core;
            if (libretroCore == null) {
                kotlin.jvm.internal.l.f("core");
                throw null;
            }
            byte[] sram = libretroCore.getSRAM();
            if (sram != null) {
                new File(getFilesDir(), "saves").mkdirs();
                FileOutputStream fileOutputStream = new FileOutputStream(new File(getFilesDir(), androidx.privacysandbox.ads.adservices.java.internal.a.q("saves/", strZ, ".srm")));
                try {
                    fileOutputStream.write(sram);
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        com.google.common.base.b.d(fileOutputStream, th);
                        throw th2;
                    }
                }
            }
            if (this.autoSaveEnabled) {
                LibretroCore libretroCore2 = this.core;
                if (libretroCore2 == null) {
                    kotlin.jvm.internal.l.f("core");
                    throw null;
                }
                if (libretroCore2.getGameLoaded()) {
                    saveStateToFile();
                }
            }
        }
        EmulatorRenderer emulatorRenderer = this.renderer;
        if (emulatorRenderer != null) {
            emulatorRenderer.onDestroy();
        }
        LibretroCore libretroCore3 = this.core;
        if (libretroCore3 != null) {
            libretroCore3.shutdown();
        } else {
            kotlin.jvm.internal.l.f("core");
            throw null;
        }
    }

    @Override // android.app.Activity
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if ((motionEvent.getSource() & 16777232) != 16777232) {
            return super.onGenericMotionEvent(motionEvent);
        }
        float axisValue = motionEvent.getAxisValue(15);
        float axisValue2 = motionEvent.getAxisValue(16);
        boolean[] zArr = this.buttonState;
        zArr[6] = axisValue < -0.5f;
        zArr[7] = axisValue > 0.5f;
        zArr[4] = axisValue2 < -0.5f;
        zArr[5] = axisValue2 > 0.5f;
        float axisValue3 = motionEvent.getAxisValue(0);
        float axisValue4 = motionEvent.getAxisValue(1);
        float axisValue5 = motionEvent.getAxisValue(11);
        float axisValue6 = motionEvent.getAxisValue(14);
        Integer num = this.keyMapping.get(10001);
        if (num != null) {
            int iIntValue = num.intValue();
            boolean[] zArr2 = this.buttonState;
            zArr2[iIntValue] = zArr2[iIntValue] || axisValue4 < -0.5f;
        }
        Integer num2 = this.keyMapping.get(10002);
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            boolean[] zArr3 = this.buttonState;
            zArr3[iIntValue2] = zArr3[iIntValue2] || axisValue4 > 0.5f;
        }
        Integer num3 = this.keyMapping.get(10003);
        if (num3 != null) {
            int iIntValue3 = num3.intValue();
            boolean[] zArr4 = this.buttonState;
            zArr4[iIntValue3] = zArr4[iIntValue3] || axisValue3 < -0.5f;
        }
        Integer num4 = this.keyMapping.get(10004);
        if (num4 != null) {
            int iIntValue4 = num4.intValue();
            boolean[] zArr5 = this.buttonState;
            zArr5[iIntValue4] = zArr5[iIntValue4] || axisValue3 > 0.5f;
        }
        Integer num5 = this.keyMapping.get(10005);
        if (num5 != null) {
            int iIntValue5 = num5.intValue();
            boolean[] zArr6 = this.buttonState;
            zArr6[iIntValue5] = zArr6[iIntValue5] || axisValue6 < -0.5f;
        }
        Integer num6 = this.keyMapping.get(10006);
        if (num6 != null) {
            int iIntValue6 = num6.intValue();
            boolean[] zArr7 = this.buttonState;
            zArr7[iIntValue6] = zArr7[iIntValue6] || axisValue6 > 0.5f;
        }
        Integer num7 = this.keyMapping.get(10007);
        if (num7 != null) {
            int iIntValue7 = num7.intValue();
            boolean[] zArr8 = this.buttonState;
            zArr8[iIntValue7] = zArr8[iIntValue7] || axisValue5 < -0.5f;
        }
        Integer num8 = this.keyMapping.get(10008);
        if (num8 != null) {
            int iIntValue8 = num8.intValue();
            boolean[] zArr9 = this.buttonState;
            zArr9[iIntValue8] = zArr9[iIntValue8] || axisValue5 > 0.5f;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    @SuppressLint({"MissingSuperCall"})
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent != null && isFromGamepad(keyEvent)) {
            this.buttonState[2] = true;
            if (this.vibrationEnabled) {
                vibrate();
            }
            checkSelectStartCombo();
            return true;
        }
        Integer numMapKeyToButton = mapKeyToButton(i);
        if (numMapKeyToButton == null) {
            return super.onKeyDown(i, keyEvent);
        }
        int iIntValue = numMapKeyToButton.intValue();
        this.buttonState[iIntValue] = true;
        if (this.vibrationEnabled) {
            vibrate();
        }
        if (iIntValue == 2 || iIntValue == 3) {
            checkSelectStartCombo();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    @SuppressLint({"MissingSuperCall"})
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent != null && isFromGamepad(keyEvent)) {
            this.buttonState[2] = false;
            return true;
        }
        Integer numMapKeyToButton = mapKeyToButton(i);
        if (numMapKeyToButton == null) {
            return super.onKeyUp(i, keyEvent);
        }
        this.buttonState[numMapKeyToButton.intValue()] = false;
        return true;
    }

    @Override // android.app.Activity
    public void onPause() throws IOException {
        super.onPause();
        this.running = false;
        Thread thread = this.autoSaveThread;
        if (thread != null) {
            thread.interrupt();
        }
        if (this.autoSaveEnabled) {
            LibretroCore libretroCore = this.core;
            if (libretroCore == null) {
                kotlin.jvm.internal.l.f("core");
                throw null;
            }
            if (libretroCore.getGameLoaded()) {
                saveStateToFile();
            }
        }
        GLSurfaceView gLSurfaceView = this.glSurfaceView;
        if (gLSurfaceView != null) {
            gLSurfaceView.onPause();
        } else {
            kotlin.jvm.internal.l.f("glSurfaceView");
            throw null;
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.running = true;
        GLSurfaceView gLSurfaceView = this.glSurfaceView;
        if (gLSurfaceView == null) {
            kotlin.jvm.internal.l.f("glSurfaceView");
            throw null;
        }
        gLSurfaceView.onResume();
        if (this.autoSaveEnabled) {
            startAutoSave();
        }
    }
}
