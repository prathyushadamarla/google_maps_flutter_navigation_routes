import 'package:google_maps_flutter/google_maps_flutter.dart';
import 'package:http/http.dart' as http;
import 'dart:convert';

const apiKey = "Your_API_Key Here";

class GoogleMapsServices {
  Future<String> getRouteCoordinates(LatLng l1, LatLng l2) async {
    String uri =
        "https://maps.googleapis.com/maps/api/directions/json?origin=${l1.latitude},${l1.longitude}&destination=${l2.latitude},${l2.longitude}&key=AIzaSyCx0vMhUb7tZsed83xAyJlIBrJx23AGeN8";

    /*var uri =
        'https://maps.googleapis.com/maps/api/directions/json?origin=$l1&destination=$l2&key=$apiKey;';*/
    print(uri);
    http.Response response = await http.get(Uri.parse(uri));
    Map values = jsonDecode(response.body);
    return values["routes"][0]["overview_polyline"]["points"];
  }
}
