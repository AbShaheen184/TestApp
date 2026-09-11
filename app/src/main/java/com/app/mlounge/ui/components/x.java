package com.app.mlounge.ui.components;

import androidx.compose.runtime.y0;
import java.util.List;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements FlowCollector {
    public final /* synthetic */ int e;
    public final /* synthetic */ y0 y;

    public /* synthetic */ x(y0 y0Var, int i) {
        this.e = i;
        this.y = y0Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        y0 y0Var = this.y;
        switch (i) {
            case 0:
                if (((androidx.compose.foundation.interaction.j) obj) instanceof androidx.compose.foundation.interaction.m) {
                    y0Var.setValue(Boolean.TRUE);
                }
                break;
            case 1:
                if (((androidx.compose.foundation.interaction.j) obj) instanceof androidx.compose.foundation.interaction.m) {
                    y0Var.setValue(Boolean.TRUE);
                }
                break;
            case 2:
                if (((androidx.compose.foundation.interaction.j) obj) instanceof androidx.compose.foundation.interaction.m) {
                    y0Var.setValue(Boolean.TRUE);
                }
                break;
            case 3:
                if (((androidx.compose.foundation.interaction.j) obj) instanceof androidx.compose.foundation.interaction.m) {
                    y0Var.setValue(Boolean.TRUE);
                }
                break;
            case 4:
                if (((androidx.compose.foundation.interaction.j) obj) instanceof androidx.compose.foundation.interaction.m) {
                    y0Var.setValue(Boolean.TRUE);
                }
                break;
            case 5:
                if (((androidx.compose.foundation.interaction.j) obj) instanceof androidx.compose.foundation.interaction.m) {
                    y0Var.setValue(Boolean.TRUE);
                }
                break;
            default:
                if (((androidx.compose.foundation.interaction.j) obj) instanceof androidx.compose.foundation.interaction.m) {
                    List list = com.app.mlounge.ui.screens.settings.e0.a;
                    y0Var.setValue(Boolean.TRUE);
                }
                break;
        }
        return yVar;
    }
}
