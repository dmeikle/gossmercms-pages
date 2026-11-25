CREATE TABLE page_section_includes (
    "id" UUID PRIMARY KEY,
    "sectionId" UUID NOT NULL,
    "sortOrder" INTEGER NOT NULL DEFAULT 0,
    "text" VARCHAR NOT NULL,
    "deletedAt" TIMESTAMP,
    "createdAt" TIMESTAMP DEFAULT NOW(),
    "updatedAt" TIMESTAMP DEFAULT NOW(),
    CONSTRAINT "fk_page_section_includes_sectionId" FOREIGN KEY ("sectionId") REFERENCES "page_sections" ("id")
);
CREATE INDEX "idx_page_section_includes_sectionId" ON page_section_includes ("sectionId", "sortOrder");
