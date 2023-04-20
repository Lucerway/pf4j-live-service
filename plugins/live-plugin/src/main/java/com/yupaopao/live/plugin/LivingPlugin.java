/*
 * Copyright (C) 2012-present the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yupaopao.live.plugin;

import com.yupaopao.live.api.LivingApi;
import org.pf4j.Extension;
import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;


/**
 * @author Decebal Suiu
 */
public class LivingPlugin extends Plugin {

    public LivingPlugin(PluginWrapper wrapper) {
        super(wrapper);
    }

    @Override
    public void start() {
        System.out.println("------------------------LivingPlugin.start()------------------------");
        // for testing the development mode
    }

    @Override
    public void stop() {
        System.out.println("------------------------LivingPlugin.stop()------------------------");
    }


    @Extension
    public static class LivingExtension implements LivingApi {

        @Override
        public String startLiving(Long uid) {
            String result = "------------------------" + uid + "startLiving success in LivingPlugin， xxxxxxx------------------------";
            return result;
        }

    }

}
