/*
Pulsar
Copyright (C) 2013-2015 eBay Software Foundation
Dual licensed under the Apache 2.0 license and the GPL v2 license.  See LICENSE for full terms.
*/
package com.ebay.pulsar.collector.validation;

import java.util.Map;

public interface Validator {
    ValidationResult validate(Map<String, Object> event, String eventType);
}
