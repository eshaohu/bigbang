package com.scottruth.timeoffandroid.ui;

import android.support.annotation.Nullable;

/**
 * Created by santiago on 06/10/15.
 */
public abstract class FragmentWithDrawer extends ValidatableFragment {
    /**
     * This may be called when fragment is not attached, so be careful with context.
     * @return The fragment title
     */
    @Nullable
    public String getTitle() {
        return null;
    }

    public boolean hasIconsActionMenuView() {
        return getTitle() == null;
    }

    public boolean hasTabLayout() {
        return false;
    }

    public boolean scrollToolbar() {
        return hasTabLayout();
    }
}
