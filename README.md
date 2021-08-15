# AppNew


Permisos
*ACCESS_COARSE_LOCATION
Proporciona una estimación de la ubicación del dispositivo, aproximadamente, en un rango de 1.6 km (1 milla).
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />

*ACCESS_FINE_LOCATION
Proporciona una estimación de la ubicación del dispositivo que sea lo más precisa posible, en general, en un rango aproximado de 50 m (160 ft) y, a veces, lo más precisa posible en un rango de unos metros (10 ft) o más.
<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />

*ACCESS_BACKGROUND_LOCATION
Permiso ACCESS_BACKGROUND_LOCATION en el manifiesto de tu app para solicitar acceso a la ubicación en segundo plano durante el tiempo de ejecución.

*CALL_PHONE
Permite que una aplicación inicie una llamada telefónica sin pasar por la interfaz de usuario del marcador para que el usuario confirme la llamada.
<uses-permission android:name="android.permission.CALL_PHONE" />


Implementación

*Glide admite la obtención, decodificación y visualización de imágenes fijas de video, imágenes y GIF animados.
implementation 'com.github.bumptech.glide:glide:3.7.0'

*Para utilizar ella figura de estadísticas (PieChart)
implementation 'com.github.PhilJay:MPAndroidChart:v3.1.0'

*Para los servicios de maps 
implementation 'com.google.android.gms:play-services-maps:17.0.1'

