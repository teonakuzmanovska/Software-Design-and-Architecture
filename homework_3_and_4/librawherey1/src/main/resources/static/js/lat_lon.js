function displayLibraries()
{
    var selectedSchool = document.getElementById("options").value

    var latIndex = selectedSchool.indexOf("lat=")
    var lonIndex = selectedSchool.indexOf("lon=")

    var lat = parseFloat(selectedSchool.substring(latIndex+4, latIndex+14))
    var lon = parseFloat(selectedSchool.substring(lonIndex+4, lonIndex+14))

    console.log(lat)
    console.log(lon)

    document.getElementById("form").innerHTML += "<input type='hidden' name='lat' th:value="+lat+">" +
        "<input type='hidden' name='lon' th:value="+lon+">"
}