/*
 * Copyright (c) 2012-2017 Shailendra Singh <shailendra_01@outlook.com>
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
package in.koyad.piston.app.steam.plugins;

import in.koyad.piston.app.api.annotation.AnnoPlugin;
import in.koyad.piston.app.api.plugin.BasePlugin;
import in.koyad.piston.app.steam.actions.GetMarkdownContentPluginAction;
import in.koyad.piston.common.util.LogUtil;

@AnnoPlugin(name = "markdown", title = "Markdown", defaultAction = GetMarkdownContentPluginAction.ACTION_NAME)
public class MarkdownPlugin extends BasePlugin {

	private static final LogUtil LOGGER = LogUtil
			.getLogger(MarkdownPlugin.class);
	
	@Override
	public void preProcess() {
		LOGGER.enterMethod("execute");
	}
	
	@Override
	public void postProcess() {
		LOGGER.exitMethod("execute");
	}
	
}
