package com.yotpo.metorikku.configuration

import com.fasterxml.jackson.annotation.JsonProperty

case class InputOption(@JsonProperty("type") inputType: String,
                @JsonProperty("path") path: String) {}
