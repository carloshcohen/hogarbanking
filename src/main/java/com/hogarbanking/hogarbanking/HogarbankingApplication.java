package com.hogarbanking.hogarbanking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HogarbankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HogarbankingApplication.class, args);
	}

}



//
//
//The default interactive shell is now zsh.
//		To update your account to use zsh, please run `chsh -s /bin/zsh`.
//		For more details, please visit https://support.apple.com/kb/HT208050.
//		Charlys-MacBook-Pro:hogarbanking carloshernancohen$ mvn clean install
//		[INFO] Scanning for projects...
//		[INFO]
//		[INFO] -------------------< com.hogarbanking:hogarbanking >--------------------
//		[INFO] Building hogarbanking 0.0.1-SNAPSHOT
//		[INFO] --------------------------------[ jar ]---------------------------------
//		[INFO]
//		[INFO] --- maven-clean-plugin:3.2.0:clean (default-clean) @ hogarbanking ---
//		[INFO] Deleting /Users/carloshernancohen/Desktop/CODO a CODO/Spring2023/hogarbanking/target
//		[INFO]
//		[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ hogarbanking ---
//		[INFO] Copying 1 resource from src/main/resources to target/classes
//		[INFO] Copying 0 resource from src/main/resources to target/classes
//		[INFO]
//		[INFO] --- maven-compiler-plugin:3.10.1:compile (default-compile) @ hogarbanking ---
//		[INFO] Changes detected - recompiling the module!
//		[INFO] Compiling 3 source files to /Users/carloshernancohen/Desktop/CODO a CODO/Spring2023/hogarbanking/target/classes
//		[INFO]
//		[INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ hogarbanking ---
//		[INFO] skip non existing resourceDirectory /Users/carloshernancohen/Desktop/CODO a CODO/Spring2023/hogarbanking/src/test/resources
//		[INFO]
//		[INFO] --- maven-compiler-plugin:3.10.1:testCompile (default-testCompile) @ hogarbanking ---
//		[INFO] Changes detected - recompiling the module!
//		[INFO] Compiling 1 source file to /Users/carloshernancohen/Desktop/CODO a CODO/Spring2023/hogarbanking/target/test-classes
//		[INFO]
//		[INFO] --- maven-surefire-plugin:2.22.2:test (default-test) @ hogarbanking ---
//		[INFO]
//		[INFO] -------------------------------------------------------
//		[INFO]  T E S T S
//		[INFO] -------------------------------------------------------
//		[INFO]
//		[INFO] Results:
//		[INFO]
//		[INFO] Tests run: 0, Failures: 0, Errors: 0, Skipped: 0
//		[INFO]
//		[INFO]
//		[INFO] --- maven-jar-plugin:3.3.0:jar (default-jar) @ hogarbanking ---
//		[INFO] Building jar: /Users/carloshernancohen/Desktop/CODO a CODO/Spring2023/hogarbanking/target/hogarbanking-0.0.1-SNAPSHOT.jar
//		[INFO]
//		[INFO] --- spring-boot-maven-plugin:3.0.6:repackage (repackage) @ hogarbanking ---
//		[WARNING] Error injecting: org.springframework.boot.maven.RepackageMojo
//		java.lang.TypeNotPresentException: Type org.springframework.boot.maven.RepackageMojo not present
//		at org.eclipse.sisu.space.URLClassSpace.loadClass (URLClassSpace.java:147)
//		at org.eclipse.sisu.space.NamedClass.load (NamedClass.java:46)
//		at org.eclipse.sisu.space.AbstractDeferredClass.get (AbstractDeferredClass.java:48)
//		at com.google.inject.internal.ProviderInternalFactory.provision (ProviderInternalFactory.java:85)
//		at com.google.inject.internal.InternalFactoryToInitializableAdapter.provision (InternalFactoryToInitializableAdapter.java:57)
//		at com.google.inject.internal.ProviderInternalFactory$1.call (ProviderInternalFactory.java:66)
//		at com.google.inject.internal.ProvisionListenerStackCallback$Provision.provision (ProvisionListenerStackCallback.java:112)
//		at com.google.inject.internal.ProvisionListenerStackCallback$Provision.provision (ProvisionListenerStackCallback.java:127)
//		at com.google.inject.internal.ProvisionListenerStackCallback.provision (ProvisionListenerStackCallback.java:66)
//		at com.google.inject.internal.ProviderInternalFactory.circularGet (ProviderInternalFactory.java:61)
//		at com.google.inject.internal.InternalFactoryToInitializableAdapter.get (InternalFactoryToInitializableAdapter.java:47)
//		at com.google.inject.internal.InjectorImpl$1.get (InjectorImpl.java:1050)
//		at org.eclipse.sisu.inject.Guice4$1.get (Guice4.java:162)
//		at org.eclipse.sisu.inject.LazyBeanEntry.getValue (LazyBeanEntry.java:81)
//		at org.eclipse.sisu.plexus.LazyPlexusBean.getValue (LazyPlexusBean.java:51)
//		at org.codehaus.plexus.DefaultPlexusContainer.lookup (DefaultPlexusContainer.java:263)
//		at org.codehaus.plexus.DefaultPlexusContainer.lookup (DefaultPlexusContainer.java:255)
//		at org.apache.maven.plugin.internal.DefaultMavenPluginManager.getConfiguredMojo (DefaultMavenPluginManager.java:520)
//		at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo (DefaultBuildPluginManager.java:124)
//		at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:210)
//		at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:156)
//		at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:148)
//		at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:117)
//		at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:81)
//		at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:56)
//		at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:128)
//		at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:305)
//		at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:192)
//		at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:105)
//		at org.apache.maven.cli.MavenCli.execute (MavenCli.java:972)
//		at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:293)
//		at org.apache.maven.cli.MavenCli.main (MavenCli.java:196)
//		at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
//		at jdk.internal.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:78)
//		at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
//		at java.lang.reflect.Method.invoke (Method.java:567)
//		at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:282)
//		at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:225)
//		at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:406)
//		at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:347)
//		Caused by: java.lang.UnsupportedClassVersionError: org/springframework/boot/maven/RepackageMojo has been compiled by a more recent version of the Java Runtime (class file version 61.0), this version of the Java Runtime only recognizes class file versions up to 60.0
//		at java.lang.ClassLoader.defineClass1 (Native Method)
//		at java.lang.ClassLoader.defineClass (ClassLoader.java:1010)
//		at java.security.SecureClassLoader.defineClass (SecureClassLoader.java:150)
//		at java.net.URLClassLoader.defineClass (URLClassLoader.java:512)
//		at java.net.URLClassLoader$1.run (URLClassLoader.java:420)
//		at java.net.URLClassLoader$1.run (URLClassLoader.java:414)
//		at java.security.AccessController.doPrivileged (AccessController.java:691)
//		at java.net.URLClassLoader.findClass (URLClassLoader.java:413)
//		at org.codehaus.plexus.classworlds.realm.ClassRealm.loadClassFromSelf (ClassRealm.java:425)
//		at org.codehaus.plexus.classworlds.strategy.SelfFirstStrategy.loadClass (SelfFirstStrategy.java:42)
//		at org.codehaus.plexus.classworlds.realm.ClassRealm.unsynchronizedLoadClass (ClassRealm.java:271)
//		at org.codehaus.plexus.classworlds.realm.ClassRealm.loadClass (ClassRealm.java:247)
//		at org.codehaus.plexus.classworlds.realm.ClassRealm.loadClass (ClassRealm.java:239)
//		at org.eclipse.sisu.space.URLClassSpace.loadClass (URLClassSpace.java:139)
//		at org.eclipse.sisu.space.NamedClass.load (NamedClass.java:46)
//		at org.eclipse.sisu.space.AbstractDeferredClass.get (AbstractDeferredClass.java:48)
//		at com.google.inject.internal.ProviderInternalFactory.provision (ProviderInternalFactory.java:85)
//		at com.google.inject.internal.InternalFactoryToInitializableAdapter.provision (InternalFactoryToInitializableAdapter.java:57)
//		at com.google.inject.internal.ProviderInternalFactory$1.call (ProviderInternalFactory.java:66)
//		at com.google.inject.internal.ProvisionListenerStackCallback$Provision.provision (ProvisionListenerStackCallback.java:112)
//		at com.google.inject.internal.ProvisionListenerStackCallback$Provision.provision (ProvisionListenerStackCallback.java:127)
//		at com.google.inject.internal.ProvisionListenerStackCallback.provision (ProvisionListenerStackCallback.java:66)
//		at com.google.inject.internal.ProviderInternalFactory.circularGet (ProviderInternalFactory.java:61)
//		at com.google.inject.internal.InternalFactoryToInitializableAdapter.get (InternalFactoryToInitializableAdapter.java:47)
//		at com.google.inject.internal.InjectorImpl$1.get (InjectorImpl.java:1050)
//		at org.eclipse.sisu.inject.Guice4$1.get (Guice4.java:162)
//		at org.eclipse.sisu.inject.LazyBeanEntry.getValue (LazyBeanEntry.java:81)
//		at org.eclipse.sisu.plexus.LazyPlexusBean.getValue (LazyPlexusBean.java:51)
//		at org.codehaus.plexus.DefaultPlexusContainer.lookup (DefaultPlexusContainer.java:263)
//		at org.codehaus.plexus.DefaultPlexusContainer.lookup (DefaultPlexusContainer.java:255)
//		at org.apache.maven.plugin.internal.DefaultMavenPluginManager.getConfiguredMojo (DefaultMavenPluginManager.java:520)
//		at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo (DefaultBuildPluginManager.java:124)
//		at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:210)
//		at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:156)
//		at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:148)
//		at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:117)
//		at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:81)
//		at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:56)
//		at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:128)
//		at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:305)
//		at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:192)
//		at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:105)
//		at org.apache.maven.cli.MavenCli.execute (MavenCli.java:972)
//		at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:293)
//		at org.apache.maven.cli.MavenCli.main (MavenCli.java:196)
//		at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
//		at jdk.internal.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:78)
//		at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
//		at java.lang.reflect.Method.invoke (Method.java:567)
//		at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:282)
//		at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:225)
//		at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:406)
//		at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:347)
//		[INFO] ------------------------------------------------------------------------
//		[INFO] BUILD FAILURE
//		[INFO] ------------------------------------------------------------------------
//		[INFO] Total time:  3.986 s
//		[INFO] Finished at: 2023-05-18T08:07:29-03:00
//		[INFO] ------------------------------------------------------------------------
//		[ERROR] Failed to execute goal org.springframework.boot:spring-boot-maven-plugin:3.0.6:repackage (repackage) on project hogarbanking: Execution repackage of goal org.springframework.boot:spring-boot-maven-plugin:3.0.6:repackage failed: Unable to load the mojo 'repackage' in the plugin 'org.springframework.boot:spring-boot-maven-plugin:3.0.6' due to an API incompatibility: org.codehaus.plexus.component.repository.exception.ComponentLookupException: org/springframework/boot/maven/RepackageMojo has been compiled by a more recent version of the Java Runtime (class file version 61.0), this version of the Java Runtime only recognizes class file versions up to 60.0
//		[ERROR] -----------------------------------------------------
//		[ERROR] realm =    plugin>org.springframework.boot:spring-boot-maven-plugin:3.0.6
//		[ERROR] strategy = org.codehaus.plexus.classworlds.strategy.SelfFirstStrategy
//		[ERROR] urls[0] = file:/Users/carloshernancohen/.m2/repository/org/springframework/boot/spring-boot-maven-plugin/3.0.6/spring-boot-maven-plugin-3.0.6.jar
//		[ERROR] urls[1] = file:/Users/carloshernancohen/.m2/repository/org/springframework/spring-context/6.0.8/spring-context-6.0.8.jar
//		[ERROR] urls[2] = file:/Users/carloshernancohen/.m2/repository/org/springframework/spring-aop/6.0.8/spring-aop-6.0.8.jar
//		[ERROR] urls[3] = file:/Users/carloshernancohen/.m2/repository/org/springframework/spring-beans/6.0.8/spring-beans-6.0.8.jar
//		[ERROR] urls[4] = file:/Users/carloshernancohen/.m2/repository/org/springframework/spring-core/6.0.8/spring-core-6.0.8.jar
//		[ERROR] urls[5] = file:/Users/carloshernancohen/.m2/repository/org/springframework/spring-jcl/6.0.8/spring-jcl-6.0.8.jar
//		[ERROR] urls[6] = file:/Users/carloshernancohen/.m2/repository/org/springframework/spring-expression/6.0.8/spring-expression-6.0.8.jar
//		[ERROR] urls[7] = file:/Users/carloshernancohen/.m2/repository/org/springframework/boot/spring-boot-buildpack-platform/3.0.6/spring-boot-buildpack-platform-3.0.6.jar
//		[ERROR] urls[8] = file:/Users/carloshernancohen/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.14.2/jackson-databind-2.14.2.jar
//		[ERROR] urls[9] = file:/Users/carloshernancohen/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.14.2/jackson-annotations-2.14.2.jar
//		[ERROR] urls[10] = file:/Users/carloshernancohen/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.14.2/jackson-core-2.14.2.jar
//		[ERROR] urls[11] = file:/Users/carloshernancohen/.m2/repository/com/fasterxml/jackson/module/jackson-module-parameter-names/2.14.2/jackson-module-parameter-names-2.14.2.jar
//		[ERROR] urls[12] = file:/Users/carloshernancohen/.m2/repository/net/java/dev/jna/jna-platform/5.7.0/jna-platform-5.7.0.jar
//		[ERROR] urls[13] = file:/Users/carloshernancohen/.m2/repository/net/java/dev/jna/jna/5.7.0/jna-5.7.0.jar
//		[ERROR] urls[14] = file:/Users/carloshernancohen/.m2/repository/org/apache/commons/commons-compress/1.21/commons-compress-1.21.jar
//		[ERROR] urls[15] = file:/Users/carloshernancohen/.m2/repository/org/apache/httpcomponents/httpclient/4.5.14/httpclient-4.5.14.jar
//		[ERROR] urls[16] = file:/Users/carloshernancohen/.m2/repository/org/apache/httpcomponents/httpcore/4.4.16/httpcore-4.4.16.jar
//		[ERROR] urls[17] = file:/Users/carloshernancohen/.m2/repository/commons-codec/commons-codec/1.11/commons-codec-1.11.jar
//		[ERROR] urls[18] = file:/Users/carloshernancohen/.m2/repository/org/tomlj/tomlj/1.0.0/tomlj-1.0.0.jar
//		[ERROR] urls[19] = file:/Users/carloshernancohen/.m2/repository/org/antlr/antlr4-runtime/4.7.2/antlr4-runtime-4.7.2.jar
//		[ERROR] urls[20] = file:/Users/carloshernancohen/.m2/repository/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.jar
//		[ERROR] urls[21] = file:/Users/carloshernancohen/.m2/repository/org/springframework/boot/spring-boot-loader-tools/3.0.6/spring-boot-loader-tools-3.0.6.jar
//		[ERROR] urls[22] = file:/Users/carloshernancohen/.m2/repository/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-build-api-0.0.7.jar
//		[ERROR] urls[23] = file:/Users/carloshernancohen/.m2/repository/org/codehaus/plexus/plexus-utils/1.5.8/plexus-utils-1.5.8.jar
//		[ERROR] urls[24] = file:/Users/carloshernancohen/.m2/repository/org/apache/maven/plugins/maven-shade-plugin/3.2.4/maven-shade-plugin-3.2.4.jar
//		[ERROR] urls[25] = file:/Users/carloshernancohen/.m2/repository/org/sonatype/sisu/sisu-inject-bean/1.4.2/sisu-inject-bean-1.4.2.jar
//		[ERROR] urls[26] = file:/Users/carloshernancohen/.m2/repository/org/sonatype/sisu/sisu-guice/2.1.7/sisu-guice-2.1.7-noaop.jar
//		[ERROR] urls[27] = file:/Users/carloshernancohen/.m2/repository/org/sonatype/aether/aether-util/1.7/aether-util-1.7.jar
//		[ERROR] urls[28] = file:/Users/carloshernancohen/.m2/repository/org/codehaus/plexus/plexus-interpolation/1.14/plexus-interpolation-1.14.jar
//		[ERROR] urls[29] = file:/Users/carloshernancohen/.m2/repository/org/codehaus/plexus/plexus-component-annotations/1.5.5/plexus-component-annotations-1.5.5.jar
//		[ERROR] urls[30] = file:/Users/carloshernancohen/.m2/repository/org/sonatype/plexus/plexus-sec-dispatcher/1.3/plexus-sec-dispatcher-1.3.jar
//		[ERROR] urls[31] = file:/Users/carloshernancohen/.m2/repository/org/sonatype/plexus/plexus-cipher/1.4/plexus-cipher-1.4.jar
//		[ERROR] urls[32] = file:/Users/carloshernancohen/.m2/repository/org/apache/maven/shared/maven-artifact-transfer/0.12.0/maven-artifact-transfer-0.12.0.jar
//		[ERROR] urls[33] = file:/Users/carloshernancohen/.m2/repository/org/apache/maven/shared/maven-common-artifact-filters/3.0.1/maven-common-artifact-filters-3.0.1.jar
//		[ERROR] urls[34] = file:/Users/carloshernancohen/.m2/repository/org/apache/maven/shared/maven-shared-utils/3.1.0/maven-shared-utils-3.1.0.jar
//		[ERROR] urls[35] = file:/Users/carloshernancohen/.m2/repository/org/ow2/asm/asm/8.0/asm-8.0.jar
//		[ERROR] urls[36] = file:/Users/carloshernancohen/.m2/repository/org/ow2/asm/asm-commons/8.0/asm-commons-8.0.jar
//		[ERROR] urls[37] = file:/Users/carloshernancohen/.m2/repository/org/ow2/asm/asm-tree/8.0/asm-tree-8.0.jar
//		[ERROR] urls[38] = file:/Users/carloshernancohen/.m2/repository/org/ow2/asm/asm-analysis/8.0/asm-analysis-8.0.jar
//		[ERROR] urls[39] = file:/Users/carloshernancohen/.m2/repository/org/jdom/jdom2/2.0.6/jdom2-2.0.6.jar
//		[ERROR] urls[40] = file:/Users/carloshernancohen/.m2/repository/org/apache/maven/shared/maven-dependency-tree/3.0.1/maven-dependency-tree-3.0.1.jar
//		[ERROR] urls[41] = file:/Users/carloshernancohen/.m2/repository/org/eclipse/aether/aether-util/0.9.0.M2/aether-util-0.9.0.M2.jar
//		[ERROR] urls[42] = file:/Users/carloshernancohen/.m2/repository/commons-io/commons-io/2.6/commons-io-2.6.jar
//		[ERROR] urls[43] = file:/Users/carloshernancohen/.m2/repository/org/vafer/jdependency/2.4.0/jdependency-2.4.0.jar
//		[ERROR] urls[44] = file:/Users/carloshernancohen/.m2/repository/org/ow2/asm/asm-util/8.0/asm-util-8.0.jar
//		[ERROR] urls[45] = file:/Users/carloshernancohen/.m2/repository/com/google/guava/guava/28.2-android/guava-28.2-android.jar
//		[ERROR] urls[46] = file:/Users/carloshernancohen/.m2/repository/com/google/guava/failureaccess/1.0.1/failureaccess-1.0.1.jar
//		[ERROR] urls[47] = file:/Users/carloshernancohen/.m2/repository/com/google/guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar
//		[ERROR] urls[48] = file:/Users/carloshernancohen/.m2/repository/org/checkerframework/checker-compat-qual/2.5.5/checker-compat-qual-2.5.5.jar
//		[ERROR] urls[49] = file:/Users/carloshernancohen/.m2/repository/com/google/errorprone/error_prone_annotations/2.3.4/error_prone_annotations-2.3.4.jar
//		[ERROR] urls[50] = file:/Users/carloshernancohen/.m2/repository/com/google/j2objc/j2objc-annotations/1.3/j2objc-annotations-1.3.jar
//		[ERROR] urls[51] = file:/Users/carloshernancohen/.m2/repository/org/apache/commons/commons-lang3/3.7/commons-lang3-3.7.jar
//		[ERROR] Number of foreign imports: 1
//		[ERROR] import: Entry[import  from realm ClassRealm[maven.api, parent: null]]
//		[ERROR]
//		[ERROR] -----------------------------------------------------
//		[ERROR]
//		[ERROR] -> [Help 1]
//		[ERROR]
//		[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
//		[ERROR] Re-run Maven using the -X switch to enable full debug logging.
//		[ERROR]
//		[ERROR] For more information about the errors and possible solutions, please read the following articles:
//		[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/PluginContainerException
