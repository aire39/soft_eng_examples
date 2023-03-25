#pragma once

#include "Build.h"
#include "Repair.h"
#include "Restore.h"

class AbstractFactory : public Build, public Repair, public Restore
{
    public:
        virtual std::string GetFactoryName() = 0;
};
