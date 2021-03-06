package org.zstack.header.console

import org.zstack.header.errorcode.ErrorCode

doc {

    title "控制台清单"

    ref {
        name "error"
        path "org.zstack.header.console.APIRequestConsoleAccessEvent.error"
        desc "错误码，若不为null，则表示操作失败, 操作成功时该字段为null", false
        type "ErrorCode"
        since "0.6"
        clz ErrorCode.class
    }
    ref {
        name "inventory"
        path "org.zstack.header.console.APIRequestConsoleAccessEvent.inventory"
        desc "控制台清单"
        type "ConsoleInventory"
        since "0.6"
        clz ConsoleInventory.class
    }
}
