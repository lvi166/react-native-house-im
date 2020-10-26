

import * as AuroraIMUIController from "./src/main/ui/UI"
import * as UICommon from "./src/main/ui/Common"

// import * as ChatInput from './src/main/ui/native/chatinput.android';
// import  { MessageList } from './src/main/ui/native/messagelist.android';


import MessageList from "react-native-house-im/src/main/ui/native/messagelist";
import ChatInput from "react-native-house-im/src/main/ui/native/chatinput";

import * as PhotoBrowserView from './src/main/ui/native/photo_browser.android';


//-- im core
import * as APNs from './src/main/im/native/APNs';
import * as ChatManager from './src/main/im/native/ChatManager';
import * as GroupManager from './src/main/im/native/GroupManager';
import * as Client from './src/main/im/native/Client';
import * as IMConstant  from './src/main/im/constant/IMConstant';
import * as EventEmitter from './src/main/im/eventemitter';



export {
    EventEmitter,
    APNs,
    ChatManager,
    GroupManager,
    Client,
    IMConstant,
    AuroraIMUIController,
    UICommon,
   
    // MessageList,
    PhotoBrowserView,

};

export {
    MessageList,
  
}
export {
    ChatInput,
  
}
