package com.martin.lurkprotocol;

import io.netty.buffer.*;
import io.netty.channel.*;
import io.netty.util.*;

import java.nio.charset.*;

public class LurkClient extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        System.out.println(msg);
    }
}
