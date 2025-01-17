/*
 *  ---license-start
 *  eu-digital-green-certificates / dgca-verifier-app-android
 *  ---
 *  Copyright (C) 2021 T-Systems International GmbH and all other contributors
 *  ---
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  ---license-end
 *
 *  Created by osarapulov on 6/25/21 9:21 AM
 */

package dgca.verifier.app.engine.data.source.remote.rules

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import org.threeten.bp.ZonedDateTime

/*-
 * ---license-start
 * eu-digital-green-certificates / dgc-certlogic-android
 * ---
 * Copyright (C) 2021 T-Systems International GmbH and all other contributors
 * ---
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
 * ---license-end
 *
 * Created by osarapulov on 11.06.21 11:03
 */
data class RuleRemote(
    @JsonProperty("Identifier")
    val identifier: String,
    @JsonProperty("Type")
    val type: String,
    @JsonProperty("Version")
    val version: String,
    @JsonProperty("SchemaVersion")
    val schemaVersion: String,
    @JsonProperty("Engine")
    val engine: String,
    @JsonProperty("EngineVersion")
    val engineVersion: String,
    @JsonProperty("CertificateType")
    val certificateType: String,
    @JsonProperty("Description")
    val descriptions: List<DescriptionRemote>,
    @JsonProperty("ValidFrom")
    val validFrom: ZonedDateTime,
    @JsonProperty("ValidTo")
    val validTo: ZonedDateTime,
    @JsonProperty("AffectedFields")
    val affectedString: List<String>,
    @JsonProperty("Logic")
    val logic: JsonNode,
    @JsonProperty("Country")
    val countryCode: String,
    @JsonProperty("Region")
    val region: String?
)