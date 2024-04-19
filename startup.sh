# Check if the file exists
if [ ! -f "pom.xml" ]; then
    echo "Error: 'pom.xml' file not found."
    exit 1
fi

# Extract the value of the second <version> tag
# version=$(grep -oP '<version>\K[^<]+' pom.xml)
# version=$(sed -n 's|<version>\(.*\)</version>|\1|p' pom.xml | sed -n '2p')
version=$(sed -n 's|<version>\(.*\)</version>|\1|p' pom.xml | sed -n '2p' | awk '{$1=$1};1')

# Print the result
echo "The value of the second version tag is: $version"

java -jar "target/j-lawyer-ai-$version.war"