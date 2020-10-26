package com.reactlibrary.ui.chatinput.listener;

import com.reactlibrary.ui.chatinput.menu.view.MenuFeature;
import com.reactlibrary.ui.chatinput.menu.view.MenuItem;

/**
 * Custom Menu' callbacks
 */
public interface CustomMenuEventListener {

    boolean onMenuItemClick(String tag, MenuItem menuItem);

    void onMenuFeatureVisibilityChanged(int visibility, String tag, MenuFeature menuFeature);

}