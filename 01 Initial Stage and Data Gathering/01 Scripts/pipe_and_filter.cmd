osmfilter skopje.osm --keep="amenity=library" | osmconvert - --all-to-nodes --csv="name addr:city addr:street opening_hours phone @lat @lon" --csv-headline --csv-separator="," -o="skopje_libraries.csv"

osmfilter skopje.osm --keep="amenity=school" | osmconvert - --all-to-nodes --csv="name addr:city addr:street opening_hours phone @lat @lon" --csv-headline --csv-separator="," -o="skopje_schools.csv"
