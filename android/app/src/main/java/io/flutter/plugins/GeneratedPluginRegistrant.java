package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.shim.ShimPluginRegistry;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    ShimPluginRegistry shimPluginRegistry = new ShimPluginRegistry(flutterEngine);
    flutterEngine.getPlugins().add(new xyz.luan.audioplayers.AudioplayersPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.deviceinfo.DeviceInfoPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin());
      com.aloisdeniel.geocoder.GeocoderPlugin.registerWith(shimPluginRegistry.registrarFor("com.aloisdeniel.geocoder.GeocoderPlugin"));
    flutterEngine.getPlugins().add(new com.baseflow.geolocator.GeolocatorPlugin());
    flutterEngine.getPlugins().add(new com.baseflow.googleapiavailability.GoogleApiAvailabilityPlugin());
    flutterEngine.getPlugins().add(new io.github.zeshuaro.google_api_headers.GoogleApiHeadersPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.googlemaps.GoogleMapsPlugin());
    flutterEngine.getPlugins().add(new com.lyokone.location.LocationPlugin());
    flutterEngine.getPlugins().add(new com.baseflow.location_permissions.LocationPermissionsPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.packageinfo.PackageInfoPlugin());
    flutterEngine.getPlugins().add(new dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.pathprovider.PathProviderPlugin());
    flutterEngine.getPlugins().add(new com.baseflow.permissionhandler.PermissionHandlerPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin());
    flutterEngine.getPlugins().add(new com.tekartik.sqflite.SqflitePlugin());
  }
}
