/**
 * Copyright 2007-2015, Kaazing Corporation. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kaazing.k3po.driver.internal.netty.bootstrap.http;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelConfig;
import org.jboss.netty.channel.ChannelFactory;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelSink;
import org.jboss.netty.channel.DefaultServerChannelConfig;
import org.kaazing.k3po.driver.internal.netty.bootstrap.channel.AbstractServerChannel;
import org.kaazing.k3po.driver.internal.netty.channel.ChannelAddress;

public class HttpServerChannel extends AbstractServerChannel<ChannelConfig> {

    HttpServerChannel(ChannelFactory factory, ChannelPipeline pipeline, ChannelSink sink) {
        super(factory, pipeline, sink, new DefaultServerChannelConfig());
    }

    @Override
    protected void setLocalAddress(ChannelAddress localAddress) {
        super.setLocalAddress(localAddress);
    }

    @Override
    protected void setBound() {
        super.setBound();
    }

    @Override
    protected void setTransport(Channel transport) {
        super.setTransport(transport);
    }

    @Override
    protected boolean setClosed() {
        return super.setClosed();
    }

    @Override
    protected Channel getTransport() {
        return super.getTransport();
    }

}
