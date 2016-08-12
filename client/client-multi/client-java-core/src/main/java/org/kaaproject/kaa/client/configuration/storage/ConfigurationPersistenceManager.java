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

package org.kaaproject.kaa.client.configuration.storage;

import java.io.IOException;

/**
 * Manager for saving and loading of configuration data<br>
 * <br>
 * Provide {@link ConfigurationStorage} implementation instance to store merged
 * configuration when configuration deltas are received from Operation server.
 * Once {@link ConfigurationPersistenceManager#setConfigurationStorage(ConfigurationStorage)}
 * is called {@link ConfigurationStorage#loadConfiguration()} will be invoked to
 * load persisted configuration.<br>
 *
 * @author Yaroslav Zeygerman
 * @see ConfigurationStorage
 *
 */
public interface ConfigurationPersistenceManager {

    /**
     * Provide storage object which is able to persist encoded configuration data.
     *
     * @param   storage Object which will save and load configuration data
     * @throws  IOException the io exception
     * @see     ConfigurationStorage
     */
    void setConfigurationStorage(ConfigurationStorage storage) throws IOException;

}
