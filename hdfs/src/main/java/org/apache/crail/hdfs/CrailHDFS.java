/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.crail.hdfs;

import org.apache.crail.utils.CrailUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.DelegateToFileSystem;
import org.slf4j.Logger;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class CrailHDFS extends DelegateToFileSystem {
	private static final Logger LOG = CrailUtils.getLogger();

	CrailHDFS(URI theUri, Configuration conf) throws IOException, URISyntaxException {
		super(theUri, new CrailHadoopFileSystem(), conf, CrailHadoopFileSystem.SCHEME, true);
		LOG.info("CrailHDFS constructor");
	}
}
