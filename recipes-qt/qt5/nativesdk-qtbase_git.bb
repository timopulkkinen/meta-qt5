require qt5-git.inc
require ${PN}.inc

# prepend this again, because ${PN}.inc prepneds ${PN}
FILESEXTRAPATHS =. "${FILE_DIRNAME}/${BPN}-git:"

SRC_URI = "\
    git://qt.gitorious.org/qt/${QT_MODULE}.git;branch=${QT_MODULE_BRANCH} \
"

# common with -native and -nativesdk
SRC_URI += "\
    file://0001-Add-linux-oe-g-platform.patch \
    file://0002-qlibraryinfo-allow-to-set-qt.conf-from-the-outside-u.patch \
    file://0003-Add-external-hostbindir-option.patch \
    file://0004-configureapp-Prefix-default-LIBDIRS-and-INCDIRS-with.patch \
    file://0005-qt_module-Fix-pkgconfig-and-libtool-replacements.patch \
    file://0006-Revert-eglfs-Print-the-chosen-config-in-debug-mode.patch \
    file://0007-qeglplatformintegration-Undefine-CursorShape-from-X..patch \
    file://0008-configure-bump-path-length-from-256-to-512-character.patch \
    file://0009-eglfs-fix-egl-error-for-platforms-only-supporting-on.patch \
    file://0010-Revert-Use-the-gcc-feature-in-simd.prf.patch \
"

# common with -native version
SRC_URI += " \
    file://0011-Always-build-uic.patch \
"    

# specific for nativesdk version
SRC_URI += " \
    file://0012-configure-preserve-built-qmake-and-swap-with-native-.patch \
"

SRCREV = "80b6fbc2d9dfc753d6570e971aa4cf4f3420585c"
