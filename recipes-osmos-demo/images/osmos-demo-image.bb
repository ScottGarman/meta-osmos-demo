DESCRIPTION = "Osmos Demo Image - Contains a basic X11 environment that boots to a matchbox-terminal and allows you to run the Osmos game."

IMAGE_FEATURES += "splash package-management x11-base ssh-server-dropbear"

LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL += "mesa-demos libglu libxpm openal-soft libvorbis"
