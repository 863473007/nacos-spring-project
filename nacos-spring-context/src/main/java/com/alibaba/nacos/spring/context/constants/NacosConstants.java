/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.nacos.spring.context.constants;

/**
 * Nacos Constants
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @since 0.1.0
 */
public interface NacosConstants {

    /**
     * The prefix of property name of Nacos
     */
    String PROPERTY_NAME_PREFIX = "nacos.";

    /**
     * The parallelism of Nacos Config Listener
     */
    String NACOS_CONFIG_LISTENER_PARALLELISM = PROPERTY_NAME_PREFIX + "config.listener.parallelism";

    /**
     * The default parallelism of Nacos Config Listener (available processors)
     */
    int DEFAULT_NACOS_CONFIG_LISTENER_PARALLELISM = Runtime.getRuntime().availableProcessors();

}