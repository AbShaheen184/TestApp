package androidx.transition;

import android.widget.FrameLayout;
import com.app.mlounge.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static final a a;
    public static final ThreadLocal b;
    public static final ArrayList c;

    static {
        a aVar = new a();
        aVar.X = new ArrayList();
        aVar.a0 = false;
        aVar.b0 = 0;
        aVar.Y = false;
        aVar.J(new h(2));
        aVar.J(new f());
        aVar.J(new h(1));
        a = aVar;
        b = new ThreadLocal();
        c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, m mVar) {
        ArrayList arrayList = c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (mVar == null) {
            mVar = a;
        }
        m mVarClone = mVar.clone();
        ArrayList arrayList2 = (ArrayList) b().get(frameLayout);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((m) it.next()).v(frameLayout);
            }
        }
        mVarClone.g(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            k.i();
            return;
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        p pVar = new p();
        pVar.e = mVarClone;
        pVar.y = frameLayout;
        frameLayout.addOnAttachStateChangeListener(pVar);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(pVar);
    }

    public static androidx.collection.f b() {
        androidx.collection.f fVar;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (fVar = (androidx.collection.f) weakReference.get()) != null) {
            return fVar;
        }
        androidx.collection.f fVar2 = new androidx.collection.f(0);
        threadLocal.set(new WeakReference(fVar2));
        return fVar2;
    }
}
