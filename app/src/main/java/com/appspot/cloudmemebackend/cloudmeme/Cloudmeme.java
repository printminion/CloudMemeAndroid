/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-02-14 18:40:25 UTC)
 * on 2014-03-17 at 22:35:45 UTC 
 * Modify at your own risk.
 */

package com.appspot.cloudmemebackend.cloudmeme;

/**
 * Service definition for Cloudmeme (v1).
 *
 * <p>
 * Meme API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link CloudmemeRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Cloudmeme extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

    // Note: Leave this static initializer at the top of the file.
    static {
        com.google.api.client.util.Preconditions.checkState(
                com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
                        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
                "You are currently running with version %s of google-api-client. " +
                        "You need at least version 1.15 of google-api-client to run version " +
                        "1.17.0-rc of the cloudmeme library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
    }

    /**
     * The default encoded root URL of the service. This is determined when the library is generated
     * and normally should not be changed.
     *
     * @since 1.7
     */
    public static final String DEFAULT_ROOT_URL = "https://static-dot-cloudmemebackend.appspot.com/_ah/api/";

    /**
     * The default encoded service path of the service. This is determined when the library is
     * generated and normally should not be changed.
     *
     * @since 1.7
     */
    public static final String DEFAULT_SERVICE_PATH = "cloudmeme/v1/";

    /**
     * The default encoded base URL of the service. This is determined when the library is generated
     * and normally should not be changed.
     */
    public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

    /**
     * Constructor.
     *
     * <p>
     * Use {@link Builder} if you need to specify any of the optional parameters.
     * </p>
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Cloudmeme(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
                     com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
        this(new Builder(transport, jsonFactory, httpRequestInitializer));
    }

    /**
     * @param builder builder
     */
    Cloudmeme(Builder builder) {
        super(builder);
    }

    @Override
    protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
        super.initialize(httpClientRequest);
    }

    /**
     * An accessor for creating requests from the Memes collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code Cloudmeme cloudmeme = new Cloudmeme(...);}
     *   {@code Cloudmeme.Memes.List request = cloudmeme.memes().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Memes memes() {
        return new Memes();
    }

    /**
     * The "memes" collection of methods.
     */
    public class Memes {

        /**
         * Create a request for the method "memes.create".
         *
         * This request holds the parameters needed by the cloudmeme server.  After setting any optional
         * parameters, call the {@link Create#execute()} method to invoke the remote operation.
         *
         * @param content the {@link com.appspot.cloudmemebackend.cloudmeme.model.CloudMemeMeme}
         * @return the request
         */
        public Create create(com.appspot.cloudmemebackend.cloudmeme.model.CloudMemeMeme content) throws java.io.IOException {
            Create result = new Create(content);
            initialize(result);
            return result;
        }

        public class Create extends CloudmemeRequest<com.appspot.cloudmemebackend.cloudmeme.model.CloudMemeMeme> {

            private static final String REST_PATH = "cloudmeme";

            /**
             * Create a request for the method "memes.create".
             *
             * This request holds the parameters needed by the the cloudmeme server.  After setting any
             * optional parameters, call the {@link Create#execute()} method to invoke the remote operation.
             * <p> {@link
             * Create#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param content the {@link com.appspot.cloudmemebackend.cloudmeme.model.CloudMemeMeme}
             * @since 1.13
             */
            protected Create(com.appspot.cloudmemebackend.cloudmeme.model.CloudMemeMeme content) {
                super(Cloudmeme.this, "POST", REST_PATH, content, com.appspot.cloudmemebackend.cloudmeme.model.CloudMemeMeme.class);
            }

            @Override
            public Create setAlt(java.lang.String alt) {
                return (Create) super.setAlt(alt);
            }

            @Override
            public Create setFields(java.lang.String fields) {
                return (Create) super.setFields(fields);
            }

            @Override
            public Create setKey(java.lang.String key) {
                return (Create) super.setKey(key);
            }

            @Override
            public Create setOauthToken(java.lang.String oauthToken) {
                return (Create) super.setOauthToken(oauthToken);
            }

            @Override
            public Create setPrettyPrint(java.lang.Boolean prettyPrint) {
                return (Create) super.setPrettyPrint(prettyPrint);
            }

            @Override
            public Create setQuotaUser(java.lang.String quotaUser) {
                return (Create) super.setQuotaUser(quotaUser);
            }

            @Override
            public Create setUserIp(java.lang.String userIp) {
                return (Create) super.setUserIp(userIp);
            }

            @Override
            public Create set(String parameterName, Object value) {
                return (Create) super.set(parameterName, value);
            }
        }
        /**
         * Create a request for the method "memes.get".
         *
         * This request holds the parameters needed by the cloudmeme server.  After setting any optional
         * parameters, call the {@link Get#execute()} method to invoke the remote operation.
         *
         * @param id
         * @return the request
         */
        public Get get(java.lang.Integer id) throws java.io.IOException {
            Get result = new Get(id);
            initialize(result);
            return result;
        }

        public class Get extends CloudmemeRequest<com.appspot.cloudmemebackend.cloudmeme.model.CloudMemeMeme> {

            private static final String REST_PATH = "cloudmeme/{id}";

            /**
             * Create a request for the method "memes.get".
             *
             * This request holds the parameters needed by the the cloudmeme server.  After setting any
             * optional parameters, call the {@link Get#execute()} method to invoke the remote operation. <p>
             * {@link Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
             * must be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param id
             * @since 1.13
             */
            protected Get(java.lang.Integer id) {
                super(Cloudmeme.this, "GET", REST_PATH, null, com.appspot.cloudmemebackend.cloudmeme.model.CloudMemeMeme.class);
                this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
            }

            @Override
            public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
                return super.executeUsingHead();
            }

            @Override
            public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
                return super.buildHttpRequestUsingHead();
            }

            @Override
            public Get setAlt(java.lang.String alt) {
                return (Get) super.setAlt(alt);
            }

            @Override
            public Get setFields(java.lang.String fields) {
                return (Get) super.setFields(fields);
            }

            @Override
            public Get setKey(java.lang.String key) {
                return (Get) super.setKey(key);
            }

            @Override
            public Get setOauthToken(java.lang.String oauthToken) {
                return (Get) super.setOauthToken(oauthToken);
            }

            @Override
            public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
                return (Get) super.setPrettyPrint(prettyPrint);
            }

            @Override
            public Get setQuotaUser(java.lang.String quotaUser) {
                return (Get) super.setQuotaUser(quotaUser);
            }

            @Override
            public Get setUserIp(java.lang.String userIp) {
                return (Get) super.setUserIp(userIp);
            }

            @com.google.api.client.util.Key
            private java.lang.Integer id;

            /**

             */
            public java.lang.Integer getId() {
                return id;
            }

            public Get setId(java.lang.Integer id) {
                this.id = id;
                return this;
            }

            @Override
            public Get set(String parameterName, Object value) {
                return (Get) super.set(parameterName, value);
            }
        }
        /**
         * Create a request for the method "memes.list".
         *
         * This request holds the parameters needed by the cloudmeme server.  After setting any optional
         * parameters, call the {@link List#execute()} method to invoke the remote operation.
         *
         * @return the request
         */
        public List list() throws java.io.IOException {
            List result = new List();
            initialize(result);
            return result;
        }

        public class List extends CloudmemeRequest<com.appspot.cloudmemebackend.cloudmeme.model.CloudMemeMemeCollection> {

            private static final String REST_PATH = "cloudmeme";

            /**
             * Create a request for the method "memes.list".
             *
             * This request holds the parameters needed by the the cloudmeme server.  After setting any
             * optional parameters, call the {@link List#execute()} method to invoke the remote operation. <p>
             * {@link List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
             * must be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @since 1.13
             */
            protected List() {
                super(Cloudmeme.this, "GET", REST_PATH, null, com.appspot.cloudmemebackend.cloudmeme.model.CloudMemeMemeCollection.class);
            }

            @Override
            public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
                return super.executeUsingHead();
            }

            @Override
            public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
                return super.buildHttpRequestUsingHead();
            }

            @Override
            public List setAlt(java.lang.String alt) {
                return (List) super.setAlt(alt);
            }

            @Override
            public List setFields(java.lang.String fields) {
                return (List) super.setFields(fields);
            }

            @Override
            public List setKey(java.lang.String key) {
                return (List) super.setKey(key);
            }

            @Override
            public List setOauthToken(java.lang.String oauthToken) {
                return (List) super.setOauthToken(oauthToken);
            }

            @Override
            public List setPrettyPrint(java.lang.Boolean prettyPrint) {
                return (List) super.setPrettyPrint(prettyPrint);
            }

            @Override
            public List setQuotaUser(java.lang.String quotaUser) {
                return (List) super.setQuotaUser(quotaUser);
            }

            @Override
            public List setUserIp(java.lang.String userIp) {
                return (List) super.setUserIp(userIp);
            }

            @Override
            public List set(String parameterName, Object value) {
                return (List) super.set(parameterName, value);
            }
        }
        /**
         * Create a request for the method "memes.list_templates".
         *
         * This request holds the parameters needed by the cloudmeme server.  After setting any optional
         * parameters, call the {@link ListTemplates#execute()} method to invoke the remote operation.
         *
         * @return the request
         */
        public ListTemplates listTemplates() throws java.io.IOException {
            ListTemplates result = new ListTemplates();
            initialize(result);
            return result;
        }

        public class ListTemplates extends CloudmemeRequest<com.appspot.cloudmemebackend.cloudmeme.model.CloudMemeTemplateCollection> {

            private static final String REST_PATH = "cloudmeme/templates";

            /**
             * Create a request for the method "memes.list_templates".
             *
             * This request holds the parameters needed by the the cloudmeme server.  After setting any
             * optional parameters, call the {@link ListTemplates#execute()} method to invoke the remote
             * operation. <p> {@link ListTemplates#initialize(com.google.api.client.googleapis.services.Abstra
             * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
             * the constructor. </p>
             *
             * @since 1.13
             */
            protected ListTemplates() {
                super(Cloudmeme.this, "GET", REST_PATH, null, com.appspot.cloudmemebackend.cloudmeme.model.CloudMemeTemplateCollection.class);
            }

            @Override
            public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
                return super.executeUsingHead();
            }

            @Override
            public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
                return super.buildHttpRequestUsingHead();
            }

            @Override
            public ListTemplates setAlt(java.lang.String alt) {
                return (ListTemplates) super.setAlt(alt);
            }

            @Override
            public ListTemplates setFields(java.lang.String fields) {
                return (ListTemplates) super.setFields(fields);
            }

            @Override
            public ListTemplates setKey(java.lang.String key) {
                return (ListTemplates) super.setKey(key);
            }

            @Override
            public ListTemplates setOauthToken(java.lang.String oauthToken) {
                return (ListTemplates) super.setOauthToken(oauthToken);
            }

            @Override
            public ListTemplates setPrettyPrint(java.lang.Boolean prettyPrint) {
                return (ListTemplates) super.setPrettyPrint(prettyPrint);
            }

            @Override
            public ListTemplates setQuotaUser(java.lang.String quotaUser) {
                return (ListTemplates) super.setQuotaUser(quotaUser);
            }

            @Override
            public ListTemplates setUserIp(java.lang.String userIp) {
                return (ListTemplates) super.setUserIp(userIp);
            }

            @Override
            public ListTemplates set(String parameterName, Object value) {
                return (ListTemplates) super.set(parameterName, value);
            }
        }

    }

    /**
     * Builder for {@link Cloudmeme}.
     *
     * <p>
     * Implementation is not thread-safe.
     * </p>
     *
     * @since 1.3.0
     */
    public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

        /**
         * Returns an instance of a new builder.
         *
         * @param transport HTTP transport, which should normally be:
         *        <ul>
         *        <li>Google App Engine:
         *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
         *        <li>Android: {@code newCompatibleTransport} from
         *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
         *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
         *        </li>
         *        </ul>
         * @param jsonFactory JSON factory, which may be:
         *        <ul>
         *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
         *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
         *        <li>Android Honeycomb or higher:
         *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
         *        </ul>
         * @param httpRequestInitializer HTTP request initializer or {@code null} for none
         * @since 1.7
         */
        public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
                       com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
            super(
                    transport,
                    jsonFactory,
                    DEFAULT_ROOT_URL,
                    DEFAULT_SERVICE_PATH,
                    httpRequestInitializer,
                    false);
        }

        /** Builds a new instance of {@link Cloudmeme}. */
        @Override
        public Cloudmeme build() {
            return new Cloudmeme(this);
        }

        @Override
        public Builder setRootUrl(String rootUrl) {
            return (Builder) super.setRootUrl(rootUrl);
        }

        @Override
        public Builder setServicePath(String servicePath) {
            return (Builder) super.setServicePath(servicePath);
        }

        @Override
        public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
            return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
        }

        @Override
        public Builder setApplicationName(String applicationName) {
            return (Builder) super.setApplicationName(applicationName);
        }

        @Override
        public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
            return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
        }

        @Override
        public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
            return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
        }

        @Override
        public Builder setSuppressAllChecks(boolean suppressAllChecks) {
            return (Builder) super.setSuppressAllChecks(suppressAllChecks);
        }

        /**
         * Set the {@link CloudmemeRequestInitializer}.
         *
         * @since 1.12
         */
        public Builder setCloudmemeRequestInitializer(
                CloudmemeRequestInitializer cloudmemeRequestInitializer) {
            return (Builder) super.setGoogleClientRequestInitializer(cloudmemeRequestInitializer);
        }

        @Override
        public Builder setGoogleClientRequestInitializer(
                com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
            return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
        }
    }
}
