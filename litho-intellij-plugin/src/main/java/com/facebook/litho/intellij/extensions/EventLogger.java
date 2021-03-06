/*
 * Copyright (c) Facebook, Inc. and its affiliates.
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

package com.facebook.litho.intellij.extensions;

import java.util.HashMap;
import java.util.Map;

/**
 * Extension point for other plugins to provide own mechanism of logging given events.
 *
 * @see "plugin.xml"
 */
public interface EventLogger {
  String PLUGIN_ID = "com.facebook.litho.intellij";
  // Metadata keys
  String KEY_PLUGIN_VERSION = "version";
  String KEY_FILE = "file";
  String KEY_RED_SYMBOLS = "red_symbols";
  String KEY_RED_SYMBOLS_ALL = "all_red_symbols";
  String KEY_RED_SYMBOLS_RESOLVED = "resolved_red_symbols";
  String KEY_TIME_COLLECT_RED_SYMBOLS = "time_collect";
  String KEY_TIME_RESOLVE_RED_SYMBOLS = "time_resolve";

  // Event types
  String EVENT_ANNOTATOR = "error.annotation";
  String EVENT_COMPLETION_METHOD = "completion.method";
  String EVENT_COMPLETION_ANNOTATION = "completion.annotation";
  String EVENT_COMPLETION_REQUIRED_PROP = "completion.required";
  String EVENT_FIND_USAGES = "find.usages";
  String EVENT_FIX_EVENT_HANDLER = "fix.event_handler";
  String EVENT_GENERATE_COMPONENT = "generate.component";
  String EVENT_GOTO_NAVIGATION = "goto.navigation";
  String EVENT_GOTO_GENERATED = "goto.generated";
  String EVENT_NEW_TEMPLATE = "file.template";
  String EVENT_ON_EVENT_GENERATION = "event.generation";
  String EVENT_RED_SYMBOLS = "resolve.redsymbols";
  String EVENT_SETTINGS = "settings.update";

  /**
   * Logs given event.
   *
   * @param event given event name
   */
  default void log(String event) {
    log(event, new HashMap<>());
  }

  void log(String event, Map<String, String> metadata);
}
