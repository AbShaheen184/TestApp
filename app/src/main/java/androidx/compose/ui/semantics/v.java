package androidx.compose.ui.semantics;

import androidx.compose.ui.graphics.n0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static final /* synthetic */ kotlin.reflect.j[] a;

    static {
        kotlin.jvm.internal.n nVar = new kotlin.jvm.internal.n("stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;");
        kotlin.jvm.internal.a0.a.getClass();
        a = new kotlin.reflect.j[]{nVar, new kotlin.jvm.internal.n("progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;"), new kotlin.jvm.internal.n("paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"), new kotlin.jvm.internal.n("liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new kotlin.jvm.internal.n("focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new kotlin.jvm.internal.n("isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new kotlin.jvm.internal.n("isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new kotlin.jvm.internal.n("isSensitiveData", "isSensitiveData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new kotlin.jvm.internal.n("contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;"), new kotlin.jvm.internal.n("contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;"), new kotlin.jvm.internal.n("fillableData", "getFillableData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/FillableData;"), new kotlin.jvm.internal.n("traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F"), new kotlin.jvm.internal.n("horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;"), new kotlin.jvm.internal.n("verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;"), new kotlin.jvm.internal.n("role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new kotlin.jvm.internal.n("testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"), new kotlin.jvm.internal.n("textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;"), new kotlin.jvm.internal.n("isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new kotlin.jvm.internal.n("inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;"), new kotlin.jvm.internal.n("editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;"), new kotlin.jvm.internal.n("textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J"), new kotlin.jvm.internal.n("imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new kotlin.jvm.internal.n("selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new kotlin.jvm.internal.n("collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;"), new kotlin.jvm.internal.n("collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;"), new kotlin.jvm.internal.n("toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;"), new kotlin.jvm.internal.n("isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new kotlin.jvm.internal.n("maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I"), new kotlin.jvm.internal.n("shape", "getShape(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/graphics/Shape;"), new kotlin.jvm.internal.n("customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;")};
        w wVar = t.a;
        w wVar2 = k.a;
    }

    public static void a(x xVar, kotlin.jvm.functions.l lVar) {
        xVar.b(k.a, new a(null, lVar));
    }

    public static void b(x xVar, kotlin.jvm.functions.l lVar) {
        xVar.b(k.h, new a(null, lVar));
    }

    public static final void c(x xVar, int i) {
        w wVar = t.y;
        kotlin.reflect.j jVar = a[14];
        xVar.b(wVar, new h(i));
    }

    public static final void d(x xVar, n0 n0Var) {
        w wVar = t.a;
        w wVar2 = t.P;
        kotlin.reflect.j jVar = a[28];
        xVar.b(wVar2, n0Var);
    }

    public static final void e(x xVar, androidx.compose.ui.state.a aVar) {
        w wVar = t.a;
        w wVar2 = t.J;
        kotlin.reflect.j jVar = a[25];
        xVar.b(wVar2, aVar);
    }
}
