package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.c2;
import androidx.media3.common.b1;
import androidx.media3.common.g1;
import androidx.media3.common.u0;
import androidx.media3.common.v0;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.c1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.mlounge.R;
import com.google.common.collect.a1;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends FrameLayout {
    public static final float[] e1;
    public final k A;
    public final Drawable A0;
    public final Class B;
    public final float B0;
    public final Method C;
    public final float C0;
    public final Method D;
    public final String D0;
    public final Class E;
    public final String E0;
    public final Method F;
    public final Drawable F0;
    public final Method G;
    public final Drawable G0;
    public final CopyOnWriteArrayList H;
    public final String H0;
    public final RecyclerView I;
    public final String I0;
    public final q J;
    public final Drawable J0;
    public final n K;
    public final Drawable K0;
    public final j L;
    public final String L0;
    public final j M;
    public final String M0;
    public final androidx.media3.exoplayer.hls.c N;
    public androidx.media3.common.q0 N0;
    public final PopupWindow O;
    public boolean O0;
    public final int P;
    public boolean P0;
    public final ImageView Q;
    public boolean Q0;
    public final ImageView R;
    public boolean R0;
    public final ImageView S;
    public boolean S0;
    public final View T;
    public boolean T0;
    public final View U;
    public int U0;
    public final TextView V;
    public boolean V0;
    public final TextView W;
    public int W0;
    public int X0;
    public long[] Y0;
    public boolean[] Z0;
    public final ImageView a0;
    public final long[] a1;
    public final ImageView b0;
    public final boolean[] b1;
    public final ImageView c0;
    public long c1;
    public final ImageView d0;
    public boolean d1;
    public final a0 e;
    public final ImageView e0;
    public final ImageView f0;
    public final View g0;
    public final View h0;
    public final View i0;
    public final TextView j0;
    public final TextView k0;
    public final o0 l0;
    public final StringBuilder m0;
    public final Formatter n0;
    public final androidx.media3.common.t0 o0;
    public final u0 p0;
    public final androidx.activity.l q0;
    public final Drawable r0;
    public final Drawable s0;
    public final Drawable t0;
    public final Drawable u0;
    public final Drawable v0;
    public final String w0;
    public final String x0;
    public final Resources y;
    public final String y0;
    public final Handler z;
    public final Drawable z0;

    static {
        androidx.media3.common.d0.a("media3.ui");
        e1 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    public v(Context context) {
        Method method;
        Method method2;
        Method method3;
        Class<?> cls;
        Method method4;
        super(context, null, 0);
        Class cls2 = Boolean.TYPE;
        int i = 0;
        this.R0 = true;
        this.U0 = 5000;
        this.X0 = 0;
        this.W0 = org.mozilla.javascript.Context.VERSION_ES6;
        LayoutInflater.from(context).inflate(R.layout.exo_player_control_view, this);
        setDescendantFocusability(262144);
        this.A = new k(this);
        this.H = new CopyOnWriteArrayList();
        this.o0 = new androidx.media3.common.t0();
        this.p0 = new u0();
        StringBuilder sb = new StringBuilder();
        this.m0 = sb;
        this.n0 = new Formatter(sb, Locale.getDefault());
        this.Y0 = new long[0];
        this.Z0 = new boolean[0];
        this.a1 = new long[0];
        this.b1 = new boolean[0];
        this.q0 = new androidx.activity.l(this, 28);
        try {
            method = ExoPlayer.class.getMethod("setScrubbingModeEnabled", cls2);
            try {
                method2 = ExoPlayer.class.getMethod("isScrubbingModeEnabled", null);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                method2 = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
            method = null;
        }
        this.B = ExoPlayer.class;
        this.C = method;
        this.D = method2;
        try {
            cls = Class.forName("androidx.media3.transformer.CompositionPlayer");
            try {
                method3 = cls.getMethod("setScrubbingModeEnabled", cls2);
                try {
                    method4 = cls.getMethod("isScrubbingModeEnabled", null);
                } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                    method4 = null;
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                method3 = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused5) {
            method3 = null;
            cls = null;
        }
        this.E = cls;
        this.F = method3;
        this.G = method4;
        this.j0 = (TextView) findViewById(R.id.exo_duration);
        this.k0 = (TextView) findViewById(R.id.exo_position);
        ImageView imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.d0 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(this.A);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.e0 = imageView2;
        h hVar = new h(this, i);
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(hVar);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.f0 = imageView3;
        h hVar2 = new h(this, i);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(hVar2);
        }
        View viewFindViewById = findViewById(R.id.exo_settings);
        this.g0 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(this.A);
        }
        View viewFindViewById2 = findViewById(R.id.exo_playback_speed);
        this.h0 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(this.A);
        }
        View viewFindViewById3 = findViewById(R.id.exo_audio_track);
        this.i0 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(this.A);
        }
        o0 o0Var = (o0) findViewById(R.id.exo_progress);
        View viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (o0Var != null) {
            this.l0 = o0Var;
        } else if (viewFindViewById4 != null) {
            g gVar = new g(context);
            gVar.setId(R.id.exo_progress);
            gVar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(gVar, iIndexOfChild);
            this.l0 = gVar;
        } else {
            this.l0 = null;
        }
        o0 o0Var2 = this.l0;
        if (o0Var2 != null) {
            k kVar = this.A;
            kVar.getClass();
            ((g) o0Var2).U.add(kVar);
        }
        this.z = androidx.media3.common.util.j0.q(null);
        Resources resources = context.getResources();
        this.y = resources;
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
        this.S = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(this.A);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_prev);
        this.Q = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_previous, context.getTheme()));
            imageView5.setOnClickListener(this.A);
        }
        ImageView imageView6 = (ImageView) findViewById(R.id.exo_next);
        this.R = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_next, context.getTheme()));
            imageView6.setOnClickListener(this.A);
        }
        ThreadLocal threadLocal = androidx.core.content.res.j.a;
        Typeface typefaceA = context.isRestricted() ? null : androidx.core.content.res.j.a(context, R.font.roboto_medium_numbers, new TypedValue(), 0, null, false, false);
        ImageView imageView7 = (ImageView) findViewById(R.id.exo_rew);
        TextView textView = (TextView) findViewById(R.id.exo_rew_with_amount);
        if (imageView7 != null) {
            imageView7.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_simple_rewind, context.getTheme()));
            this.U = imageView7;
            this.W = null;
        } else if (textView != null) {
            textView.setTypeface(typefaceA);
            this.W = textView;
            this.U = textView;
        } else {
            this.W = null;
            this.U = null;
        }
        View view = this.U;
        if (view != null) {
            view.setOnClickListener(this.A);
        }
        ImageView imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
        TextView textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_simple_fastforward, context.getTheme()));
            this.T = imageView8;
            this.V = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceA);
            this.V = textView2;
            this.T = textView2;
        } else {
            this.V = null;
            this.T = null;
        }
        View view2 = this.T;
        if (view2 != null) {
            view2.setOnClickListener(this.A);
        }
        ImageView imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.a0 = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(this.A);
        }
        ImageView imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
        this.b0 = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(this.A);
        }
        this.B0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.C0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        ImageView imageView11 = (ImageView) findViewById(R.id.exo_vr);
        this.c0 = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_vr, context.getTheme()));
            n(imageView11, false);
        }
        a0 a0Var = new a0(this);
        this.e = a0Var;
        a0Var.D = true;
        q qVar = new q(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
        this.J = qVar;
        this.P = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.I = recyclerView;
        recyclerView.setAdapter(qVar);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.O = popupWindow;
        popupWindow.setOnDismissListener(this.A);
        this.d1 = true;
        this.N = new androidx.media3.exoplayer.hls.c(getResources());
        this.F0 = resources.getDrawable(R.drawable.exo_styled_controls_subtitle_on, context.getTheme());
        this.G0 = resources.getDrawable(R.drawable.exo_styled_controls_subtitle_off, context.getTheme());
        this.H0 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.I0 = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.L = new j(this, 1);
        this.M = new j(this, 0);
        this.K = new n(this, resources.getStringArray(R.array.exo_controls_playback_speeds), e1);
        this.r0 = resources.getDrawable(R.drawable.exo_styled_controls_play, context.getTheme());
        this.s0 = resources.getDrawable(R.drawable.exo_styled_controls_pause, context.getTheme());
        this.J0 = resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_exit, context.getTheme());
        this.K0 = resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_enter, context.getTheme());
        this.t0 = resources.getDrawable(R.drawable.exo_styled_controls_repeat_off, context.getTheme());
        this.u0 = resources.getDrawable(R.drawable.exo_styled_controls_repeat_one, context.getTheme());
        this.v0 = resources.getDrawable(R.drawable.exo_styled_controls_repeat_all, context.getTheme());
        this.z0 = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_on, context.getTheme());
        this.A0 = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_off, context.getTheme());
        this.L0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.M0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.w0 = resources.getString(R.string.exo_controls_repeat_off_description);
        this.x0 = resources.getString(R.string.exo_controls_repeat_one_description);
        this.y0 = resources.getString(R.string.exo_controls_repeat_all_description);
        this.D0 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.E0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        a0Var.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        a0Var.h(this.T, true);
        a0Var.h(this.U, true);
        a0Var.h(imageView5, true);
        a0Var.h(imageView6, true);
        a0Var.h(imageView10, false);
        a0Var.h(imageView, false);
        a0Var.h(imageView11, false);
        a0Var.h(imageView9, this.X0 != 0);
        addOnLayoutChangeListener(new i(this, i));
    }

    public static void a(v vVar, androidx.media3.common.q0 q0Var, long j) {
        if (vVar.S0) {
            androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) q0Var;
            if (c0Var.u(17) && c0Var.u(10)) {
                v0 v0VarL = c0Var.l();
                int iO = v0VarL.o();
                int i = 0;
                while (true) {
                    long jD0 = androidx.media3.common.util.j0.d0(v0VarL.m(i, vVar.p0, 0L).m);
                    if (j < jD0) {
                        break;
                    }
                    if (i == iO - 1) {
                        j = jD0;
                        break;
                    } else {
                        j -= jD0;
                        i++;
                    }
                }
                c0Var.F(j, i, false);
            }
        } else {
            androidx.media3.exoplayer.c0 c0Var2 = (androidx.media3.exoplayer.c0) q0Var;
            if (c0Var2.u(5)) {
                c0Var2.G(j);
            }
        }
        vVar.s();
    }

    public static boolean c(androidx.media3.common.q0 q0Var, u0 u0Var) {
        v0 v0VarL;
        int iO;
        androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) q0Var;
        if (!c0Var.u(17) || (iO = (v0VarL = c0Var.l()).o()) <= 1 || iO > 100) {
            return false;
        }
        for (int i = 0; i < iO; i++) {
            if (v0VarL.m(i, u0Var, 0L).m == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        androidx.media3.common.q0 q0Var = this.N0;
        if (q0Var == null || !((androidx.media3.exoplayer.c0) q0Var).u(13)) {
            return;
        }
        androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) this.N0;
        c0Var.V();
        androidx.media3.common.l0 l0Var = new androidx.media3.common.l0(f, c0Var.n0.o.b);
        c0Var.V();
        if (c0Var.n0.o.equals(l0Var)) {
            return;
        }
        c1 c1VarG = c0Var.n0.g(l0Var);
        c0Var.I++;
        c0Var.l.E.b(4, l0Var).b();
        c0Var.T(c1VarG, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00df  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00eb  */
    public final boolean d(KeyEvent keyEvent) {
        androidx.media3.exoplayer.c0 c0Var;
        int keyCode = keyEvent.getKeyCode();
        androidx.media3.common.q0 q0Var = this.N0;
        if (q0Var == null || !(keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                androidx.media3.exoplayer.c0 c0Var2 = (androidx.media3.exoplayer.c0) q0Var;
                if (c0Var2.q() != 4 && c0Var2.u(12)) {
                    c0Var2.V();
                    long j = c0Var2.j() + c0Var2.k0;
                    long jO = c0Var2.o();
                    if (jO != -9223372036854775807L) {
                        j = Math.min(j, jO);
                    }
                    c0Var2.G(Math.max(j, 0L));
                }
            } else if (keyCode == 89) {
                androidx.media3.exoplayer.c0 c0Var3 = (androidx.media3.exoplayer.c0) q0Var;
                if (c0Var3.u(11)) {
                    c0Var3.V();
                    long j2 = c0Var3.j() + (-c0Var3.j0);
                    long jO2 = c0Var3.o();
                    if (jO2 != -9223372036854775807L) {
                        j2 = Math.min(j2, jO2);
                    }
                    c0Var3.G(Math.max(j2, 0L));
                } else if (keyEvent.getRepeatCount() == 0) {
                    if (keyCode != 79 || keyCode == 85) {
                        if (androidx.media3.common.util.j0.a0(q0Var, this.R0)) {
                            androidx.media3.common.util.j0.I(q0Var);
                        } else {
                            c0Var = (androidx.media3.exoplayer.c0) q0Var;
                            if (c0Var.u(1)) {
                                c0Var.M(false);
                            }
                        }
                    } else if (keyCode == 87) {
                        androidx.media3.exoplayer.c0 c0Var4 = (androidx.media3.exoplayer.c0) q0Var;
                        if (c0Var4.u(9)) {
                            c0Var4.H();
                        }
                    } else if (keyCode == 88) {
                        androidx.media3.exoplayer.c0 c0Var5 = (androidx.media3.exoplayer.c0) q0Var;
                        if (c0Var5.u(7)) {
                            c0Var5.I();
                        }
                    } else if (keyCode == 126) {
                        androidx.media3.common.util.j0.I(q0Var);
                    } else if (keyCode == 127) {
                        String str = androidx.media3.common.util.j0.a;
                        androidx.media3.exoplayer.c0 c0Var6 = (androidx.media3.exoplayer.c0) q0Var;
                        if (c0Var6.u(1)) {
                            c0Var6.M(false);
                        }
                    }
                }
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode != 79) {
                    if (androidx.media3.common.util.j0.a0(q0Var, this.R0)) {
                        androidx.media3.common.util.j0.I(q0Var);
                    } else {
                        c0Var = (androidx.media3.exoplayer.c0) q0Var;
                        if (c0Var.u(1)) {
                            c0Var.M(false);
                        }
                    }
                } else if (androidx.media3.common.util.j0.a0(q0Var, this.R0)) {
                    androidx.media3.common.util.j0.I(q0Var);
                } else {
                    c0Var = (androidx.media3.exoplayer.c0) q0Var;
                    if (c0Var.u(1)) {
                        c0Var.M(false);
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return d(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e(androidx.recyclerview.widget.v vVar, View view) {
        this.I.setAdapter(vVar);
        u();
        this.d1 = false;
        PopupWindow popupWindow = this.O;
        popupWindow.dismiss();
        this.d1 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = this.P;
        popupWindow.showAsDropDown(view, width - i, (-popupWindow.getHeight()) - i);
    }

    public final a1 f(androidx.media3.common.c1 c1Var, int i) {
        com.google.common.collect.q.f(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        com.google.common.collect.h0 h0Var = c1Var.a;
        int i2 = 0;
        for (int i3 = 0; i3 < h0Var.size(); i3++) {
            b1 b1Var = (b1) h0Var.get(i3);
            if (b1Var.b.c == i) {
                for (int i4 = 0; i4 < b1Var.a; i4++) {
                    if (b1Var.b(i4)) {
                        androidx.media3.common.r rVarA = b1Var.a(i4);
                        if ((rVarA.e & 2) == 0) {
                            s sVar = new s(c1Var, i3, i4, this.N.v(rVarA));
                            int i5 = i2 + 1;
                            int iE = com.google.common.collect.a0.e(objArrCopyOf.length, i5);
                            if (iE > objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iE);
                            }
                            objArrCopyOf[i2] = sVar;
                            i2 = i5;
                        }
                    }
                }
            }
        }
        return com.google.common.collect.h0.j(i2, objArrCopyOf);
    }

    public final void g() {
        a0 a0Var = this.e;
        int i = a0Var.A;
        if (i == 3 || i == 2) {
            return;
        }
        a0Var.f();
        if (!a0Var.D) {
            a0Var.i(2);
        } else if (a0Var.A == 1) {
            a0Var.n.start();
        } else {
            a0Var.o.start();
        }
    }

    public androidx.media3.common.q0 getPlayer() {
        return this.N0;
    }

    public int getRepeatToggleModes() {
        return this.X0;
    }

    public boolean getShowShuffleButton() {
        return this.e.b(this.b0);
    }

    public boolean getShowSubtitleButton() {
        return this.e.b(this.d0);
    }

    public int getShowTimeoutMs() {
        return this.U0;
    }

    public boolean getShowVrButton() {
        return this.e.b(this.c0);
    }

    public final boolean h(androidx.media3.common.q0 q0Var) {
        Class cls;
        return (q0Var == null || (cls = this.E) == null || !cls.isAssignableFrom(q0Var.getClass())) ? false : true;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i(androidx.media3.common.q0 q0Var) {
        Class cls;
        return (q0Var == null || (cls = this.B) == null || !cls.isAssignableFrom(q0Var.getClass())) ? false : true;
    }

    public final boolean j() {
        a0 a0Var = this.e;
        return a0Var.A == 0 && a0Var.a.l();
    }

    public final boolean k(androidx.media3.common.q0 q0Var) {
        try {
            if (i(q0Var)) {
                Method method = this.D;
                method.getClass();
                Object objInvoke = method.invoke(q0Var, null);
                objInvoke.getClass();
                if (((Boolean) objInvoke).booleanValue()) {
                    return true;
                }
            }
            if (!h(q0Var)) {
                return false;
            }
            Method method2 = this.G;
            method2.getClass();
            Object objInvoke2 = method2.invoke(q0Var, null);
            objInvoke2.getClass();
            return ((Boolean) objInvoke2).booleanValue();
        } catch (IllegalAccessException e) {
            e = e;
            net.luminis.tls.engine.impl.c.k(e);
            return false;
        } catch (InvocationTargetException e2) {
            e = e2;
            net.luminis.tls.engine.impl.c.k(e);
            return false;
        }
    }

    public final boolean l() {
        return getVisibility() == 0;
    }

    public final void m() {
        q();
        p();
        t();
        v();
        x();
        r();
        w();
    }

    public final void n(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.B0 : this.C0);
    }

    public final void o(boolean z) {
        if (this.O0 == z) {
            return;
        }
        this.O0 = z;
        String str = this.M0;
        Drawable drawable = this.K0;
        String str2 = this.L0;
        Drawable drawable2 = this.J0;
        ImageView imageView = this.e0;
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = this.f0;
        if (imageView2 == null) {
            return;
        }
        if (z) {
            imageView2.setImageDrawable(drawable2);
            imageView2.setContentDescription(str2);
        } else {
            imageView2.setImageDrawable(drawable);
            imageView2.setContentDescription(str);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a0 a0Var = this.e;
        a0Var.a.addOnLayoutChangeListener(a0Var.y);
        this.P0 = true;
        if (j()) {
            a0Var.g();
        }
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a0 a0Var = this.e;
        a0Var.a.removeOnLayoutChangeListener(a0Var.y);
        this.P0 = false;
        removeCallbacks(this.q0);
        a0Var.f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.e.b;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public final void p() {
        boolean zU;
        boolean zU2;
        boolean zU3;
        boolean zU4;
        boolean zU5;
        long j;
        long j2;
        if (l() && this.P0) {
            androidx.media3.common.q0 q0Var = this.N0;
            if (q0Var != null) {
                zU = (this.Q0 && c(q0Var, this.p0)) ? ((androidx.media3.exoplayer.c0) q0Var).u(10) : ((androidx.media3.exoplayer.c0) q0Var).u(5);
                androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) q0Var;
                zU3 = c0Var.u(7);
                zU4 = c0Var.u(11);
                zU5 = c0Var.u(12);
                zU2 = c0Var.u(9);
            } else {
                zU = false;
                zU2 = false;
                zU3 = false;
                zU4 = false;
                zU5 = false;
            }
            Resources resources = this.y;
            View view = this.U;
            if (zU4) {
                androidx.media3.common.q0 q0Var2 = this.N0;
                if (q0Var2 != null) {
                    androidx.media3.exoplayer.c0 c0Var2 = (androidx.media3.exoplayer.c0) q0Var2;
                    c0Var2.V();
                    j2 = c0Var2.j0;
                } else {
                    j2 = 5000;
                }
                int i = (int) (j2 / 1000);
                TextView textView = this.W;
                if (textView != null) {
                    textView.setText(String.valueOf(i));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, i, Integer.valueOf(i)));
                }
            }
            View view2 = this.T;
            if (zU5) {
                androidx.media3.common.q0 q0Var3 = this.N0;
                if (q0Var3 != null) {
                    androidx.media3.exoplayer.c0 c0Var3 = (androidx.media3.exoplayer.c0) q0Var3;
                    c0Var3.V();
                    j = c0Var3.k0;
                } else {
                    j = 15000;
                }
                int i2 = (int) (j / 1000);
                TextView textView2 = this.V;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(i2));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, i2, Integer.valueOf(i2)));
                }
            }
            n(this.Q, zU3);
            n(view, zU4);
            n(view2, zU5);
            n(this.R, zU2);
            o0 o0Var = this.l0;
            if (o0Var != null) {
                ((g) o0Var).setEnabled(zU);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    public final void q() {
        ImageView imageView;
        boolean z;
        if (l() && this.P0 && (imageView = this.S) != null) {
            boolean zA0 = androidx.media3.common.util.j0.a0(this.N0, this.R0);
            Drawable drawable = zA0 ? this.r0 : this.s0;
            int i = zA0 ? R.string.exo_controls_play_description : R.string.exo_controls_pause_description;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.y.getString(i));
            androidx.media3.common.q0 q0Var = this.N0;
            boolean z2 = false;
            if (q0Var != null) {
                androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) q0Var;
                int iQ = c0Var.q();
                if (c0Var.u(16)) {
                    v0 v0VarL = c0Var.l();
                    if ((v0VarL.p() ? null : v0VarL.m(c0Var.h(), c0Var.a, 0L).c) != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = true;
                }
                boolean zU = c0Var.u(1);
                boolean z3 = iQ == 1 && c0Var.u(2);
                boolean z4 = iQ == 4 && c0Var.u(4);
                if (z && (zU || z3 || z4)) {
                    z2 = true;
                }
            }
            n(imageView, z2);
        }
    }

    public final void r() {
        n nVar;
        androidx.media3.common.q0 q0Var = this.N0;
        if (q0Var == null) {
            return;
        }
        androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) q0Var;
        c0Var.V();
        float f = c0Var.n0.o.a;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        while (true) {
            nVar = this.K;
            float[] fArr = nVar.e;
            if (i >= fArr.length) {
                break;
            }
            float fAbs = Math.abs(f - fArr[i]);
            if (fAbs < f2) {
                i2 = i;
                f2 = fAbs;
            }
            i++;
        }
        nVar.f = i2;
        String str = nVar.d[i2];
        q qVar = this.J;
        qVar.e[0] = str;
        n(this.g0, qVar.e(1) || qVar.e(0));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    public final void s() {
        long jE;
        long jD;
        if (l() && this.P0) {
            androidx.media3.common.q0 q0Var = this.N0;
            if (q0Var != null) {
                androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) q0Var;
                if (c0Var.u(16)) {
                    long j = this.c1;
                    c0Var.V();
                    jE = c0Var.e(c0Var.n0) + j;
                    jD = c0Var.d() + this.c1;
                } else {
                    jE = 0;
                    jD = 0;
                }
            } else {
                jE = 0;
                jD = 0;
            }
            TextView textView = this.k0;
            if (textView != null && !this.T0) {
                textView.setText(androidx.media3.common.util.j0.F(this.m0, this.n0, jE));
            }
            o0 o0Var = this.l0;
            if (o0Var != null) {
                g gVar = (g) o0Var;
                gVar.setPosition(jE);
                if (k(q0Var)) {
                    jD = jE;
                }
                gVar.setBufferedPosition(jD);
            }
            androidx.activity.l lVar = this.q0;
            removeCallbacks(lVar);
            int iQ = q0Var == null ? 1 : ((androidx.media3.exoplayer.c0) q0Var).q();
            if (q0Var != null) {
                androidx.media3.exoplayer.c0 c0Var2 = (androidx.media3.exoplayer.c0) q0Var;
                if (c0Var2.w()) {
                    long jMin = Math.min(o0Var != null ? ((g) o0Var).getPreferredUpdateDelay() : 1000L, 1000 - (jE % 1000));
                    c0Var2.V();
                    float f = c0Var2.n0.o.a;
                    postDelayed(lVar, androidx.media3.common.util.j0.k(f > 0.0f ? (long) (jMin / f) : 1000L, this.W0, 1000L));
                    return;
                }
            }
            if (iQ == 4 || iQ == 1) {
                return;
            }
            postDelayed(lVar, 1000L);
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.e.D = z;
    }

    public void setMediaRouteButtonViewProvider(g1 g1Var) {
        View viewFindViewById = findViewById(R.id.exo_media_route_button_placeholder);
        if (viewFindViewById == null) {
            net.luminis.tls.engine.impl.c.r("The media route button placeholder is missing.");
            return;
        }
        if (g1Var == null) {
            viewFindViewById.setVisibility(8);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
        if (viewGroup == null) {
            net.luminis.tls.engine.impl.c.r("The media route button placeholder has no parent view.");
            return;
        }
        ListenableFuture listenableFutureA = g1Var.a();
        c2 c2Var = new c2(this, viewFindViewById, viewGroup);
        Handler handler = this.z;
        Objects.requireNonNull(handler);
        listenableFutureA.a(new com.google.common.util.concurrent.l0(0, listenableFutureA, c2Var), new androidx.compose.ui.text.input.b0(handler, 2));
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(l lVar) {
        boolean z = lVar != null;
        ImageView imageView = this.e0;
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z2 = lVar != null;
        ImageView imageView2 = this.f0;
        if (imageView2 == null) {
            return;
        }
        if (z2) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(androidx.media3.common.q0 q0Var) {
        com.google.android.material.motion.a.q(Looper.myLooper() == Looper.getMainLooper());
        com.google.android.material.motion.a.f(q0Var == null || ((androidx.media3.exoplayer.c0) q0Var).s == Looper.getMainLooper());
        androidx.media3.common.q0 q0Var2 = this.N0;
        if (q0Var2 == q0Var) {
            return;
        }
        k kVar = this.A;
        if (q0Var2 != null) {
            ((androidx.media3.exoplayer.c0) q0Var2).D(kVar);
        }
        this.N0 = q0Var;
        if (q0Var != null) {
            androidx.media3.common.util.p pVar = ((androidx.media3.exoplayer.c0) q0Var).m;
            kVar.getClass();
            pVar.a(kVar);
        }
        m();
    }

    public void setRepeatToggleModes(int i) {
        this.X0 = i;
        androidx.media3.common.q0 q0Var = this.N0;
        if (q0Var != null && ((androidx.media3.exoplayer.c0) q0Var).u(15)) {
            androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) this.N0;
            c0Var.V();
            int i2 = c0Var.G;
            if (i == 0 && i2 != 0) {
                ((androidx.media3.exoplayer.c0) this.N0).N(0);
            } else if (i == 1 && i2 == 2) {
                ((androidx.media3.exoplayer.c0) this.N0).N(1);
            } else if (i == 2 && i2 == 1) {
                ((androidx.media3.exoplayer.c0) this.N0).N(2);
            }
        }
        this.e.h(this.a0, i != 0);
        t();
    }

    public void setShowFastForwardButton(boolean z) {
        this.e.h(this.T, z);
        p();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.Q0 = z;
        w();
    }

    public void setShowNextButton(boolean z) {
        this.e.h(this.R, z);
        p();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.R0 = z;
        q();
    }

    public void setShowPreviousButton(boolean z) {
        this.e.h(this.Q, z);
        p();
    }

    public void setShowRewindButton(boolean z) {
        this.e.h(this.U, z);
        p();
    }

    public void setShowShuffleButton(boolean z) {
        this.e.h(this.b0, z);
        v();
    }

    public void setShowSubtitleButton(boolean z) {
        this.e.h(this.d0, z);
    }

    public void setShowTimeoutMs(int i) {
        this.U0 = i;
        if (j()) {
            this.e.g();
        }
    }

    public void setShowVrButton(boolean z) {
        this.e.h(this.c0, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.W0 = androidx.media3.common.util.j0.j(i, 16, 1000);
    }

    public void setTimeBarScrubbingEnabled(boolean z) {
        this.V0 = z;
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.c0;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            n(imageView, onClickListener != null);
        }
    }

    public final void t() {
        ImageView imageView;
        if (l() && this.P0 && (imageView = this.a0) != null) {
            if (this.X0 == 0) {
                n(imageView, false);
                return;
            }
            androidx.media3.common.q0 q0Var = this.N0;
            String str = this.w0;
            Drawable drawable = this.t0;
            if (q0Var != null) {
                androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) q0Var;
                if (c0Var.u(15)) {
                    n(imageView, true);
                    c0Var.V();
                    int i = c0Var.G;
                    if (i == 0) {
                        imageView.setImageDrawable(drawable);
                        imageView.setContentDescription(str);
                        return;
                    } else if (i == 1) {
                        imageView.setImageDrawable(this.u0);
                        imageView.setContentDescription(this.x0);
                        return;
                    } else {
                        if (i != 2) {
                            return;
                        }
                        imageView.setImageDrawable(this.v0);
                        imageView.setContentDescription(this.y0);
                        return;
                    }
                }
            }
            n(imageView, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    public final void u() {
        RecyclerView recyclerView = this.I;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i = this.P;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i * 2));
        PopupWindow popupWindow = this.O;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i * 2), recyclerView.getMeasuredHeight()));
    }

    public final void v() {
        ImageView imageView;
        if (l() && this.P0 && (imageView = this.b0) != null) {
            androidx.media3.common.q0 q0Var = this.N0;
            if (!this.e.b(imageView)) {
                n(imageView, false);
                return;
            }
            String str = this.E0;
            Drawable drawable = this.A0;
            if (q0Var != null) {
                androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) q0Var;
                if (c0Var.u(14)) {
                    n(imageView, true);
                    c0Var.V();
                    if (c0Var.H) {
                        drawable = this.z0;
                    }
                    imageView.setImageDrawable(drawable);
                    c0Var.V();
                    if (c0Var.H) {
                        str = this.D0;
                    }
                    imageView.setContentDescription(str);
                    return;
                }
            }
            n(imageView, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [androidx.media3.common.t0] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.media3.common.v0] */
    /* JADX WARN: Type inference failed for: r2v13, types: [androidx.media3.common.v0] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v9, types: [int] */
    /* JADX WARN: Type inference failed for: r5v16, types: [androidx.media3.common.c] */
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
    public final void w() {
        boolean z;
        long j;
        long jQ;
        int i;
        long jD0;
        ?? r4;
        ?? r2;
        ?? r24;
        boolean z2;
        ?? r3;
        boolean[] zArr;
        boolean z3;
        int length;
        androidx.media3.common.q0 q0Var = this.N0;
        if (q0Var == null) {
            return;
        }
        boolean z4 = this.Q0;
        u0 u0Var = this.p0;
        boolean z5 = false;
        boolean z6 = true;
        this.S0 = z4 && c(q0Var, u0Var);
        long j2 = 0;
        this.c1 = 0L;
        androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) q0Var;
        v0 v0VarL = c0Var.u(17) ? c0Var.l() : v0.a;
        if (v0VarL.p()) {
            z = true;
            if (c0Var.u(16)) {
                v0 v0VarL2 = c0Var.l();
                if (v0VarL2.p()) {
                    jD0 = -9223372036854775807L;
                    j = 0;
                } else {
                    j = 0;
                    jD0 = androidx.media3.common.util.j0.d0(v0VarL2.m(c0Var.h(), c0Var.a, 0L).m);
                }
                if (jD0 != -9223372036854775807L) {
                    jQ = androidx.media3.common.util.j0.Q(jD0);
                }
                i = 0;
            } else {
                j = 0;
            }
            jQ = j;
            i = 0;
        } else {
            int iH = c0Var.h();
            boolean z7 = this.S0;
            int i2 = z7 ? 0 : iH;
            int iO = z7 ? v0VarL.o() - 1 : iH;
            i = 0;
            long j3 = 0;
            ?? r5 = v0VarL;
            while (i2 <= iO) {
                long j4 = -9223372036854775807L;
                if (i2 == iH) {
                    this.c1 = androidx.media3.common.util.j0.d0(j3);
                }
                r5.n(i2, u0Var);
                if (u0Var.m == -9223372036854775807L) {
                    com.google.android.material.motion.a.q(this.S0 ^ z6);
                    break;
                }
                int i3 = u0Var.n;
                ?? r6 = r5;
                boolean z8 = z5;
                while (i3 <= u0Var.o) {
                    ?? r10 = this.o0;
                    r6.f(i3, r10, z8);
                    long j5 = j4;
                    r10.g.getClass();
                    int i4 = r10.g.a;
                    while (r4 < i4) {
                        r10.d(r4);
                        long j6 = j2;
                        long j7 = r10.e;
                        if (j7 >= j6) {
                            long[] jArr = this.Y0;
                            if (i == jArr.length) {
                                if (jArr.length == 0) {
                                    r2 = r6;
                                    r4 = z8;
                                    length = 1;
                                } else {
                                    r2 = r6;
                                    r4 = z8;
                                    length = jArr.length * 2;
                                }
                                this.Y0 = Arrays.copyOf(jArr, length);
                                this.Z0 = Arrays.copyOf(this.Z0, length);
                            }
                            r2 = r6;
                            r4 = z8;
                            this.Y0[i] = androidx.media3.common.util.j0.d0(j7 + j3);
                            boolean[] zArr2 = this.Z0;
                            androidx.media3.common.a aVarA = r10.g.a(r4);
                            int i5 = aVarA.a;
                            if (i5 != -1) {
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= i5) {
                                        r3 = r2;
                                        zArr = zArr2;
                                        r24 = r3;
                                        z2 = true;
                                        z3 = false;
                                        break;
                                    }
                                    zArr = zArr2;
                                    int i7 = aVarA.e[i6];
                                    ?? r25 = r3;
                                    z2 = true;
                                    if (i7 == 0) {
                                        r3 = r2;
                                    } else if (i7 != 1) {
                                        i6++;
                                        zArr2 = zArr;
                                        r3 = r25;
                                    }
                                    z3 = true;
                                    r24 = r25;
                                    break;
                                }
                            }
                            zArr = zArr2;
                            r24 = r2;
                            z2 = true;
                            z3 = true;
                            zArr[i] = !z3;
                            i++;
                        } else {
                            r2 = r6;
                            r4 = z8;
                            r24 = r2;
                            z2 = z6;
                        }
                        z6 = z2;
                        j2 = j6;
                        iH = iH;
                        r2 = r24;
                        r4++;
                    }
                    r2 = r6;
                    r4 = z8;
                    i3++;
                    j4 = j5;
                    r6 = r2;
                    z8 = false;
                }
                j3 += u0Var.m;
                i2++;
                z6 = z6;
                r5 = r6;
                z5 = false;
            }
            z = z6;
            jQ = j3;
        }
        long jD1 = androidx.media3.common.util.j0.d0(jQ);
        TextView textView = this.j0;
        if (textView != null) {
            textView.setText(androidx.media3.common.util.j0.F(this.m0, this.n0, jD1));
        }
        o0 o0Var = this.l0;
        if (o0Var != null) {
            g gVar = (g) o0Var;
            gVar.setDuration(jD1);
            long[] jArr2 = this.a1;
            int length2 = jArr2.length;
            int i8 = i + length2;
            long[] jArr3 = this.Y0;
            if (i8 > jArr3.length) {
                this.Y0 = Arrays.copyOf(jArr3, i8);
                this.Z0 = Arrays.copyOf(this.Z0, i8);
            }
            System.arraycopy(jArr2, 0, this.Y0, i, length2);
            System.arraycopy(this.b1, 0, this.Z0, i, length2);
            long[] jArr4 = this.Y0;
            boolean[] zArr3 = this.Z0;
            if (i8 != 0 && (jArr4 == null || zArr3 == null)) {
                z = false;
            }
            com.google.android.material.motion.a.f(z);
            gVar.m0 = i8;
            gVar.n0 = jArr4;
            gVar.o0 = zArr3;
            gVar.e();
        }
        s();
    }

    public final void x() {
        j jVar = this.L;
        jVar.getClass();
        List list = Collections.EMPTY_LIST;
        jVar.d = list;
        j jVar2 = this.M;
        jVar2.getClass();
        jVar2.d = list;
        androidx.media3.common.q0 q0Var = this.N0;
        ImageView imageView = this.d0;
        if (q0Var != null && ((androidx.media3.exoplayer.c0) q0Var).u(30) && ((androidx.media3.exoplayer.c0) this.N0).u(29)) {
            androidx.media3.common.c1 c1VarM = ((androidx.media3.exoplayer.c0) this.N0).m();
            a1 a1VarF = f(c1VarM, 1);
            jVar2.d = a1VarF;
            v vVar = jVar2.g;
            androidx.media3.common.q0 q0Var2 = vVar.N0;
            q qVar = vVar.J;
            q0Var2.getClass();
            androidx.media3.common.a1 a1VarT = ((androidx.media3.exoplayer.c0) q0Var2).t();
            if (a1VarF.isEmpty()) {
                qVar.e[1] = vVar.getResources().getString(R.string.exo_track_selection_none);
            } else if (jVar2.e(a1VarT)) {
                for (int i = 0; i < a1VarF.A; i++) {
                    s sVar = (s) a1VarF.get(i);
                    if (sVar.a.e[sVar.b]) {
                        qVar.e[1] = sVar.c;
                        break;
                    }
                }
            } else {
                qVar.e[1] = vVar.getResources().getString(R.string.exo_track_selection_auto);
            }
            if (this.e.b(imageView)) {
                jVar.f(f(c1VarM, 3));
            } else {
                jVar.f(a1.B);
            }
        }
        n(imageView, jVar.a() > 0);
        q qVar2 = this.J;
        n(this.g0, qVar2.e(1) || qVar2.e(0));
    }

    public void setProgressUpdateListener(o oVar) {
    }
}
