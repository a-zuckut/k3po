/**
 * Copyright (c) 2007-2014 Kaazing Corporation. All rights reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.kaazing.specification.http.rfc7235;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.rules.RuleChain.outerRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.DisableOnDebug;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import org.kaazing.k3po.junit.annotation.Specification;
import org.kaazing.k3po.junit.rules.K3poRule;

/**
 * RFC 7235
 * Sections 3.1, 4.1, 4.2
 */
public class AuthIT {

    private final K3poRule k3po = new K3poRule()
            .setScriptRoot("org/kaazing/specification/http/rfc7235/auth.tests");

    private final TestRule timeout = new DisableOnDebug(new Timeout(5, SECONDS));

    @Rule
    public final TestRule chain = outerRule(k3po).around(timeout);

    /* @Test
    @Specification({
       "errored.class/request",
       "errored.class/response" })
    public void shouldSucceed() throws Exception {
       k3po.finish();
    } */

    @Test
    @Specification({
       "realm.auth.cred.required.correct.user/request",
       "realm.auth.cred.required.correct.user/response" })
    public void realmAuthCredRequiredCorrectUser() throws Exception {
       k3po.finish();
    }

    @Test
    @Specification({
       "realm.auth.cred.required.incorrect.user/request",
       "realm.auth.cred.required.incorrect.user/response" })
    public void realmAuthCredRequiredIncorrectUser() throws Exception {
       k3po.finish();
    }

    @Test
    @Specification({
       "realm.auth.cred.required.password.no.username/request",
       "realm.auth.cred.required.password.no.username/response" })
    public void realmAuthCredRequiredPasswordNoUsername() throws Exception {
       k3po.finish();
    }

    @Test
    @Specification({
       "realm.auth.cred.required.username.no.password/request",
       "realm.auth.cred.required.username.no.password/response" })
    public void realmAuthCredRequiredUsernameNoPassword() throws Exception {
       k3po.finish();
    }

    @Test
    @Specification({
       "realm.auth.cred.not.required.correct.user/request",
       "realm.auth.cred.not.required.correct.user/response" })
    public void realmAuthCredNotRequiredCorrectUser() throws Exception {
       k3po.finish();
    }

    @Test
    @Specification({
       "realm.auth.cred.not.required.incorrect.user/request",
       "realm.auth.cred.not.required.incorrect.user/response" })
    public void realmAuthCredNotRequiredIncorrectUser() throws Exception {
       k3po.finish();
    }

    @Test
    @Specification({
       "realm.auth.cred.not.required.password.no.username/request",
       "realm.auth.cred.not.required.password.no.username/response" })
    public void realmAuthCredNotRequiredPasswordNoUsername() throws Exception {
       k3po.finish();
    }

    @Test
    @Specification({
       "realm.auth.cred.not.required.username.no.password/request",
       "realm.auth.cred.not.required.username.no.password/response" })
    public void realmAuthCredNotRequiredUsernameNoPasword() throws Exception {
       k3po.finish();
    }

    @Test
    @Specification({
       "norealm.auth.cred.not.required.correct.user/request",
       "norealm.auth.cred.not.required.correct.user/response" })
    public void norealmAuthCredNotRequiredCorrectUser() throws Exception {
       k3po.finish();
    }

    @Test
    @Specification({
       "norealm.auth.cred.not.required.incorrect.user/request",
       "norealm.auth.cred.not.required.incorrect.user/response" })
    public void norealmAuthCredNotRequiredIncorrectUser() throws Exception {
       k3po.finish();
    }

    @Test
    @Specification({
       "norealm.auth.cred.not.required.password.no.username/request",
       "norealm.auth.cred.not.required.password.no.username/response" })
    public void norealmAuthCredNotRequiredPasswordNoUsername() throws Exception {
       k3po.finish();
    }

    @Test
    @Specification({
       "norealm.auth.cred.not.required.username.no.password/request",
       "norealm.auth.cred.not.required.username.no.password/response" })
    public void norealmAuthCredNotRequiredUsernameNoPassword() throws Exception {
       k3po.finish();
    }

    @Test
    @Specification({
       "norealm.auth.cred.required.correct.user/request",
       "norealm.auth.cred.required.correct.user/response" })
    public void norealmAuthCredRequiredCorrectUser() throws Exception {
       k3po.finish();
    }

    @Test
    @Specification({
       "norealm.auth.cred.required.incorrect.user/request",
       "norealm.auth.cred.required.incorrect.user/response" })
    public void norealmAuthCredRequiredIncorrectUser() throws Exception {
       k3po.finish();
    }

    @Test
    @Specification({
       "norealm.auth.cred.required.password.no.username/request",
       "norealm.auth.cred.required.password.no.username/response" })
    public void norealmAuthCredRequiredPasswordNoUsername() throws Exception {
       k3po.finish();
    }

    @Test
    @Specification({
       "norealm.auth.cred.required.username.no.password/request",
       "norealm.auth.cred.required.username.no.password/response" })
    public void norealmAuthCredRequiredUsernameNoPassword() throws Exception {
       k3po.finish();
    }

    @Test
    @Specification({
       "test.with.no.authorization.constraints.admin/request",
       "test.with.no.authorization.constraints.admin/response" })
    public void testWithNoAuthorizationConstraintsAdmin() throws Exception {
       k3po.finish();
    }

    @Test
    @Specification({
       "test.with.no.authorization.constraints.authorized/request",
       "test.with.no.authorization.constraints.authorized/response" })
    public void testWithNoAuthorizationConstraintsAuthorized() throws Exception {
       k3po.finish();
    }

    @Test
    @Specification({
       "with.www.authenticate.and.different.authorizations/request",
       "with.www.authenticate.and.different.authorizations/response" })
    public void withWWWAuthenticateAndDifferentAuthorizations() throws Exception {
       k3po.finish();
    }

}
