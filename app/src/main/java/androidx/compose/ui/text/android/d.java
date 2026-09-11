package androidx.compose.ui.text.android;

import android.graphics.text.LineBreakConfig;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.os.Bundle;
import android.text.BoringLayout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.f2;
import androidx.compose.ui.window.z;
import androidx.media3.common.util.j0;
import com.google.common.collect.d0;
import com.google.common.collect.h0;
import j$.util.stream.DesugarCollectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static androidx.media3.exoplayer.audio.b a(AudioManager audioManager, androidx.media3.common.e eVar, h0 h0Var, List list) {
        List<AudioProfile> directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(eVar.a());
        HashMap map = new HashMap();
        map.put(2, new HashSet(a0.b(12)));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile audioProfile = directProfilesForAttributes.get(i);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (j0.M(format) || androidx.media3.exoplayer.audio.b.h.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) map.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(a0.b(audioProfile.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(a0.b(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        d0 d0VarK = h0.k();
        for (Map.Entry entry : map.entrySet()) {
            d0VarK.b(new androidx.media3.exoplayer.audio.a(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new androidx.media3.exoplayer.audio.b(d0VarK.g(), h0Var, list);
    }

    public static AudioDeviceInfo b(AudioManager audioManager, androidx.media3.common.e eVar) {
        audioManager.getClass();
        List<AudioDeviceInfo> audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(eVar.a());
        if (audioDevicesForAttributes.isEmpty()) {
            return null;
        }
        return audioDevicesForAttributes.get(0);
    }

    public static List c(com.grack.nanojson.c cVar, String str, String str2, String str3) {
        com.grack.nanojson.b bVarA = cVar.a(str2);
        if (!org.schabi.newpipe.extractor.utils.f.i(bVarA)) {
            return (List) bVarA.c().filter(new com.grack.nanojson.a(3)).map(new org.schabi.newpipe.extractor.services.bandcamp.extractors.a(str, 2)).collect(DesugarCollectors.toUnmodifiableList());
        }
        com.grack.nanojson.c cVarE = cVar.e(str3);
        String strF = cVarE.f("path", null);
        if (org.schabi.newpipe.extractor.utils.f.h(strF)) {
            return Collections.EMPTY_LIST;
        }
        Object[] objArr = {new org.schabi.newpipe.extractor.a(-1, androidx.constraintlayout.core.g.c(str, strF), cVarE.c("width", -1), 4)};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.p(obj, arrayList, obj, arrayList);
    }

    public static Object d(String str, Bundle bundle) {
        return bundle.getParcelable(str, androidx.activity.result.a.class);
    }

    public static ArrayList e(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static List f(com.grack.nanojson.c cVar, String str) {
        ArrayList arrayList = new ArrayList(2);
        String strF = cVar.f("thumbnailPath", null);
        if (!org.schabi.newpipe.extractor.utils.f.h(strF)) {
            arrayList.add(new org.schabi.newpipe.extractor.a(-1, androidx.constraintlayout.core.g.c(str, strF), -1, 3));
        }
        String strF2 = cVar.f("previewPath", null);
        if (!org.schabi.newpipe.extractor.utils.f.h(strF2)) {
            arrayList.add(new org.schabi.newpipe.extractor.a(-1, androidx.constraintlayout.core.g.c(str, strF2), -1, 2));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static final BoringLayout.Metrics h(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    public static final boolean i(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }

    public static final boolean j(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static boolean k(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static final void l(z zVar, f2 f2Var) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (f2Var == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = zVar.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, f2Var);
    }

    public static final void m(z zVar, f2 f2Var) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (f2Var == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = zVar.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(f2Var);
    }

    public static final void n(CursorAnchorInfo.Builder builder, androidx.compose.ui.geometry.c cVar) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(androidx.compose.ui.graphics.a0.x(cVar)).setHandwritingBounds(androidx.compose.ui.graphics.a0.x(cVar)).build());
    }

    public static final void o(StaticLayout.Builder builder, int i, int i2) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i).setLineBreakWordStyle(i2).build());
    }

    public static void p(com.grack.nanojson.c cVar) throws org.schabi.newpipe.extractor.exceptions.b {
        String strF = cVar.f("error", null);
        if (!org.schabi.newpipe.extractor.utils.f.f(strF)) {
            throw new org.schabi.newpipe.extractor.exceptions.b(strF);
        }
    }
}
