<?php
function getIP(){
        // here we check if the user is coming through a proxy
        // NOTE: Does not always work as proxies are not required
        // to provide this information
        if (isset($_SERVER["HTTP_X_FORWARDED_FOR"])){
                //reg ex pattern
                $pattern = "/^(([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]).){3}([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$/";
                // now we need to check for a valid format
                if(preg_match($pattern, $_SERVER["HTTP_X_FORWARDED_FOR"])){
                        //valid format so grab it
                        $userIP = $_SERVER["HTTP_X_FORWARDED_FOR"];
                }else{
                        //invalid (proxy provided some bogus value
                        //so just use REMOTE_ADDR and hope for the best
                        $userIP = $_SERVER["REMOTE_ADDR"];
                }               
        }
        //not coming through a proxy (or the proxy
        //didnt provide the original IP)
        else{
                //grab the IP
                $userIP = $_SERVER["REMOTE_ADDR"];
        } 
        //return the IP address
        return $userIP;
}

$ip=getIP();
 function ip_details($ip) {
    $json = file_get_contents("http://ipinfo.io/{$ip}");
    $details = json_decode($json);
    return $details;
}

$details = ip_details('24.138.16.34');

echo $details->city;     // => Mountain View
echo $details->country;  // => US


$city=array('261'=>'Bedford','268'=>'Broadview','332'=>'Broadview Heights','333'=>'Brooklyn',
'339'=>'Canton','341'=>'Euclid','342'=>'Garfield Heights','343'=>'Lorain',
'344'=>'Lutheran','346'=>'Macedonia','347'=>'Mentor','348'=>'Middleburg Heights',
'352'=>'Midtown','353'=>'North Royalton','354'=>'Norton','355'=>'Puritas','357'=>'Strongsville');
echo $city['261'];
