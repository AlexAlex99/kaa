/*
 * Copyright 2014-2016 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kaaproject.kaa.server.operations.service.akka.messages.core.user;

public class EndpointEventDeliveryMessage implements UserAwareMessage{

    public static enum EventDeliveryStatus {
        SUCCESS, 
        FAILURE
    }

    private final EndpointEventReceiveMessage message;
    private final EventDeliveryStatus status;

    public EndpointEventDeliveryMessage(EndpointEventReceiveMessage message,
            EventDeliveryStatus status) {
        this.message = message;
        this.status = status;
    }

    @Override
    public String getUserId() {
        return message.getUserId();
    }

    public EndpointEventReceiveMessage getMessage() {
        return message;
    }

    public EventDeliveryStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("EndpointEventDeliveryMessage [message=");
        builder.append(message);
        builder.append(", status=");
        builder.append(status);
        builder.append("]");
        return builder.toString();
    }

}
