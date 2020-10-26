package com.reactlibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.bridge.JavaScriptModule;
import com.reactlibrary.core.ChatManager;
import com.reactlibrary.core.ClientModule;
import com.reactlibrary.core.EaseMobHookDelegate;
import com.reactlibrary.core.EasemobHelper;
import com.reactlibrary.core.GroupManager;
import com.reactlibrary.core.PushManager;
import com.reactlibrary.ui.AuroraIMUIModule;
import com.reactlibrary.ui.viewmanager.ReactChatInputManager;
import com.reactlibrary.ui.viewmanager.ReactMsgListManager;

public class CBHouseImPackage implements ReactPackage {

    public CBHouseImPackage() {
    }


    public CBHouseImPackage(EaseMobHookDelegate delegate) {
        EasemobHelper.getInstance().setHookDelegate(delegate);
    }




    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> nativeModules = new ArrayList<>();
        nativeModules.add(new AuroraIMUIModule(reactContext));


        nativeModules.add(new ChatManager(reactContext));
        nativeModules.add( new ClientModule(reactContext));
        nativeModules.add( new GroupManager(reactContext));
        nativeModules.add( new PushManager(reactContext));


        return nativeModules;
    }


    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return null;
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        List<ViewManager> viewManagers = new ArrayList<>();
        viewManagers.add(new ReactMsgListManager());
        viewManagers.add(new ReactChatInputManager());
        return  viewManagers;
    }
}
