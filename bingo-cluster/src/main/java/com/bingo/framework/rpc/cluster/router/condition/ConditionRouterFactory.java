/*
 * Copyright 1999-2012 Alibaba Group.
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
package com.bingo.framework.rpc.cluster.router.condition;

import com.bingo.framework.common.URL;
import com.bingo.framework.rpc.cluster.Router;
import com.bingo.framework.rpc.cluster.RouterFactory;

/**
 * ConditionRouterFactory
 * 
 * @author william.liangf
 */
public class ConditionRouterFactory implements RouterFactory {

    public static final String NAME = "condition";

    public Router getRouter(URL url) {
        return new ConditionRouter(url);
    }

}