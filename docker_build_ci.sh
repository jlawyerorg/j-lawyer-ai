#!/bin/bash

DATE=$(date '+%Y%m%d%H%M%S')
VERSION=22.04

# IMAGE="j-lawyer-ai"

TAG="${VERSION}.${DATE}"
VERSION_TAG="${IMAGE}:${TAG}"
LATEST_TAG="${IMAGE}:latest"

docker build --no-cache --build-arg UBUNTU_VERSION=${VERSION} -t "${VERSION_TAG}" -t "${LATEST_TAG}" .

docker push "${VERSION_TAG}"
docker push "${LATEST_TAG}"

echo "Container ${VERSION_TAG} and ${LATEST_TAG} successfully pushed"
